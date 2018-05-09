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
    
    
    /* Function to add the nodes at the front */
    public void add_node_front(int new_data)
    { 
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;     
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
         
        /* Before Adding */
        System.out.println("Before Adding");
        llist.print_nodes();
        
        /* Adding 2 nodes */
        System.out.println("\nAdding 10");
        llist.add_node_front(10);
        System.out.println("Adding 7");
        llist.add_node_front(7);
        
        /* After Adding */
        System.out.println("\nAfter Adding");
        llist.print_nodes();
             
    }
}


/* Output
 

Before Adding
Node 1 value => 1
Node 2 value => 2
Node 3 value => 3

Adding 10
Adding 7

After Adding
Node 1 value => 7
Node 2 value => 10
Node 3 value => 1
Node 4 value => 2
Node 5 value => 3   
   
     
*/