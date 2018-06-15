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
		System.out.printf("The span values are: ");
		for(int i : span_values)
		{
			System.out.printf(i + " ");
		}	
	}

	public static void SSP(int[] price, int[] span_values)
	{
		price[0] = 1;

		for(int i = 1; i < price.length; i++)
		{

		}
	}
}


/* OUTPUT


*/