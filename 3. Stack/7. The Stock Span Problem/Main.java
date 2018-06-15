import java.util.Stack;

public class Main
{
	public static Stack<Integer> s = new Stack<>();

	public static void main(String[] args)
	{
		int[] arr = {10, 4, 5, 90, 120, 80};
		int[] span_values = new int[arr.length];
		s.push(arr[0]);
		SSP(arr, span_values);
		System.out.printf("The span values are: ");
		for(int i : span_values)
		{
			System.out.printf(i + " ");
		}	
	}
}


/* OUTPUT


*/