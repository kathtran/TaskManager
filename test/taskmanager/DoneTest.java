package taskmanager;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * The Task Manager 
 * @author Kathleen Tran
 */
public class DoneTest {
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("/********* STARTING TESTS FOR DONE *********/");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("/********* TESTING FOR DONE IS OVER *********/");
    }
    

    /**
     * Test of isEmpty method, of class Done.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        String taskToFillStack = "This is a task";
        Done instance = new Done();
        assertTrue("An empty stack must return true", instance.isEmpty());
        instance.addTask(taskToFillStack);
        instance.deleteTask(taskToFillStack);
        assertFalse("A non-empty stack must return false", instance.isEmpty());
    }

    /**
     * Test of mostRecentlyDeleted method, of class Done.
     */
    @Test
    public void testMostRecentlyDeleted() {
        System.out.println("mostRecentlyDeleted");
        String taskName = "A";
        Done instance = new Done();
        String errMessage = instance.emptyStackMessage();
        assertEquals("No task deletions must return "+errMessage, errMessage, instance.mostRecentlyDeleted());
        instance.addTask(taskName);
        assertEquals("Incorrect task name must return "+errMessage, errMessage, instance.mostRecentlyDeleted());
        instance.deleteTask(taskName);
        assertEquals("After deletion of '"+taskName+"', method must return "+instance.mostRecentlyDeleted(), taskName, instance.mostRecentlyDeleted());
    }
    
    /**
     * Testing deleteTask method of class Done against a VALID TASK
     */
    @Test
    public void testDeletingValidTask() {
        System.out.println("deleteTask Test Case 1: Valid Task");
        String taskToBeDeleted = "This is a task";
        Done instance = new Done();
        instance.addTask(taskToBeDeleted);
        assertTrue("Deleting an existing task must return true", instance.deleteTask(taskToBeDeleted));
        assertEquals("Deleted task must be on top of undo stack", taskToBeDeleted, instance.mostRecentlyDeleted());
    }
    
    /**
     * Testing deleteTask method of class Done against an INVALID TASK
     */
    @Test
    public void testDeletingInvalidTask() {
        System.out.println("deleteTask Test Case 2: Invalid Task");
        String taskThatDoesNotExistInList = "Unadded task";
        Done instance = new Done();
        assertFalse("Deleting a task that does not currently exist in the list must return false", instance.deleteTask(taskThatDoesNotExistInList));
    }

    /**
     * Test of permanentlyDeleteTask method, of class Done.
     */
    @Test
    public void testPermanentlyDeleteTask() {
        System.out.println("permanentlyDeleteTask");
        String taskName = "A";
        Done instance = new Done();
        instance.addTask(taskName);
        assertFalse("No match to tasks within the undo stack must return false", instance.permanentlyDeleteTask(taskName));
        instance.deleteTask(taskName);
        assertTrue("Matching a task in the undo stack must return true", instance.permanentlyDeleteTask(taskName));
    }

    /**
     * Test of undoDeletion method, of class Done.
     */
    @Test
    public void testUndoDeletion() {
        System.out.println("undoDeletion");
        String taskName = "A";
        Done instance = new Done();
        instance.addTask(taskName);
        assertFalse("Empty undo stack must return false", instance.undoDeletion());
        instance.deleteTask(taskName);
        assertTrue("Non-empty undo stack must return true", instance.undoDeletion());
    }

}
