/* 
"Java manipulates objects 'by reference,' but it passes object references to methods 'by value.'"   
*/

import java.io.*;
public class Reverse extends LinkedList
{
    /* Function to reverse the LL. 
    I/P = orignal head node. 
    O/P = new head node */
    public static Node reverse(Node node)
    {
        /* Initializing 3 pointers */
        Node prev = null; 
        Node curr = node;
        Node after = node.next;

        while(curr != null)
        {
            after = curr.next; 
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev; 
    }

    public static void main(String[] args)
    {
        LinkedList llist = new LinkedList();
        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        llist.head.next = second;
        second.next = third;
        third.next = fourth;

        /* Before reversing */
        System.out.println("Before reversing\n");
        llist.print_nodes();
        
        llist.head = reverse(llist.head);
        
        /* After reversing */
        System.out.println("\nAfter reversing\n");
        llist.print_nodes();

    }
}


/*
   
Before reversing

Node 1 value => 1
Node 2 value => 2
Node 3 value => 3
Node 4 value => 4

After reversing

Node 1 value => 4
Node 2 value => 3
Node 3 value => 2
Node 4 value => 1
   
*/