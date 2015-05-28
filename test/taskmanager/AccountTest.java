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
public class AccountTest {
    
    public AccountTest() { }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("/********* STARTING TESTS FOR ACCOUNTTEST.JAVA *********/");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("/********* TESTING FOR ACCOUNTTEST.JAVA IS OVER *********/");
    }
    
    @Before
    public void setUp() { }
    
    @After
    public void tearDown() { }

    /**
     * Test of addTask method, of class Account.
     */
    @Test
    public void testAddTask() {
        System.out.println("addTask");
        Account instance = new Account();
        int i;
        for (i = 1; i < 4; ++i)
            assertTrue("Passing case must return true", instance.addTask(i, "Task "+i));
        assertFalse("Exception case must return false", instance.addTask(1, "Task "+1));
        assertFalse("Exception case must return false", instance.addTask(4, "Task 4"));
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
     * Test of moveTask method, of class Account.
     */
    @Test
    public void testMoveTask() {
        System.out.println("moveTask");
        String task = "A";
        String testTask = "B";
        Account instance = new Account();
        instance.addTask(1, task);
        assertEquals("Successful move must return 2", 2, instance.moveTask(task));
        assertEquals("Invalid task must return 0", 0, instance.moveTask(testTask));
    }

    /**
     * Test of deleteTask method, of class Account.
     */
    @Test
    public void testDeleteTask() {
        System.out.println("deleteTask");
        String task = "A";
        String testTask = "B";
        Account instance = new Account();
        instance.addTask(3, task);
        assertTrue("Passing case must return true", instance.deleteTask(task));
        assertFalse("Exception case must return false", instance.deleteTask(testTask));
    }

    /**
     * Test of permanentlyDeleteTask method, of class Account.
     */
    @Test
    public void testPermanentlyDeleteTask() {
        System.out.println("permanentlyDeleteTask");
        String task = "A";
        Account instance = new Account();
        assertFalse("Exception case must return false", instance.permanentlyDeleteTask(task));
        instance.addTask(3, task);
        instance.deleteTask(task);
        assertTrue("Passing case must return true", instance.permanentlyDeleteTask(task));
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
        assertTrue("Passing case must return true", instance.undoDeletion());
        assertFalse("Exception case must return false", instance.undoDeletion());
    }
    
}
