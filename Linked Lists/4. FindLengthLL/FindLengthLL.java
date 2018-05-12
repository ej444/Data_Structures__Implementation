import java.io.*;

public class FindLengthLL extends LinkedList
{
    public static void main(String[] args)
    {
        LinkedList llist = new LinkedList();
        llist.head = new Node(1);
        Node second = new Node(2);
        
        llist.head.next = second;
        
        llist.print_nodes();
        
    }
}