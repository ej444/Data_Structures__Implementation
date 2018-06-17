import java.io.*;

public class Main extends Queue
{
	/*  There is an implicit call to a default no-arg constructor, but Queue does not have one of those. 
	Writing super(x); will call the public Queue(int n) constructor, which is the only one available in the class. 
	*/
	public Main(int n)
	{
		super(n);
	}

	public static void main(String[] args)
	{
		Queue q = new Queue(100);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);

		System.out.printf("The queue is ");
		q.print();
		System.out.printf("with front = " + q.front() + " and rear = " + q.rear());

		System.out.println("\nDeleting an element");
		// It okay to call a function having a return type like this
		q.dequeue();

		System.out.printf("The queue is ");
		q.print();
		System.out.printf("with front = " + q.front() + " and rear = " + q.rear());

		System.out.println("\nAdding 4 & 5");
		q.enqueue(4);
		q.enqueue(5);

		System.out.printf("The queue is ");
		q.print();
		System.out.printf("with front = " + q.front() + " and rear = " + q.rear());
	}
}


/* OUTPUT

The queue is [ 1 2 3 ] with front = 1 and rear = 3
Deleting an element
The queue is [ 2 3 ] with front = 2 and rear = 3
Adding 4 & 5
The queue is [ 2 3 4 5 ] with front = 2 and rear = 5

*/