public class Stack
{
    // Always points to the top of the stack
    Node top;

    // Same as LinkedList
    class Node
    {
        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        } 
    }

    // Function to push an element in the stack having value == data
    public void push(int data)
    {
        Node temp = new Node(data);
        temp.next = top;
        top = temp;
    }

    // Function to pop the topmost element of the stack
    public void pop()
    {
        if(top == null)
        {
            System.out.println("\nStack Underflow");
            return;
        }
        top = top.next;
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