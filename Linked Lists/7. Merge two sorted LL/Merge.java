import java.io.*;

public class Merge extends LinkedList
{
    public static void main(String[] args)
    {
        /* Making two linked lists llist1 and llist2 */   
        LinkedList llist1 = new LinkedList();
        LinkedList llist2 = new LinkedList();
        
        llist1.head = new Node(1);
        Node n12 = new Node(3);
        Node n13 = new Node(5);
        llist1.head.next = n12;
        n12.next = n13;

        llist2.head = new Node(2);
        Node n22 = new Node(4);
        Node n23 = new Node(6);
        Node n24 = new Node(8);
        llist2.head.next = n22;
        n22.next = n23;  
        n23.next = n24;
        
        /* Before merging */
        System.out.println("Linked List 1\n");
        llist1.print_nodes();
        
        System.out.println("\nLinked List 2\n");
        llist2.print_nodes();        
        

    }
}
