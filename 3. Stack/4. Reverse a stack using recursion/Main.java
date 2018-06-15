import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Stack<String> s = new Stack<>();
		Stack<StringIndexOutOfBoundsException> temp = new Stack<>();
		s.push("1");
		s.push("2");
		s.push("3");
		s.push("4");

		System.out.println("Initial stack: " + s);

		/* 
		flag = 0 >> pop elements and save in array
		flag = 1 >> push the elements of the array back to the stack
		*/ 
		int flag = 0;

		reverse(s, flag, temp);
		System.out.println("\nFinal stack: " + s);

	}

	public static void reverse(Stack s, int flag, Stack temp)
	{
		if(flag == 0)
		{
			if(s.isEmpty())
			{
				flag = 1;
				reverse(s, flag, temp);
			}
			else
			{
				temp.push(s.pop());
				reverse(s, flag, temp);
			}
		}

		else if(flag == 1)
		{
			if(temp.isEmpty())
			{
				s.push(temp.pop());
				reverse(s, flag, temp);
			}
			return;
		}
		return;
	}
}