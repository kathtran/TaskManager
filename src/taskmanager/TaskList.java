package taskmanager;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * The Task Manager.
 * CLASS  : TaskList.java
 * PURPOSE: This is the abstract base class that contains all general
 *          functionalities that each task list is expected to support.
 *          The HashMap class is heavily utilized as it is the structure
 *          used to store the tasks.
 * 
 * @author Kathleen Tran
 */
public abstract class TaskList {
    protected String listName;
    protected int numberOfTasks;
    protected HashMap listContainer;

    
    /**
     * Method to create a unique key from the supplied task name
     * @param taskName
     * @return unique key value
     */
    protected int createKey(String taskName) {
        int keyValue = 0;
        boolean checkForExistingKey;
        boolean checkForExistingValue = this.listContainer.containsValue(taskName);
        
        if (checkForExistingValue)
            return getKey(taskName);
        
        do {
            if (keyValue == 0) {
                for (int i = 0; i < taskName.length(); ++i) {
                    char digit = (char) (taskName.charAt(i) - '0');
                    keyValue += digit;
                }
            }
            else
                keyValue += '1';
            
            checkForExistingKey = this.listContainer.containsKey(keyValue);
            
        } while(checkForExistingKey );
        
        return keyValue;
    }
    
    
    
    /**
     * Method to get the key that corresponds to the supplied task name
     * @param taskName
     * @return corresponding key value if exists else 0
     */
    protected int getKey(String taskName) {
        Set setOfTasks = this.listContainer.entrySet();
        Iterator i = setOfTasks.iterator();
        
        while (i.hasNext()) {
            Map.Entry taskKeyAndValue = (Map.Entry)i.next();
            if (taskKeyAndValue.getValue().equals(taskName))
                return (int)taskKeyAndValue.getKey();
        }
        
        return 0;
    }
    
    
    
    /**
     * Method to add a task to the task list
     * @param taskName 
     * @return true if successful add else false
     */
    public boolean addTask(String taskName) {
        if (taskName == null || taskName.equals(""))
            return false;
        this.listContainer.put(createKey(taskName), taskName);
        this.numberOfTasks += 1;
        return true;
    }
    
    
    
    /**
     * Method to verify that the supplied task exists in the list
     * @param taskName
     * @return true if exists else false
     */
    public boolean validTask(String taskName) {
        return this.listContainer.containsKey(getKey(taskName));
    }
    
    
    
    /**
     * Method to select a task from the list
     * @param taskName
     * @return selected task
     */
    public String selectTask(String taskName) {
        return this.listContainer.get(getKey(taskName)).toString();
    }
    
    
    
    /**
     * Abstract method to move the specified task to the subsequent list
     * This method will be implemented in the ToDo and InProg classes
     * @param taskName
     * @param listName 
     */
    abstract int moveTask(String taskName, TaskList listName);
    

    
    /**
     * Abstract method to delete a task
     * @param taskName 
     */
    abstract boolean deleteTask(String taskName);
    
    
    
    /**
     * Abstract method to permanently delete a task
     * @param taskName 
     */
    abstract boolean permanentlyDeleteTask(String taskName);
    
    
    
    //Method to display all tasks in the list
    public void displayTasks() {
        Set setOfTasks = this.listContainer.entrySet();
        Iterator i = setOfTasks.iterator();
        
        System.out.println("Current number of "+this.getList()+" tasks: "+this.numberOfTasks);
  
        while (i.hasNext()) {
            Map.Entry taskKeyAndValue = (Map.Entry)i.next();
//            System.out.print("KEY: "+taskKeyAndValue.getKey()+" ");
            System.out.println(taskKeyAndValue.getValue());
        }
    }
    
    
    //****************** GETTERS & SETTERS ******************//
    
    public String getList() { return listName; }

    public void setList(String listName) { this.listName = listName; }

    public int getNumberOfTasks() { return numberOfTasks; }

    public void setNumberOfTasks(int numberOfTasks) { this.numberOfTasks = numberOfTasks; }
    
    public HashMap getListContainer() { return listContainer; }

    public void setListContainer(HashMap listContainer) { this.listContainer = listContainer; }
    
}
