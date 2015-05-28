package taskmanager;

import java.io.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * The Task Manager.
 * CLASS  : List.java
 * PURPOSE: This class is the managing data structure for the various
 *          user accounts that populate this program. In essence, it
 *          is a doubly circular linked list (DCLL). As a DCLL, it
 *          fully supports the ability to freely "switch" between user
 *          accounts.
 *          In addition to its core methods, it also contains wrapper methods
 *          that correspond to each functionality that the program supports.
 *          And most importantly, this class is home to the file input/output
 *          methods that allow for storing all user account information across
 *          all sessions.
 * 
 * @author Kathleen Tran
 */
public class List {
    private Node head;
    private int numberOfAccounts;

    
    /**
     * Method to load all saved accounts
     */
    public void loadAccounts() {
        boolean check = true;
        int uniqueAccountNumber = 1;
        
        while (check) {
            check = readAccount("Account"+uniqueAccountNumber+".txt");
            ++uniqueAccountNumber;
        }
    }
    
    
    
    /**
     * Method to add an account into the program at
     * the "end" of the doubly circular linked list
     * @param username
     * @param password
     */
    public void addAccount(String username, String password) {    
        if (head == null) {
            head = new Node(username, password);
            head.setNext(head);
            head.setPrevious(head);
        }
        else {
            Node temp = head.getPrevious();
            temp.setNext(new Node(username, password));
            temp.getNext().setPrevious(temp);
            temp = temp.getNext();
            temp.setNext(head);
            head.setPrevious(temp);
        }        
        numberOfAccounts += 1;
    }
    
    
    
    /**
     * Method to add tasks to the user account
     * @param username
     * @param list 1 - To Do, 2 - In Progress, 3 - Done
     * @param task
     * @return true if add was successful else false
     */
    public boolean addTask(String username, int list, String task) {
        switch (list) {
            case 1:
                return selectAccount(username).addTask(1, task);
            case 2:
                return selectAccount(username).addTask(2, task);
            case 3:
                return selectAccount(username).addTask(3, task);
            default:
                return false;
        }
    }
    
    
    
    /**
     * Method to validate user credentials for login
     * @param username
     * @param password
     * @return true if match else false
     */
    public boolean validLogin(String username, String password) {
        return validAccount(username) && selectAccount(username).getPassword().equals(password);
    }

    
    
    /**
     * Wrapper method to validate user supplied username
     * @param userInput of a username
     * @return true if found else false
     */
    public boolean validAccount(String userInput) {
        if (head == null)
            return false;
        return validAccount(head, userInput);
    } 
    
    /**
     * Method to validate user supplied username
     * @param head of list of accounts
     * @param userInput of a username
     * @return true if found else false
     */
    public boolean validAccount(Node head, String userInput) {
        Node temp = head;
        do {
            if (temp.getUsername().equals(userInput))
                return true;
            temp = temp.getNext();
        } while (temp != head);
        return false;
    }

    
    
    /**
     * Wrapper method to select the user supplied account
     * @param userInput of a username
     * @return Node that corresponds to the given account
     */
    public Node selectAccount(String userInput) {
        if (validAccount(userInput))
            return selectAccount(head, userInput);
        else {
            System.out.println("User account not found!");
            return null;
        }
    }    
    
    /**
     * Method to select the user supplied account
     * @param head of list of accounts
     * @param userInput of a username
     * @return Node that corresponds to the given account
     */
    private Node selectAccount(Node head, String userInput) {
        if (head == null)
            return head;
        else {
        Node temp = head;
            do {
                if (temp.getUsername().equals(userInput))
                    return temp;
                temp = temp.getNext();
            } while (temp != head);
        }
        return null;
    }

    
    
    /**
     * Wrapper method to display all accounts
     */
    public void displayAccounts() {
        if (head == null)
            return;
        displayAccounts(head);
    }

    /**
     * Method to display all accounts
     */
    private void displayAccounts(Node head) {
        Node temp = head;
        do {
            temp.displayCredentials();
            temp = temp.getNext();
        } while (temp != head);
    }
    
    
    
    /**
     * Wrapper method to display all accounts and their contents
     */
    public void displayAll() {
        if (head == null)
            return;
        displayAll(head);
    }
    
