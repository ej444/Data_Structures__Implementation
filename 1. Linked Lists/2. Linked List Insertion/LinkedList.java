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
        
        return;
    }
    
    
    /* Function to add the nodes at the front */
    public void add_node_front(int new_data)
    { 
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;  
        
        return;
    }
    
    
    /* Function to add the nodes after a given node */
    public void add_node_after(Node previous_node, int new_data)
    { 
        /* Checking if the previous node exists */
        if(previous_node == null)
        {
            System.out.println("Previous node cannot be null");
        }
        
        Node new_node = new Node(new_data);
        new_node.next = previous_node.next;
        previous_node.next = new_node;
        
        return;
    }
    
    /* Function to add the nodes at the end */
    public void add_node_end(int new_data)
    {
        
        Node new_node = new Node(new_data);
        
        /* If the linked list is empty. */
        if(head == null)
        {
            head = new_node;
            return;
        }
        
        Node last = head;
        while(last.next != null)
        {
            last = last.next;
        }
        
        last.next = new_node;
        
        return;
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
        
        /* Adding 2 nodes in the front*/
        System.out.println("\nAdding 10 in front");
        llist.add_node_front(10);
        System.out.println("Adding 7 in front");
        llist.add_node_front(7);
        
        /* After Adding */
        System.out.println("\nAfter Adding");
        llist.print_nodes();
        
        /* Adding 1 node after first node & 1 node after second node */
        System.out.println("\nAdding 100 after first node");
        llist.add_node_after(llist.head, 100);
        System.out.println("Adding 200 after second node");
        llist.add_node_after(llist.head.next, 200);
        
        /* After Adding */
        System.out.println("\nAfter Adding");
        llist.print_nodes();
        
        /* Adding 2 nodes at the end */
        System.out.println("\nAdding 50 at the end");
        llist.add_node_end(50);
        System.out.println("Adding 60 at the end");
        llist.add_node_end(60);
        
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

Adding 10 in front
Adding 7 in front

After Adding
Node 1 value => 7
Node 2 value => 10
Node 3 value => 1
Node 4 value => 2
Node 5 value => 3

Adding 100 after first node
Adding 200 after second node

After Adding
Node 1 value => 7
Node 2 value => 100
Node 3 value => 200
Node 4 value => 10
Node 5 value => 1
Node 6 value => 2
Node 7 value => 3

Adding 50 at the end
Adding 60 at the end

After Adding
Node 1 value => 7
Node 2 value => 100
Node 3 value => 200
Node 4 value => 10
Node 5 value => 1
Node 6 value => 2
Node 7 value => 3
Node 8 value => 50
Node 9 value => 60
   
     
*/
