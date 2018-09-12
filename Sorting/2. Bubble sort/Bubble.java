/*

Bubble_Sort(A,n)
{
	for(i = 0:n-2)             // Total n-1 iterations
	{
		for(j = 0:n-i-2)         // Total comparisions at each iteration
		{
			if(A[j] > A[j+1]) {swap(A[j], A[j+1]);}
		}
	}
}


*/


public class Bubble
{
	public static void main(String[] args)
	{
		int[] a = {5,4,3,2,1};
		int n = a.length;

		for(int i=0; i<=n-2; i++)
		{
			for(int j=0; j<=n-i-2; j++)
			{
				if(a[j] > a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			print_arr(a, n);
			System.out.println();
		}

 	}

 	public static void print_arr(int[] arr, int n)
 	{
 		for(int i : arr)
 		{
 			System.out.printf("%d ", i);
 		}
 	}
}