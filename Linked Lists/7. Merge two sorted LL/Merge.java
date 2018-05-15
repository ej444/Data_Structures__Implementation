import java.io.*;

public class Merge extends LinkedList
{
    /* Function to merge two sorted Linked Lists */
    public static Node merge(Node head1, Node head2)
    {

        Node ptr = new Node(0);
        Node temp = ptr;
        Node ptr1 = head1;
        Node ptr2 = head2;

        while(ptr1 != null && ptr2 != null)
        {
            if(ptr1.data >= ptr2.data)
            {
                ptr.next = new Node(ptr2.data);
                ptr = ptr.next;
                ptr2 = ptr2.next;
            }
            else
            {
                ptr.next = new Node(ptr1.data);
                ptr = ptr.next;
                ptr1 = ptr1.next;
            }
        }

        if(ptr1 == null)
        {
            ptr.next = ptr2;
        }
        else
        {
            ptr.next = ptr1;
        }

        return temp.next;
    }

    public static void main(String[] args)
    {
        /* Making two linked lists llist1, llist2 & llist*/   
        LinkedList llist1 = new LinkedList();
        LinkedList llist2 = new LinkedList();
        LinkedList llist = new LinkedList();

        llist1.head = new Node(1);
        Node n12 = new Node(3);
        Node n13 = new Node(5);
        llist1.head.next = n12;
        n12.next = n13;

        llist2.head = new Node(2);
        Node n22 = new Node(4);
        Node n23 = new Node(6);
        Node n24 = new Node(7);
        llist2.head.next = n22;
        n22.next = n23;  
        n23.next = n24;

        /* Before merging */
        System.out.println("Linked List 1\n");
        llist1.print_nodes();
        System.out.println("\nLinked List 2\n");
        llist2.print_nodes();

        llist.head = merge(llist1.head, llist2.head);

        System.out.println("\nLinked List after merging \n");
        llist.print_nodes();
    }
}


/*

Linked List 1

Node 1 value => 1
Node 2 value => 3
Node 3 value => 5

Linked List 2

Node 1 value => 2
Node 2 value => 4
Node 3 value => 6
Node 4 value => 7

Linked List after merging 

Node 1 value => 1
Node 2 value => 2
Node 3 value => 3
Node 4 value => 4
Node 5 value => 5
Node 6 value => 6
Node 7 value => 7

*/
