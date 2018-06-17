public class Queue
{
	static Node front, rear;
	static int size = 0;

	public static class Node
	{
		int data;
		Node next;

		public Node(int d)
		{
			data = d;
			next = null;
		}
	}

	public static void enqueue(int item)
	{
		Node temp = new Node(item);
		if(isEmpty())
		{
			front = temp;
			rear = temp;
		}

		++size;
		rear.next = temp;
		rear = rear.next;
	}

	public static int dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue empty!!");
			return 0;
		}	

		--size;
		int node_value = front.data;
		front = front.next;
		return node_value;

	}

	public static int front()
	{
		return front.data;
	}

	public static int rear()
	{
		return rear.data;
	}

	public static boolean isEmpty()
	{
		if(size == 0)
		{
			return true;
		}
		return false;
	}

	public static void print()
	{
		Node temp = front;
		System.out.printf("[ ");
		while(temp != null)
		{
			System.out.printf("%d ", temp.data);
			temp = temp.next;
		}
		System.out.printf("] ");
	}

}