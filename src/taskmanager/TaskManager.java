package taskmanager;

/**
 * The Task Manager.
 * CLASS  : TaskManager.java
 * PURPOSE: This class creates an object of the TaskManagerGUI class.
 *          It is used to start, display, and run the GUI.
 * 
 * @author Kathleen Tran
 */
public class TaskManager extends TaskManagerGUI {

    /**
     * Client Application
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        TaskManagerGUI taskManagerGUI = new TaskManagerGUI();
        taskManagerGUI.setVisible(true);
    }  
      
}
