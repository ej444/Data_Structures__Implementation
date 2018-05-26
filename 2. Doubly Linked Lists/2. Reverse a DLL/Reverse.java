import java.io.*;

public class Reverse extends DLinkedList
{
    public static void main(String[] args)
    {
        // Initializing a DLL
        DLinkedList dll = new DLinkedList();
        dll.add_node_end(1);
        dll.add_node_end(2);
        dll.add_node_end(3);
        dll.add_node_end(4);

        // DLL before reversing
        System.out.println("DLL before reverseing\n");
        dll.print_nodes();

        Node temp;
        Node ptr = dll.head.next;

        while(ptr.next != null)
        {
            temp = ptr.next;
            ptr.next = ptr.prev;
            ptr.prev = temp;
            ptr = ptr.prev;
        }

        dll.head.next.next = dll.head;
        dll.head.next = null;
        ptr.next = ptr.prev;
        ptr.prev = null;
        dll.head = ptr;

        // DLL after reversing
        System.out.println("\nDLL after reverseing\n");
        dll.print_nodes();

    }
}

/* OUTPUT

DLL before reverseing

Node 1 value => 1
Node 2 value => 2
Node 3 value => 3
Node 4 value => 4

DLL after reverseing

Node 1 value => 4
Node 2 value => 3
Node 3 value => 2
Node 4 value => 1

 */