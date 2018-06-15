/* 
import java.util.*; ...... gives error
Main.java:5: error: type Stack does not take parameters
        public static Stack<String> s = new Stack<>();
                           ^
Main.java:5: error: cannot infer type arguments for Stack
        public static Stack<String> s = new Stack<>();
                                                 ^
  reason: cannot use '<>' with non-generic class Stack
2 errors

But import.java.util.Stack; does not.
*/

import java.util.Stack;

public class Main
{
	public static Stack<String> s = new Stack<>();

	public static void main(String[] args)
	{
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
		reverse();
		System.out.println("\nFinal stack with top = "+ s.peek() + ">> " + s);

	}


	// Function to go at the bottom of the stack
	public static void reverse()
	{
		if(!s.isEmpty())
		{
			String str = s.pop();
			reverse();
			insert_at_bottom(str);
		}

	}


	//This function places the incoming item at the bottom of the existing stack
	public static void insert_at_bottom(String str)
	{
		// Empties the whole stack and at last push the incoming item.
		if(s.isEmpty())
		{
			s.push(str);
		}
		else
		{
			// Keep pushing other elements of the stack after the incoming item has been push to the last. 
			String temp = s.pop();
			insert_at_bottom(str);
			s.push(temp);
		}
	}
}