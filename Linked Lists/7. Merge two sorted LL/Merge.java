import java.io.*;

public class Merge extends LinkedList
{
    public static Node merge(Node head1, Node head2)
    {
        Node ptr1 = head1;
        Node prev1 = null;
        Node ptr2 = head2;
        Node prev2 = null;

        while(ptr1 != null)
        {
            if(ptr1.data >= ptr2.data)
            {
                prev1 = ptr1;
                Node temp = new Node(ptr2.data);
                prev1.next = temp;
                temp.next = ptr1;
                ptr2 = ptr2.next;

            }
            else 
            {
                if(ptr1.next != null)
                {
                    prev1 = ptr1;
                    ptr1 = ptr1.next;               
                }
                else
                {
                    break; 
                }

            }
        }

            System.out.println("PTR1 >> " + ptr1.data);
            System.out.println("PTR2 >> " + ptr2.data); 
            ptr1.next = ptr2;

            return head1;
    
    }


    public static void main(String[] args)
    {
        /* Making two linked lists llist1 and llist2 */   
        LinkedList llist1 = new LinkedList();
        LinkedList llist2 = new LinkedList();

        llist1.head = new Node(2);
        Node n12 = new Node(4);
        Node n13 = new Node(6);
        llist1.head.next = n12;
        n12.next = n13;

        llist2.head = new Node(1);
        Node n22 = new Node(3);
        Node n23 = new Node(5);
        Node n24 = new Node(8);
        llist2.head.next = n22;
        n22.next = n23;  
        n23.next = n24;

        /* Before merging */
        System.out.println("Linked List 1\n");
        llist1.print_nodes();
        System.out.println("\nLinked List 2\n");
        llist2.print_nodes();

        llist1.head = merge(llist1.head, llist2.head);

        System.out.println("\nAfter merging \n");
        llist1.print_nodes();
    }
}
