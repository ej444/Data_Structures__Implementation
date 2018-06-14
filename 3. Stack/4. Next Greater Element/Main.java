public class Main
{
	public static void main(String[] args)
	{
		int[] arr = {4, 2, 3, 7, 2, 25};

		printNGE(arr, arr.length);
	}

	public static void printNGE(int[] arr, int n)
	{
		int max = arr[n-1]; 
		arr[n-1] = -1;

		for(int i = n-2; i>=0; i--)
		{
			if(arr[i] > max)
			{
				max = arr[i];
				arr[i] = -1;
			}
			else
			{
				arr[i] = max;
			}
		}

		System.out.printf("The Next Greater Element array is: ");
		for(int j : arr)
		{
			System.out.printf(j + " ");
		}
	}
	
}