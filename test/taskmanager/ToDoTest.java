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
public class ToDoTest {
    
    public ToDoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("/********* STARTING TESTS FOR TODOTEST.JAVA *********/");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("/********* TESTING FOR TODOTEST.JAVA IS OVER *********/");
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of moveTask method, of class ToDo.
     */
    @Test
    public void testMoveTask() {
        System.out.println("moveTask");
        String taskName = "A";
        String testTask = "B";
        ToDo instance = new ToDo();
        InProg nextList = new InProg();
        instance.addTask(taskName);
        assertEquals("Successful transfer must return 2", 2, instance.moveTask(taskName, nextList));
        instance.addTask(taskName);
        assertEquals("Moving a task that already exists in the subsequent list to the subsequent list must return 1", 1, instance.moveTask(taskName, nextList));
        assertEquals("Exception case must return 0", 0, instance.moveTask(testTask, instance));
    }

    /**
     * Test of deleteTask method, of class ToDo.
     */
    @Test
    public void testDeleteTask() {
        System.out.println("deleteTask");
        String taskName = "A";
        ToDo instance = new ToDo();
        instance.deleteTask(taskName);
        assertFalse("Passing case must always return false", instance.deleteTask(taskName));
    }

    /**
     * Test of permanentlyDeleteTask method, of class ToDo.
     */
    @Test
    public void testPermanentlyDeleteTask() {
        System.out.println("permanentlyDeleteTask");
        String taskName = "A";
        ToDo instance = new ToDo();
        assertFalse("Passing case must always return false", instance.permanentlyDeleteTask(taskName));
    }
    
}
