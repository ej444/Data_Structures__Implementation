public class LinkedList
{
    Node head;

    /* Inner class is made static so that main() can access it */
    static class Node
    {
        int data;
        Node next;

        /* Contructor */
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    
    
    /* Function to print all the node values of the Linked List */
    public void print_nodes()
    {
        /* Linked List traversal */
        Node n = head;
        
        int i=1;
        while(n != null)
        {
            System.out.println("Node " + i++ + " value => " + n.data);
            n = n.next;
        }
    }
    

    public static void main(String[] args)
    {
        /* Create an empty list */
        LinkedList llist = new LinkedList();

        /* Adding 3 nodes with values */
        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        
        /* Connecting the nodes */
        llist.head.next = second;
        second.next = third;
             
        llist.print_nodes();
    }
}
