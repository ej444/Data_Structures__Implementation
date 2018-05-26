public class DLinkedList
{
    Node head;

    class Node
    {
        int data;
        Node prev;
        Node next;

        Node(int d)
        {
            data = d;
            prev = null;
            next = null;
        }
    }

    // Add a node in the front of the DLL
    public void add_node_front(int new_data)
    {
        if(head == null)
        {
            head = new Node(new_data);
            return;
        }

        Node new_node = head;
        head = new Node(new_data);
        head.next = new_node;
        new_node.prev = head;
    }

    // Add a node after a given node
    public void add_node_after(Node prev_node, int new_data)
    {
        if(prev_node == null)
        {
            return;
        }

        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        new_node.prev = prev_node;
        prev_node.next = new_node;

        if(new_node.next != null)
        {
            new_node.next.prev = new_node;
        }
    }

    // Add a node at the end
    public void add_node_end(int new_data)
    {
        if(head == null)
        {
            head = new Node(new_data);
            return;
        }

        Node ptr = head;

        while(ptr.next != null)
        {
            ptr = ptr.next;
        }

        Node new_node = new Node(new_data);
        ptr.next = new_node;
        new_node.prev = ptr;
    }

    // Adds a node before a given node 
    public void add_node_before(Node after_node, int new_data)
    {
        if(after_node != null)
        {
            return;
        }

        Node new_node = new Node(new_data);
        new_node.next = after_node;
        Node temp = after_node.prev;
        after_node.prev = new_node;
        new_node.prev = temp;
    }

    // Delete a node
    void delete_node(int new_data)
    {
        // If DLL is empty
        if(head == null)
        {
            return;
        }

        // If the node to be deleted is the head node
        if(head.data == new_data)
        {
            head = head.next;
            return;
        }

        Node ptr = head;

        // Searching the node
        while(ptr != null)
        {
            if(ptr.data == new_data)
            {
                break;
            }          
            ptr = ptr.next;
        }

        ptr.prev.next = ptr.next;
        ptr.next.prev = ptr.prev;

    }
    // Prints all nodes
    public void print_nodes()
    {
        Node ptr = head;
        int i = 0;

        while(ptr != null)
        {
            ++i;
            System.out.println("Node " + i + " value => " + ptr.data);  
            ptr = ptr.next;
        }
    }
}

