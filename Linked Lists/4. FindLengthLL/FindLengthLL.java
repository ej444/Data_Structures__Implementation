import java.io.*;

public class FindLengthLL extends LinkedList
{
    /* Recursive function to get the length of LL */
    public static int getCount(Node node)
    {
        if(node == null)
        {
            return 0;
        }
        return 1 +  getCount(node.next);
    }
    
    public static void main(String[] args)
    {
        LinkedList llist = new LinkedList();
        
        llist.add_node_end(1);
        llist.add_node_end(2);
        llist.add_node_end(33);
        llist.add_node_end(44);
        
        llist.print_nodes();
        
        Node temp = llist.head;
        int count = 0;
        
        /* Loop to traverse through the LL and count it's length */
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }
        
        System.out.println("\nThe length of the linked list (by iteration) is " + count);
        System.out.println("\nThe length of the linked list (by recursion) is " + getCount(llist.head));
        
    }
}


/*
 
Node 1 value => 1
Node 2 value => 2
Node 3 value => 33
Node 4 value => 44

The length of the linked list (by iteration) is 4

The length of the linked list (by recursion) is 4

 */