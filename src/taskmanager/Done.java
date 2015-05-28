package taskmanager;

import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Stack;

/**
 * The Task Manager.
 * CLASS  : Done.java
 * PURPOSE: This class is a derivation of the TaskList class. It contains all
 *          tasks that belong under the "Done" label. This derived class is the
 *          most different from the other two classes that share the same base
 *          class. It supports the ability to "undo" task deletions by utilizing
 *          the Stack class.
 *
 * @author Kathleen Tran
 */
public class Done extends TaskList {
    private Stack undo;

    
    public Done() {
        this.listName = "Done";
        this.numberOfTasks = 0;
        this.listContainer = new HashMap(13);
        this.undo = new Stack();
    }

    
    
    /**
     * Method to check if the stack is empty
     * @return true if contains any items otherwise false
     */
    public boolean isEmpty() {
        return undo.empty();
    }

    
    
    /**
     * Method to determine if the supplied task already exists
     * within the undo stack
     * @param taskName
     * @return true if exists else false
     */
    public boolean ifExists(String taskName) {
        Stack hold = new Stack();

        while (!undo.peek().equals(taskName) && !undo.isEmpty())
            hold.push(undo.pop());
        if (undo.peek().equals(taskName))
            return true;
        while (!hold.isEmpty())
            undo.push(hold.pop());
        return false;
    }
    
    

    /**
     * Display most recently deleted task
     * @return task at the top of the stack or empty stack message
     */
    public String mostRecentlyDeleted() {
        if (!undo.isEmpty())
            return undo.peek().toString();
        else
            return emptyStackMessage();
    }

    
    
    /**
     * Method to simulate the deletion of the supplied task with room
     * for error in case the user wishes to 'undo' their action
     * @param taskName
     * @return true if task deleted else false
     */
    @Override
    public boolean deleteTask(String taskName) {
        if (validTask(taskName)) {
            undo.push(taskName);
            this.listContainer.remove(getKey(taskName));
            this.numberOfTasks -= 1;
            return true;
        }
        else
            return false;
    }

    
    
    /**
     * Method to permanently delete the supplied task. It will only delete the
     * task if it currently resides in the undo stack.
     * @param taskName
     * @return true if task removed from undo stack else false
     */
    @Override
    public boolean permanentlyDeleteTask(String taskName) {
        Stack hold = new Stack();

        try {
            while (!undo.peek().equals(taskName) && !undo.isEmpty())
                hold.push(undo.pop());
            if (undo.peek().equals(taskName)) {
                undo.pop();
                return true;
            }
            while (!hold.isEmpty())
                undo.push(hold.pop());
        } catch (EmptyStackException ex) {
            ex.getStackTrace();
            return false;
        }
        return false;
    }

    
    
    /**
     * Method to undo a deletion
     * @return true if able to retrieve deleted task else false
     */
    public boolean undoDeletion() {
        if (!undo.isEmpty()) {
            String retrievedItem = undo.pop().toString();
            addTask(retrievedItem);
            return true;
        }
        else
            return false;
    }

    
    
    /**
     * Message notifying empty state of stack
     * @return empty stack message
     */
    public String emptyStackMessage() {
        return "There are no deletions to undo.";
    }

    
    
    /**
     * Methods not supported by this derived class
     * @return integer that indicated successful move
     */
    @Override
    public int moveTask(String taskName, TaskList listName) {
        return 2;
    }

    //****************** GETTERS & SETTERS ******************//
    
    public Stack getUndo() { return undo; }

    public void setUndo(Stack undo) { this.undo = undo; }

}
