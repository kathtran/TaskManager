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
public class TaskListTest {
    
    public TaskListTest() { }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("/********* STARTING TESTS FOR TASKLISTTEST.JAVA *********/");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("/********* TESTING FOR TASKLISTTEST.JAVA IS OVER *********/");
    }
    
    @Before
    public void setUp() { }
    
    @After
    public void tearDown() { }

    /**
     * Test of createKey method, of class TaskList.
     */
    @Test
    public void testCreateKey() {
        System.out.println("createKey");
        String taskName = "A";
        TaskList instance = new ToDo();
        char digit = (char)(taskName.charAt(0) - '0');
        int expResult = digit;
        int result = instance.createKey(taskName);
        assertEquals(expResult, result);
    }

    /**
     * Test of addTask method, of class TaskList.
     */
    @Test
    public void testAddTask() {
        System.out.println("addTask");
        String taskName = "A";
        String testTaskNull = new String();
        String testTaskEmpty = "";
        TaskList instance = new ToDo();
        assertFalse("Exception case must return false", instance.addTask(testTaskNull));
        assertFalse("Exception case must return false", instance.addTask(testTaskEmpty));
        assertTrue("Passing case must return true", instance.addTask(taskName));
    }

    /**
     * Test of validTask method, of class TaskList.
     */
    @Test
    public void testValidTask() {
        System.out.println("validTask");
        String taskName = "A";
        TaskList instance = new ToDo();
        assertFalse("Exception case must return false", instance.validTask(taskName));
        instance.addTask(taskName);
        assertTrue("Passing case must return true", instance.validTask(taskName));
    }
    
}
