import java.util.Stack;

public class Main
{
	public static Stack<Integer> s = new Stack<>();

	public static void main(String[] args)
	{
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);

		if(s.isEmpty())
		{
			System.out.println("Empty stack");
			return;
		}

		System.out.println("\nInitial stack with top = "+ s.peek() + ">> " + s);
		sort();
		System.out.println("\nFinal stack with top = "+ s.peek() + ">> " + s);

	}

	public static void sort()
	{
		if(!s.isEmpty())
		{
			int num = s.pop();
			sort();
			insert_below(num);
		}
	}

    // If the number is bigger than
	public static void insert_below(int num)
	{
		if(s.isEmpty())
		{
			s.push(num);
		}
		else if(num > s.peek())
		{
			insert_below(num);
		}
		else if(num < s.peek())
		{
			s.push(num);
		}
	}
}