import java.io.*;

public class Swap extends LinkedList
{
    /* Function to swap nodes in a linked list without swapping data */
    public static void swap(LinkedList llist, int x, int y)
    {
        /* As the LL contains distinct keys, so if both keys are same, do nothing. */
        if(x == y)
        {
            return;
        }

        /* Searching for key 1 */
        Node prevX, currX;
        prevX = null;
        currX = llist.head;

        while(currX != null && currX.data != x)
        {
            prevX = currX;
            currX = currX.next;
        }

        /* Searching for key 2 */
        Node prevY, currY;
        prevY = null;
        currY = llist.head;

        while(currY != null && currY.data != y)
        {
            prevY = currY;
            currY = currY.next;
        }

        /* If the nodes are not present */
        if(currX == null || currY == null)
        {
            return;
        }

        /* Pointing the remaining LL to the current nodes */
        /*If x is head node */
        if(prevX == null)
        {
            llist.head = currY;
        }
        else
        {
            prevX.next = currY;
        }

        /*If y is head node */
        if(prevY == null)
        {
            llist.head = currX;
        }
        else
        {
            prevY.next = currX;
        }

        /* Pointing the current nodes to the remaining LL */
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;

    }    

    public static void main(String[] args)
    {
        LinkedList llist = new LinkedList();
        llist.add_node_end(1);
        llist.add_node_end(2);
        llist.add_node_end(3);
        llist.add_node_end(4);

        /* Before Swapping */
        System.out.println("Before Swapping\n");
        llist.print_nodes();

        swap(llist, 1, 3);

        /* After Swapping */
        System.out.println("\nAfter Swapping\n");
        llist.print_nodes();

    }
}

/*

Before Swapping

Node 1 value => 1
Node 2 value => 2
Node 3 value => 3
Node 4 value => 4

After Swapping

Node 1 value => 3
Node 2 value => 2
Node 3 value => 1
Node 4 value => 4

 */