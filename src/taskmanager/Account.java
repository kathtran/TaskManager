package taskmanager;

/**
 * The Task Manager.
 * CLASS  : Account.java
 * PURPOSE: This class simulates a single user account. It contains
 *          methods to support various functionalities that pertain
 *          to the expected capabilities of an account, such as
 *          validating the user login credentials, and managing the
 *          three corresponding task lists.
 *          
 * @author Kathleen Tran
 */
public class Account {
    private String username;
    private String password;
    private final ToDo toDo;
    private final InProg inProg;
    private final Done done;
    
    
    public Account() {
        this.username = null;
        this.password = null;
        this.toDo = new ToDo();
        this.inProg = new InProg();
        this.done = new Done();
    }
    
    
    /**
     * Constructor with arguments
     * @param username
     * @param password 
     */
    public Account(String username, String password) {
        this.username = username;
        this.password = password;
        this.toDo = new ToDo();
        this.inProg = new InProg();
        this.done = new Done();
    }

    
    
    /**
     * Method to validate user credentials for login
     * @param username
     * @param password
     * @return true if match else false
     */
    public boolean validLogin(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
    
    
    
    /**
     * Method to add a task to its designated list
     * @param list
     * @param task 
     * @return true if task successfully added else false
     */
    public boolean addTask(int list, String task) {
        if(toDo.validTask(task) || inProg.validTask(task) || done.validTask(task))
            return false;
        
        switch (list) {
            case 1:
                toDo.addTask(task);
                break;
            case 2:
                inProg.addTask(task);
                break;
            case 3:
                done.addTask(task);
                break;
            default:
                return false;
        }          
        return true;
    }
    
    
    
    /**
     * Method to find the list that the supplied task resides in
     * @param task
     * @return corresponding task list if found else null
     */
    public TaskList findTask(String task) {
        if (toDo.validTask(task))
            return toDo;
        else if (inProg.validTask(task))
            return inProg;
        else if (done.validTask(task))
            return done;
        else
            return null;
    }
    
    
    
    /**
     * Method to move a task into its subsequent location
     * @param task 
     * @return 0 if invalid task, 1 if exists in subsequent list, 2 if success
     */
    public int moveTask(String task) {
        TaskList matchedList = findTask(task);
        
        if (matchedList instanceof ToDo)
            return matchedList.moveTask(task, getInProg());
        else if (matchedList instanceof InProg)
            return matchedList.moveTask(task, getDone());
        else if (matchedList instanceof Done)
            return matchedList.moveTask(task, matchedList);
        else
            return 0;  //Task not found
    }
    
    
    
    /**
     * Method to remove a task
     * @param task 
     * @return true if deleted else false
     */
    public boolean deleteTask(String task) {
        return getDone().deleteTask(task);
    }
        
    
    
    /**
     * Method to permanently remove a task
     * @param task 
     * @return true if successfully removed else false
     */
    public boolean permanentlyDeleteTask(String task) {
        return done.permanentlyDeleteTask(task);
    }
    
    
    
    /**
     * Method to undo the most recent task deletion
     * @return true if successful else false
     */
    public boolean undoDeletion() {
        return done.undoDeletion();
    }
    
    
  
    /**
     * Method to display account username and password
     */
    public void displayCredentials() {
        System.out.println("USERNAME: "+this.getUsername());
        System.out.print("PASSWORD: ");
        
        //Get length of password and print out asterisks per letter instead
        int length = this.getPassword().length();
        for (int i = 0; i < length; ++i)
            System.out.print("*");
        System.out.print("\n\n");
    }
    
    
    
    /**
     * Method to display all task lists
     */
    public void displayTaskLists() {
        toDo.displayTasks();
        inProg.displayTasks();
        done.displayTasks();
    }
    
    
    //****************** GETTERS & SETTERS ******************//
    
    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }
    
    public ToDo getToDo() { return toDo; }

    public InProg getInProg() { return inProg; }

    public Done getDone() { return done; }
    
}
