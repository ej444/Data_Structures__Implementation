import java.util.Stack;

public class Main
{
	public static Stack<Integer> s = new Stack<>();

	public static void main(String[] args)
	{
		int[] arr = {4,5,2,25};

		// Push the first element of the array
		s.push(arr[0]);

		/* This is iterating over each element of the array. It compares the existing values in the stack with
		current values. */
		for(int i = 1; i < arr.length; i++)
		{
			int curr = arr[i];

			if(!s.isEmpty())
			{
				int prev = s.pop();
				// The current value is the next greatest element of the previous element. 
				while(curr > prev)
				{
					System.out.println(prev + "   -> " + curr);
					if(s.isEmpty())
					{
						break;
					}
					// The prev value is popped and new prev value takes place
					prev = s.pop();
				}

				// If no next greatest element found
				if(prev > curr)
				{
					s.push(prev);
				}
			}

			// As of now, we do not know the NGE of the curr value. So, pushing it in the stack.
			s.push(curr);
		}

		/* At this point, the stack contains elements with no NGE. So, printing -1 for them. The order is different
		from the input array. */
		while(!s.isEmpty())
		{
			System.out.println(s.pop() + " -> -1");
		}	
	}
}


/* OUTPUT

4   -> 5
2   -> 25
5   -> 25
25 -> -1

*/