package taskmanager;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * The Task Manager
 * @author Kathleen Tran
 */
public class AccountTest {
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("/********* STARTING TESTS FOR ACCOUNT *********/");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("/********* TESTING FOR ACCOUNT IS OVER *********/");
    }


    /**
     * Testing addTask of class Account against a VALID BUT DUPLICATED TASK NAME
     */
    @Test
    public void testAddingValidButDuplicatedTask() {
        System.out.println("addTask Test Case 3: Valid but Duplicated Task Name");
        String firstTask = "This is a task";
        String firstTaskCopy = firstTask;
        Account instance = new Account();
        instance.addTask(1, firstTask);
        assertFalse("A String that is a duplicate of an existing String must return false", instance.addTask(1, firstTaskCopy));
        assertFalse("A duplicate String must return false regardless of target list", instance.addTask(2, firstTaskCopy));
    }

    /**
     * Test of findTask method, of class Account.
     */
    @Test
    public void testFindTask() {
        System.out.println("findTask");
        String task = "A";
        Account instance = new Account();
        instance.addTask(1, task);
        TaskList expResult = instance.getToDo();
        TaskList result = instance.findTask(task);
        assertEquals(expResult, result);
    }
    
    /**
     * Testing moveTask of class Account against an INVALID TASK
     */
    @Test
    public void testMovingInvalidTask() {
        System.out.println("moveTask Test Case 1: Invalid Task");
        String invalidTaskName = "";
        String validTaskNameThatDoesNotExist = "This task has not been added";
        Account instance = new Account();
        int expected = 0;
        int result = instance.moveTask(invalidTaskName);
        assertEquals("An invalid String must return the value "+expected, expected, result);
        result = instance.moveTask(validTaskNameThatDoesNotExist);
        assertEquals("A valid String that does not exist within the list must return the value "+expected, expected, result);
    }
    
    /**
     * Testing moveTask method of class Account against a VALID MOVE
     */
    @Test
    public void testMovingValidMove() {
        System.out.println("moveTask Test Case 3: Valid Move");
        String taskToBeMoved = "This task will be moved";
        Account instance = new Account();
        instance.addTask(1, taskToBeMoved);
        int expected = 2;
        int result = instance.moveTask(taskToBeMoved);
        assertEquals("Successfully moving a task from one list to the next must return "+expected, expected, result);
    }

    /**
     * Testing deleteTask method of class Account against a VALID TASK
     */
    @Test
    public void testDeletingValidTask() {
        System.out.println("deleteTask Test Case 1: Valid Task");
        String taskToBeDeleted = "This is a task";
        Account instance = new Account();
        instance.addTask(3, taskToBeDeleted);
        assertTrue("Deleting an existing task must return true", instance.deleteTask(taskToBeDeleted));
        assertEquals("Deleted task must be on top of undo stack", taskToBeDeleted, instance.getDone().mostRecentlyDeleted());
    }
    
    /**
     * Testing deleteTask method of class Account against an INVALID TASK
     */
    @Test
    public void testDeletingInvalidTask() {
        System.out.println("deleteTask Test Case 2: Invalid Task");
        String taskThatDoesNotExistInList = "Unadded task";
        Account instance = new Account();
        assertFalse("Deleting a task that does not currently exist in the list must return false", instance.deleteTask(taskThatDoesNotExistInList));
    }

    /**
     * Test of permanentlyDeleteTask method, of class Account.
     */
    @Test
    public void testPermanentlyDeleteTask() {
        System.out.println("permanentlyDeleteTask");
        String taskName = "A";
        Account instance = new Account();
        instance.addTask(3, taskName);
        assertFalse("No match to tasks within the undo stack must return false", instance.permanentlyDeleteTask(taskName));
        instance.deleteTask(taskName);
        assertTrue("Matching a task in the undo stack must return true", instance.permanentlyDeleteTask(taskName));
    }

    /**
     * Test of undoDeletion method, of class Account.
     */
    @Test
    public void testUndoDeletion() {
        System.out.println("undoDeletion");
        String task = "A";
        Account instance = new Account();
        instance.undoDeletion();
        instance.addTask(3, task);
        instance.deleteTask(task);
        assertTrue("Non-empty undo stack must return true", instance.undoDeletion());
        assertFalse("Empty undo stack must return false", instance.undoDeletion());
    }
    
}
