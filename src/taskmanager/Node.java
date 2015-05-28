package taskmanager;

/**
 * The Task Manager.
 * CLASS  : Node.java
 * PURPOSE: This class is a derivation of the Account class. It is
 *          put in place to support the treatment of each individual
 *          account as a node within the managing data structure
 *          to provide better navigation between different accounts.
 *          The node contains two fields: a reference to the node
 *          prior to it, as well as a reference to the node to follow.
 * 
 * @author Kathleen Tran
 */
public class Node extends Account {
    private Node next;
    private Node previous;
    
    
    public Node() {
        this.next = null;
        this.previous = null;
    }
    
    
    /**
     * Constructors with arguments
     * @param username
     * @param password
     */
    public Node(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    } 
    
    
    //****************** GETTERS & SETTERS ******************//

    public Node getNext() { return next; }

    public void setNext(Node next) { this.next = next; }
    
    public Node getPrevious() { return previous; }
    
    public void setPrevious(Node previous) { this.previous = previous; }
    
}
