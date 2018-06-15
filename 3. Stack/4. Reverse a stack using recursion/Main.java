import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Stack<String> s = new Stack<>();
		Stack<String> temp = new Stack<>();
		s.push('1');
		s.push('2');
		s.push('3');
		s.push('4');

		if(s.isEmpty())
		{
			System.out.println("Empty stack");
			return;
		}

		System.out.println("\nInitial stack with top = "+ s.peek() + ">> " + s);
		s = reverse(s, temp);
		System.out.println("\nFinal stack with top = "+ s.peek() + ">> " + s);

	}

	public static Stack reverse(Stack s, Stack temp)
	{
		if(!s.isEmpty())
		{
			temp.push(s.pop());
			return reverse(s, temp);
		}
		else
		{
			return temp;
		}
	}
}