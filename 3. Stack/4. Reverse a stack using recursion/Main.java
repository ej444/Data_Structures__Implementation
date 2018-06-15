import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);

		System.out.println("Initial stack with top = " + s.peek() + " >> " + s);

		/* 
		flag = 0 >> pop elements and save in array
		flag = 1 >> push the elements of the array back to the stack
		flag = 2 >> Just return
		*/ 
		int flag = 0, i=0;
		int[] arr = new int[1000];

		reverse(s, flag, arr, i);
		System.out.println("\nFinal stack with top = " + s.peek() + " >> " + s);

	}

	public static void reverse(Stack s, int flag, int[] arr, int i)
	{
		if(flag == 0)
		{
			if(s.isEmpty())
			{
				flag = 1;
				--i;
				reverse(s, flag, arr, i);
			}
			else
			{
				arr[i] = s.pop();
				reverse(s, flag, arr, ++i);
			}
		}

		else if(flag == 1)
		{
			if(i == -1)
			{
				flag = 2;
				return;
			}
			s.push(arr[i]);
			reverse(s, flag, arr, --i);
		}
		return;
	}
}