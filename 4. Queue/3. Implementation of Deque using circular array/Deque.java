public class Deque
{
	static int[] arr;
	static int size, front, rear, capacity;

	public Deque(int s)
	{
		size = s;
		arr = new int[size];
		front = -1;
		rear = -1;
		capacity = 0;
	}

	public static void insertFront(int item)
	{
    	if(isFull())
    	{
    		System.out.println("Deque full!!");
    		return;
    	}
    	else if(front == -1)
    	{
    		front = 0;
    		rear = 0;
    	}
    	else if(front == 0)
    	{
    		front = size - 1;
    	}
    	else
    	{
    		--front;
    	}

    	arr[front] = item;
    	++capacity;
	}


	public static void insertRear(int item)
    {
    	if(isFull())
    	{
    		System.out.println("Deque full!!");
    		return;
    	}
    	else if(front == -1)
    	{
    		front = 0;
    		rear = 0;
    	}
    	else if(rear == size - 1)
    	{
    		rear = 0;
    	}
    	else
    	{
    		++rear;
    	}

    	arr[rear] = item;
    	++capacity;
    }


	public static int deleteFront()
	{
		if(isEmpty())
		{
			System.out.println("Deque empty!!");
			return 0;
		}
		else if(front == rear)
		{
			int temp = arr[front];
			front = -1;
			rear = -1;
			--capacity;
			return temp;
		}

		--capacity;
		return arr[front++];
	}


	public static int deleteRear()
	{
		if(isEmpty())
		{
			System.out.println("Deque empty!!");
			return 0;
		}
		else if(front == rear)
		{
			int temp = arr[rear];
			front = -1;
			rear = -1;
			--capacity;
			return temp;			
		}

		--capacity;
		return arr[rear--];
	}


	public static int getFront()
	{ 
		return arr[front]; 
	}


	public static int getRear()
	{ 
		return arr[rear]; 
	}


	public static boolean isEmpty()
	{
		if(capacity == 0)
		{
			return true;
		}
		return false;
	}


	public static boolean isFull()
	{
		if(capacity == size)
		{
			return true;
		}
		return false;
	}

	public static void print()
	{
		System.out.printf("[ ");
		for(int i = front; i <= rear; i++)
		{
			System.out.printf("%d ", arr[i]);
		}
		System.out.printf("] ");
	}
}