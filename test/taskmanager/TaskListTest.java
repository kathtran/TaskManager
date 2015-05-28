package taskmanager;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * The Task Manager
 * @author Kathleen Tran
 */
public class TaskListTest {
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("/********* STARTING TESTS FOR TASKLIST *********/");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("/********* TESTING FOR TASKLIST IS OVER *********/");
    }


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
     * Testing addTask method of class TaskList against an INVALID TASK NAME
     */
    @Test
    public void testAddingInvalidTaskName() {
        System.out.println("addTask Test Case 1: Invalid Task Name");
        String emptyTaskName = "";
        String nullTaskName = new String();
        TaskList instance = new ToDo();
        assertFalse("An emptry String must return false", instance.addTask(emptyTaskName));
        assertFalse("An uninitialized String must return false", instance.addTask(nullTaskName));
    }
    
    /**
     * Testing addTask method of class TaskList against a VALID TASK NAME
     */
    @Test
    public void testAddingValidTaskName() {
        System.out.println("addTask Test Case 2: Valid Task Name");
        String allCharacters = "Abcd Efgh";
        String allIntegers = "1234 5678";
        String allSymbols = "!@#$ %^&*";
        String combination = "Aa12!@";
        TaskList instance = new ToDo();
        assertTrue("A String of all characters must return true", instance.addTask(allCharacters));
        assertTrue("A String of all integers must return true", instance.addTask(allIntegers));
        assertTrue("A String of all symbols must return true", instance.addTask(allSymbols));
        assertTrue("A String of a combination of characters, integers, and symbols must return true", instance.addTask(combination));
    }

    /**
     * Test of validTask method, of class TaskList.
     */
    @Test
    public void testValidTask() {
        System.out.println("validTask");
        String taskName = "A";
        TaskList instance = new ToDo();
        assertFalse("A task currently absent from the list must return false", instance.validTask(taskName));
        instance.addTask(taskName);
        assertTrue("A task currently existing within the list must return true", instance.validTask(taskName));
    }
    
}
