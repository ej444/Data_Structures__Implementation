import java.io.*;

public class Main extends Deque
{
	public Main(int d)
	{
		super(d);
	}

	public static void main(String[] args)
	{
		Deque dq = new Deque(5);
		System.out.printf("Insert front:1 & insert rear:2 >> ");
		dq.insertFront(1);
		dq.insertRear(2);
		dq.print();
		System.out.printf("| front = %d, rear = %d",dq.getFront(),dq.getRear());

		System.out.printf("\nInsert rear:3,4,5 & delete front >> ");
		dq.insertRear(3);
		dq.insertRear(4);
		dq.insertRear(5);
		dq.deleteFront();
		dq.print();
		System.out.printf("| front = %d, rear = %d",dq.getFront(),dq.getRear());

		System.out.printf("\nInsert rear: 6 >> ");
		dq.insertRear(6);
		dq.print();
		System.out.printf("| front = %d, rear = %d",dq.getFront(),dq.getRear());

		System.out.printf("\nInsert rear: 7 >> ");
		dq.insertRear(7);
		dq.print();
		System.out.printf("| front = %d, rear = %d",dq.getFront(),dq.getRear());
	}
}


/* OUTPUT

Insert front:1 & insert rear:2 >> [ 1 2 ] | front = 1, rear = 2
Insert rear:3,4,5 & delete front >> [ 2 3 4 5 ] | front = 2, rear = 5
Insert rear: 6 >> [ ] | front = 2, rear = 6 (print fn different)
Insert rear: 7 >> Deque full!!
[ ] | front = 2, rear = 6

*/