import java.io.*;
import java.util.*;

public class Main extends Stack
{

	public static void main(String[] args)
	{
		System.out.printf("Enter the string: ");
		Scanner in = new Scanner(System.in);
		String myString = in.nextLine();

		System.out.println("The reverse string is " + reverseStr(myString));
	}

	public static String reverseStr(String str)
	{
		Stack s = new Stack();

		/* Convert string to char array >> str.toCharArray()
		    Convert char array to string >> */

		char[] myCharArr = str.toCharArray();
		int i = 0;

		// Puttng char from char array into stack
		while(i < str.length())
		{
			s.push(myCharArr[i]);
			++i;
		}

		// Removing from stack and modifying char array
		i = 0;
		while(s.top != null)
		{
			myCharArr[i] = s.pop();
			++i;
		}

		return String.valueOf(myCharArr);
	}
}


/*

Enter the string: hello
The reverse string is olleh

Enter the string: eesh
The reverse string is hsee

Enter the string: tomato
The reverse string is otamot		

*/