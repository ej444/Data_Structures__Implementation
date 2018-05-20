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


import java.io.*;

public class Merge extends LinkedList
{
    public static Node reverse(Node head)
    {
        Node prev = null;
        Node curr = head;
        Node temp = null;
        
        while(curr != null && curr.next != null)
        {
            temp = curr.next;
            curr.next = prev;
            prev = curr;         
            curr = temp;   
        }
        
        return prev;
        
    }
    
    public static void main(String[] args)
    {
        /* Linked List creation */
        LinkedList llist = new LinkedList();
        llist.head = new Node(3);
        Node n2 = new Node(2);
        Node n3 = new Node(1);
        Node n4 = new Node(6);
        Node n5 = new Node(5);
        Node n6 = new Node(4);
        llist.head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        
        /* Before */
        System.out.println("Before\n");
        llist.print_nodes();
        
        llist.head = reverse(llist.head);
        
        /* After */
        System.out.println("\n After \n");
        llist.print_nodes();
    }

}
   
*/
