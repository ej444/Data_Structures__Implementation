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

		System.out.println("\n Pushing 1,2 in stack1 & popping\n");
		s.push1(1);
		s.print();
		s.push2(2);
		s.print();
		s.pop1();
		s.print();

		System.out.println("\n Pushing 10,9 in stack2 & popping\n");
		s.push1(1);
		s.print();
		s.push2(2);
		s.print();
		s.pop1();
		s.print();

		System.out.println("\nAdding 9,8,7 in stack2\n");
	    s.push2(9);
	    s.push2(8);
	    s.push2(7);

	    s.print();

	    System.out.println("Adding 15 to stack 1\n");
	    s.push1(15);
	}
}