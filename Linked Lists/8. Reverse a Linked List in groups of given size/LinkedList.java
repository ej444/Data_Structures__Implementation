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
    
    
    /* Function to print all the node values of the Linked List */
    public void print_nodes()
    {
        /* Linked List traversal */
        Node n = head;
        
        int i=1;
        while(n != null)
        {
            System.out.println("Node " + i++ + " value => " + n.data);
            n = n.next;
        }
        
        return;
    }
    
    
    /* Function to add the nodes at the front */
    public void add_node_front(int new_data)
    { 
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;  
        
        return;
    }
    
    
    /* Function to add the nodes after a given node */
    public void add_node_after(Node previous_node, int new_data)
    { 
        /* Checking if the previous node exists */
        if(previous_node == null)
        {
            System.out.println("Previous node cannot be null");
        }
        
        Node new_node = new Node(new_data);
        new_node.next = previous_node.next;
        previous_node.next = new_node;
        
        return;
    }
    
    
    /* Function to add the nodes at the end */
    public void add_node_end(int new_data)
    {
        
        Node new_node = new Node(new_data);
        
        /* If the linked list is empty. */
        if(head == null)
        {
            head = new_node;
            return;
        }
        
        Node last = head;
        while(last.next != null)
        {
            last = last.next;
        }
        
        last.next = new_node;
        
        return;
    }
	

    /* Function to delete the node whose value == key */
    public void delete_node_by_key(int key)
    {
        Node temp = head;
        Node prev = null;
        
        /* If the key == value of first node */
        if(temp != null && temp.data == key)
        {
            head = head.next;
            return;
        }

        /* Searching the Linked List for the key  */
        while(temp.next != null)
        {
            if(temp.data == key)
            {
                break;      
            }
            prev = temp;
            temp = temp.next;
        }

        /* Key not found in the Linked List */
        if(temp == null)
        {
            return;
        }

        /* Deleting the temp node */
        prev.next = temp.next;
        
        return;
    }
    
    
    /* Function to delete the node whose position is passed in the function (starting from zero) */
    public void delete_node_by_pos(int position)
    {
        if(position == 0)
        {
            head = head.next;
            return;
        }
        
        int i = 0;
        Node temp = head;
        Node prev = null;
        
        while(temp != null)
        {
            if(i == position)
            {
                prev.next = temp.next;
                return;
            }
            prev = temp;
            temp = temp.next;
            i++;
        }
        return;
    }	
}