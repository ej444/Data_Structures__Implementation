// 0 means the the node is empty

public class Main
{
	public static class Stack
	{
		int size;
		int top1, top2;
		int arr[];

		// Constructor
		Stack(int n)
		{
			size = n;
			arr = new int[size];
			top1 = -1;
			top2 = size;
		}

		// Function to push data in stack1
		void push1(int data)
		{
			if(top2 - top1 - 1 > 0)
			{
				arr[++top1] = data;
			}
			else
			{
				System.out.println("Data Overflow\n");
			}
		}

		// Function to push data in stack2
		void push2(int data)
		{
			if(top2 - top1 - 1 > 0)
			{
				arr[--top2] = data;
			}
			else
			{
				System.out.println("Data Overflow\n");
			}
		}

		// Function to pop data from stack1
		void pop1()
		{
			if(top1 == -1)
			{
				System.out.println("Data Underflow\n");
			}
			else
			{
				arr[top1] = 0;
				--top1;
			}
		}

		// Function to pop data from stack2
		void pop2()
		{
			if(top2 == size)
			{
				System.out.println("Data Underflow\n");
			}
			else
			{
				arr[top2] = 0;
				++top2;
			}
		}

		void print()
		{
			System.out.printf("The updated array is : ");
			for(int i : arr)
			{
				System.out.printf(i + " ");
			}
			System.out.println();
		}
	}


	public static void main(String[] args)
	{
		Stack s = new Stack(10);

		System.out.println("\nPushing 1,2 in stack1 & popping\n");
		s.push1(1);
		s.push1(2);
		s.print();
		s.pop1();
		s.print();

		System.out.println("\nPushing 10,9 in stack2 & popping\n");
		s.push2(10);
		s.push2(9);
		s.print();
		s.pop2();
		s.print();

		System.out.println("\nAdding 9,8,7,6,5,4,3,2,1 in stack 1 & stack2\n");
	    s.push2(9);
	    s.push2(8);
	    s.push2(7);
	    s.push2(6);
	    s.push2(5);
	    s.push2(4);
	    s.push1(2);
	    s.push1(3);
	    s.print();

	    System.out.printf("\nAfter the stack is full, adding 15 to stack 1: ");
	    s.push1(15);
	}
}


/* OUTPUT

Pushing 1,2 in stack1 & popping

The updated array is : 1 2 0 0 0 0 0 0 0 0
The updated array is : 1 0 0 0 0 0 0 0 0 0

Pushing 10,9 in stack2 & popping

The updated array is : 1 0 0 0 0 0 0 0 9 10
The updated array is : 1 0 0 0 0 0 0 0 0 10

Adding 9,8,7,6,5,4,3,2,1 in stack 1 & stack2

The updated array is : 1 2 3 4 5 6 7 8 9 10

After the stack is full, adding 15 to stack 1: Data Overflow

*/