import java.util.Stack;

public class Main
{
	public static Stack<Integer> s = new Stack<>();

	public static void main(String[] args)
	{
		int[] price = {10, 4, 5, 90, 120, 80};
		int[] span_values = new int[price.length];

		// Note: Pushing index rather than the value
		s.push(0);
		SSP(price, span_values);
		System.out.printf("The price values are: ");
		for(int i : price)
		{
			System.out.printf(i + " ");
		}
		System.out.println("\n");
		System.out.printf("The span values are: ");
		for(int i : span_values)
		{
			System.out.printf(i + " ");
		}	
	}

	public static void SSP(int[] price, int[] span_values)
	{
		// The first value will have span = 1
		span_values[0] = 1;

		for(int i = 1; i < price.length; i++)
		{
			// If smaller previous elements found, it is popping the stack
			while(!s.isEmpty() && price[s.peek()] <= price[i])
			{
				s.pop();	
			}

			// Distances b/w the indexes is subtracted
			span_values[i] = s.isEmpty() ? i+1 : i - s.peek();
			s.push(i);
		}
	}
}


/* OUTPUT

The price values are: 10 4 5 90 1

The span values are: 1 1 2 4 5 1

*/