public class Queue
{
	static int[] queue;
	static int front, rear;
	static int size;
	static int S;

    public Queue(int n)
	{
		S = n;
		queue = new int[S];
		front = 0;
		rear = -1;
		size = 0;
	}

	public static boolean isFull()
	{
		if(rear == S - 1)
		{
			return true;
		}
		return false;
	}

	public static boolean isEmpty()
	{
		if(size == 0)
		{
			return true;
		}
		return false;
	}

	public static void enqueue(int item)
	{
		if(isFull())
		{
			System.out.println("Queue full!!");
			return;
		}
		++size;
		queue[++rear] = item;
	}

	public static int dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue empty!!");
			return 0;
		}	

		--size;
		return queue[++front];
	}

	public static int front()
	{
		return queue[front];
	}

	public static int rear()
	{
		return queue[rear];
	}

	public static void print()
	{
		System.out.printf("[ ");
		for(int i = front; i <= rear; i++)
		{
			System.out.printf("%d ", queue[i]);
		}
		System.out.printf("] ");
	}
}