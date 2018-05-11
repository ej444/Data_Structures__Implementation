public class LinkedList
{
    Node head;

    /* Inner class is made static so that the main() can access it */
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

    
    /* Function to delete the node whose value == key */
    public void delete_node_by_key(int key)
    {
        Node temp = head;
        Node prev = null;
        
        /* If the key == value of first node */
        if(temp != null && temp.data == key)
        {
            head = head.next;
            return;
        }

        /* Searching the Linked List for the key  */
        while(temp.next != null)
        {
            if(temp.data == key)
            {
                break;      
            }
            prev = temp;
            temp = temp.next;
        }

        /* Key not found in the Linked List */
        if(temp == null)
        {
            return;
        }

        /* Deleting the temp node */
        prev.next = temp.next;
        
        return;
    }
    
    
    /* Function to delete the node whose position is passed in the function (starting from zero) */
    public void delete_node_by_pos(int position)
    {
        if(position == 0)
        {
            head = head.next;
            return;
        }
        
        int i = 0;
        Node temp = head;
        Node prev = null;
        
        while(temp != null)
        {
            if(i == position)
            {
                prev.next = temp.next;
                return;
            }
            prev = temp;
            temp = temp.next;
            i++;
        }
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
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);
        Node seventh = new Node(7);

        /* Connecting the nodes */
        llist.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;

        /* Before Deleting */
        System.out.println("Before Deleting");
        llist.print_nodes(); 
        
        /* Deleting node with value 2 */
        System.out.println("\nDeleting node with value 2\n");
        llist.delete_node_by_key(2);
        
        /* After Deleting */
        System.out.println("After Deleting");
        llist.print_nodes(); 
        
        /* Deleting node with position 0 */
        System.out.println("\nDeleting node with position 0\n");
        llist.delete_node_by_pos(0);
        
        /* After Deleting */
        System.out.println("After Deleting");
        llist.print_nodes(); 
        
        /* Deleting node with position 2 */
        System.out.println("\nDeleting node with position 2\n");
        llist.delete_node_by_pos(2);
        
        /* After Deleting */
        System.out.println("After Deleting");
        llist.print_nodes(); 

    }
}


/* Output
   
Before Deleting
Node 1 value => 1
Node 2 value => 2
Node 3 value => 3
Node 4 value => 4
Node 5 value => 5
Node 6 value => 6
Node 7 value => 7

Deleting node with value 2

After Deleting
Node 1 value => 1
Node 2 value => 3
Node 3 value => 4
Node 4 value => 5
Node 5 value => 6
Node 6 value => 7

Deleting node with position 0

After Deleting
Node 1 value => 3
Node 2 value => 4
Node 3 value => 5
Node 4 value => 6
Node 5 value => 7

Deleting node with position 2

After Deleting
Node 1 value => 3
Node 2 value => 4
Node 3 value => 6
Node 4 value => 7
 
*/
