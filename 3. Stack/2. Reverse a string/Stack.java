public class Stack
{
    // Always points to the top of the stack
    Node top;

    // Same as LinkedList
    class Node
    {
        char data;
        Node next;

        Node(char d)
        {
            data = d;
            next = null;
        } 
    }

    // Function to push an element in the stack having value == data
    public void push(char data)
    {
        Node temp = new Node(data);
        temp.next = top;
        top = temp;
    }

    // Function to pop the topmost element of the stack
    public char pop()
    {
        if(top == null)
        {
            System.out.println("\nStack Underflow");
            top = null;
            return '0';
        }
        char data = top.data;
        top = top.next;
        return data;
    }

    // Function to print all the elements of the stack
    public void print()
    {
        Node ptr = top;

        while(ptr != null)
        {
            System.out.println(ptr.data);
            ptr = ptr.next;
        }   
    }
}