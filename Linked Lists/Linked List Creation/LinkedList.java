public class LinkedList
{
    Node head;

    /* Inner class is made static so that main() can access it */
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

    public static void main(String[] args)
    {
        /* Create an empty list */
        LinkedList llist = new LinkedList();

        /* Adding 3 nodes with values */
        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        
        /* Connecting the nodes */
        llist.head.next = second;
        second.next = third;
        
    }
}