    /**
     * Method to display all accounts and their contents
     */
    private void displayAll(Node head) {
        Node temp = head;
        do {
            temp.displayCredentials();
            temp.displayTaskLists();
            System.out.println("\n\n");
            temp = temp.getNext();
        } while (temp != head);
    }

    
    
    /**
     * Wrapper method to save current state of all user accounts
     * @return true if data was present and saved else false
     */
    public boolean save() {
        if (head == null)
            return false;
        return saveAll(head, getNumberOfAccounts());
    }
    
    /**
     * Method to save current state of all user accounts
     * @param head of list of accounts
     */
    private boolean saveAll(Node head, int accountNumber) {
        Node temp = head;
        do {
            writeAccount(temp, "Account" + accountNumber + ".txt");
            accountNumber -= 1;
            temp = temp.getNext();
        } while (temp != head && accountNumber != 0);
        return true;
    }

    
    //****************** FILE INPUT & OUTPUT ******************//
    
    /**
     * Method to read all data from external file into program
     * @param fileName of external data file
     */
    private boolean readAccount(String fileName) {

        //Temporary fields to store incoming data
        String username = null;
        String password, task;
        
        FileReader fr;  
            
        try {
            fr = new FileReader(fileName);
            BufferedReader br;
            br = new BufferedReader(fr);
            String line = br.readLine();
            
            while (line != null) {
                if (line.equals("USERNAME:")) {
                    line = br.readLine();
                    username = line;
                }
                else if (line.equals("PASSWORD:")) {
                    line = br.readLine();
                    password = line;
                    
                    addAccount(username, password);  //Add account
                    setHead(selectAccount(username));
                }
                else if (line.equals("TO DO:")) {
                    line = br.readLine();
                    while (!line.equals("IN PROGRESS:")) {
                        task = line;
                        head.addTask(1, task);       //Add task to To Do list
                        line = br.readLine();
                    }
                }
                else {
                    while (!line.equals("DONE:")) {
                        task = line;
                        head.addTask(2, task);       //Add task to In Progress list
                        line = br.readLine();
                    }
                    line = br.readLine();
                    while (line != null) {
                        task = line;
                        head.addTask(3, task);       //Add task to Done list
                        line = br.readLine();
                    }
                }               
                line = br.readLine();
            }

            br.close();
            fr.close();            
        }
        catch (FileNotFoundException ex) {
            ex.getStackTrace();
            return false;
        }
        catch (IOException ex) {
            ex.getStackTrace();
            return false;
        }
        return true;
    }

    
    
    /**
     * Method to write all data from program into external file
     * @param fileName of external data file
     */
    private void writeAccount(Node head, String fileName) {

        Set setOfToDoTasks = head.getToDo().getListContainer().entrySet();
        Set setOfInProgTasks = head.getInProg().getListContainer().entrySet();
        Set setOfDoneTasks = head.getDone().getListContainer().entrySet();
        Iterator i = setOfToDoTasks.iterator();
        Iterator j = setOfInProgTasks.iterator();
        Iterator k = setOfDoneTasks.iterator();
        
        try {
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw;
            bw = new BufferedWriter(fw);
            
            bw.write("USERNAME:\n"+head.getUsername()+"\n");
            bw.write("PASSWORD:\n"+head.getPassword()+"\n");
            bw.write("TO DO:\n");
            while (i.hasNext()) {
                Map.Entry task = (Map.Entry) i.next();
                bw.write(task.getValue().toString()+"\n");
            }
            bw.write("IN PROGRESS:\n");
            while (j.hasNext()) {
                Map.Entry task = (Map.Entry) j.next();
                bw.write(task.getValue().toString()+"\n");
            }
            bw.write("DONE:\n");
            while (k.hasNext()) {
                Map.Entry task = (Map.Entry) k.next();
                bw.write(task.getValue().toString()+"\n");
            }
            
            bw.close();
        }
        catch (IOException ex) {
            ex.getStackTrace();
        }
    }

    
    //****************** GETTERS & SETTERS ******************//
    
    public Node getHead() { return head; }

    public void setHead(Node head) { this.head = head; }
    
    public int getNumberOfAccounts() { return numberOfAccounts; }
    
}
