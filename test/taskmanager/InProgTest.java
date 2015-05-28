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
public class InProgTest {
    
    public InProgTest() { }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("/********* STARTING TESTS FOR INPROGTEST.JAVA *********/");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("/********* TESTING FOR INPROGTEST.JAVA IS OVER *********/");
    }
    
    @Before
    public void setUp() { }
    
    @After
    public void tearDown() { }

    /**
     * Test of moveTask method, of class InProg.
     */
    @Test
    public void testMoveTask() {
        System.out.println("moveTask");
        String taskName = "A";
        String testTask = "B";
        InProg instance = new InProg();
        Done nextList = new Done();
        instance.addTask(taskName);
        assertEquals("Successful transfer must return 2", 2, instance.moveTask(taskName, nextList));
        instance.addTask(taskName);
        assertEquals("Moving a task that already exists in the subsequent list to the subsequent list must return 1", 1, instance.moveTask(taskName, nextList));
        assertEquals("Exception case must return 0", 0, instance.moveTask(testTask, instance));
    }

    /**
     * Test of deleteTask method, of class InProg.
     */
    @Test
    public void testDeleteTask() {
        System.out.println("deleteTask");
        String taskName = "A";
        InProg instance = new InProg();
        assertFalse("Passing case must always return false", instance.deleteTask(taskName));
    }

    /**
     * Test of permanentlyDeleteTask method, of class InProg.
     */
    @Test
    public void testPermanentlyDeleteTask() {
        System.out.println("permanentlyDeleteTask");
        String taskName = "A";
        InProg instance = new InProg();
        assertFalse("Passing case must always return false", instance.permanentlyDeleteTask(taskName));
    }
    
}
