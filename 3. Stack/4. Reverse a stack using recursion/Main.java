import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Stack<String> s = new Stack<>();
		Stack<String> temp = new Stack<>();
		s.push("1");
		s.push("2");
		s.push("3");
		s.push("4");

		if(s.isEmpty())
		{
			System.out.println("Empty stack");
			return;
		}

		System.out.println("\nInitial stack with top = "+ s.peek() + ">> " + s);
		reverse(s);
		System.out.println("\nFinal stack with top = "+ s.peek() + ">> " + s);

	}

	public static void reverse(Stack s)
	{
		if(!s.isEmpty())
		{
			String str = (String) s.pop();
			reverse(s);
			s.push(str);
		}
	}
}