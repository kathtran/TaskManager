package taskmanager;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * The Task Manager 
 * @author Kathleen Tran
 */
public class DoneTest {
    
    public DoneTest() { }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("/********* STARTING TESTS FOR DONETEST.JAVA *********/");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("/********* TESTING FOR DONETEST.JAVA IS OVER *********/");
    }
    
    @Before
    public void setUp() { }
    
    @After
    public void tearDown() { }

    /**
     * Test of isEmpty method, of class Done.
     * Passing case.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Done instance = new Done();
        assertTrue("Passing case must return true", instance.isEmpty());
        assertFalse("Exception case must return false", !instance.isEmpty());
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
     * Test of deleteTask method, of class Done.
     */
    @Test
    public void testDeleteTask() {
        System.out.println("deleteTask");
        String taskName = "A";
        String taskMismatch = "B";
        Done instance = new Done();
        instance.addTask(taskName);
        assertFalse("Exception case must return false", instance.deleteTask(taskMismatch));
        assertTrue("Passing case must return true", instance.deleteTask(taskName));
        int taskCount = instance.getNumberOfTasks();
        assertEquals("Number of tasks must be "+0, 0, taskCount);
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
        assertFalse("Exception case must return false", instance.permanentlyDeleteTask(taskName));
        instance.deleteTask(taskName);
        assertTrue("Passing case must return true", instance.permanentlyDeleteTask(taskName));
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
        assertFalse("Exception case must return false", instance.undoDeletion());
        instance.deleteTask(taskName);
        assertTrue("Passing case must return true", instance.undoDeletion());
    }

    /**
     * Test of moveTask method, of class Done.
     */
    @Test
    public void testMoveTask() {
        System.out.println("moveTask");
        String taskName = "";
        TaskList listName = null;
        Done instance = new Done();
        instance.moveTask(taskName, listName);
        assertEquals("Passing case always returns 2", 2, instance.moveTask(taskName, listName));
    }
    
}
