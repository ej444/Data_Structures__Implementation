import java.io.*;

public class Main extends DLinkedList
{
    public static void main(String[] args)
    {
        DLinkedList dll = new DLinkedList();

        // Initializing a DLL
        System.out.println("DLL initialized\n");
        dll.add_node_end(1);
        dll.print_nodes();

        // Adding node at the end
        System.out.println("\nAdding node at the end\n");
        dll.add_node_end(2);
        dll.print_nodes();

        // Adding node at the front
        System.out.println("\nAdding node at the front\n");
        dll.add_node_front(3);
        dll.print_nodes();

        // Adding node after a given node
        System.out.println("\nAdding a node with value 4 after head node\n");
        dll.add_node_after(dll.head, 4);
        dll.print_nodes();

        // Adding node before a given node
        System.out.println("\nAdding node with value 5 before a node with value 4\n");
        dll.add_node_after(dll.head, 5);
        dll.print_nodes();

        // Deleting a node
        System.out.println("\nDeleting a node with value 5\n");
        dll.delete_node(5);
        dll.print_nodes();      
    }
}

/* OUTPUT

DLL initialized

Node 1 value => 1

Adding node at the end

Node 1 value => 1
Node 2 value => 2

Adding node at the front

Node 1 value => 3
Node 2 value => 1
Node 3 value => 2

Adding a node with value 4 after head node

Node 1 value => 3
Node 2 value => 4
Node 3 value => 1
Node 4 value => 2

Adding node with value 5 before a node with value 4

Node 1 value => 3
Node 2 value => 5
Node 3 value => 4
Node 4 value => 1
Node 5 value => 2

Deleting a node with value 5

Node 1 value => 3
Node 2 value => 4
Node 3 value => 1
Node 4 value => 2

 */