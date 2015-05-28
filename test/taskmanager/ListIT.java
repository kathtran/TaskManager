package taskmanager;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kathleen Tran
 */
public class ListIT {
    
    public ListIT() { }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() { }
    
    @After
    public void tearDown() { }

    /**
     * Test of loadAccounts method, of class List.
     */
    @Test
    public void testLoadAccounts() {
        System.out.println("loadAccounts");
        List instance = new List();
        instance.loadAccounts();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAccount method, of class List.
     */
    @Test
    public void testAddAccount() {
        System.out.println("addAccount");
        String username = "";
        String password = "";
        List instance = new List();
        instance.addAccount(username, password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validLogin method, of class List.
     */
    @Test
    public void testValidLogin() {
        System.out.println("validLogin");
        String username = "";
        String password = "";
        List instance = new List();
        boolean expResult = false;
        boolean result = instance.validLogin(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTask method, of class List.
     */
    @Test
    public void testAddTask() {
        System.out.println("addTask");
        String username = "";
        int list = 0;
        String task = "";
        List instance = new List();
        boolean expResult = false;
        boolean result = instance.addTask(username, list, task);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validAccount method, of class List.
     */
    @Test
    public void testValidAccount_String() {
        System.out.println("validAccount");
        String userInput = "";
        List instance = new List();
        boolean expResult = false;
        boolean result = instance.validAccount(userInput);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validAccount method, of class List.
     */
    @Test
    public void testValidAccount_Node_String() {
        System.out.println("validAccount");
        Node head = null;
        String userInput = "";
        List instance = new List();
        boolean expResult = false;
        boolean result = instance.validAccount(head, userInput);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectAccount method, of class List.
     */
    @Test
    public void testSelectAccount() {
        System.out.println("selectAccount");
        String userInput = "";
        List instance = new List();
        Node expResult = null;
        Node result = instance.selectAccount(userInput);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayAccounts method, of class List.
     */
    @Test
    public void testDisplayAccounts() {
        System.out.println("displayAccounts");
        List instance = new List();
        instance.displayAccounts();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayAll method, of class List.
     */
    @Test
    public void testDisplayAll() {
        System.out.println("displayAll");
        List instance = new List();
        instance.displayAll();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class List.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        List instance = new List();
        boolean expResult = false;
        boolean result = instance.save();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHead method, of class List.
     */
    @Test
    public void testGetHead() {
        System.out.println("getHead");
        List instance = new List();
        Node expResult = null;
        Node result = instance.getHead();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHead method, of class List.
     */
    @Test
    public void testSetHead() {
        System.out.println("setHead");
        Node head = null;
        List instance = new List();
        instance.setHead(head);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfAccounts method, of class List.
     */
    @Test
    public void testGetNumberOfAccounts() {
        System.out.println("getNumberOfAccounts");
        List instance = new List();
        int expResult = 0;
        int result = instance.getNumberOfAccounts();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
