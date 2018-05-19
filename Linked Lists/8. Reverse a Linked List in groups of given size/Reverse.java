import java.io.*;

public class Merge extends LinkedList
{ 
    /* Function which returns the head node of the reversed LL */
    public static Node reverse(Node h, int k)
    {
        int i = 1;
        Node curr = h;
        Node prev = null;
        Node temp = curr.next;

        while(curr != null && i <= k)
        {
            ++i;
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        /* If next node exists */
        if(curr != null)
        {
            /* We are combining the h(head node which has now become the last node) with the 1st node of the next group */
            h.next = reverse(curr, k);
        }

        return prev;
    }

    public static void main(String[] args)
    {
        /* Creating a new LL */
        LinkedList llist = new LinkedList();
        llist.head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);

        llist.head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        /* LL before reversing */
        System.out.println("LL before reversing\n");
        llist.print_nodes();

        /* Length of the group to be reversed */
        int k = 2;

        llist.head = reverse(llist.head, k);

        /* LL after reversing */
        System.out.println("\nFor k = "+ k + ", LL after reversing\n");
        llist.print_nodes();
    }
}

/*

LL before reversing

Node 1 value => 1
Node 2 value => 2
Node 3 value => 3
Node 4 value => 4
Node 5 value => 5
Node 6 value => 6

For k = 2, LL after reversing

Node 1 value => 2
Node 2 value => 1
Node 3 value => 4
Node 4 value => 3
Node 5 value => 6
Node 6 value => 5

*/