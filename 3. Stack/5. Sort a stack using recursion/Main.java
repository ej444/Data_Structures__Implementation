import java.util.Stack;

public class Main
{
	public static Stack<Integer> s = new Stack<>();

	public static void main(String[] args)
	{
		s.push(1);
		s.push(2);
		s.push(-3);
		s.push(4);

		if(s.isEmpty())
		{
			System.out.println("Empty stack");
			return;
		}

		System.out.println("\nStack before sorting with top = "+ s.peek() + ">> " + s);
		sort();
		System.out.println("\nStack after sorting with top = "+ s.peek() + ">> " + s);

	}

	// Function for popping elements till the end and supplying those popped elements
	public static void sort()
	{
		if(!s.isEmpty())
		{
			int num = s.pop();
			sort();
			insert_below(num);
		}
	}

    /* Function to sort: compares popped element with existing elements of stack, if it is smaller then just push
       it otherwise keep searching for the number smaller than it. If found, insert below that number. */

	public static void insert_below(int num)
	{
		if(s.isEmpty() || num < s.peek())
		{
			s.push(num);
		}
		else if(num > s.peek())
		{
			int t = s.pop();
			insert_below(num);
			s.push(t);
		}
	}
}