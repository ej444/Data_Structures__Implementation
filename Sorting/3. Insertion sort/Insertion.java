/*

Insertion_Sort(A,n)
{
	for(i = 1:n-1)
	{
		num = A[i];
		j = i-1;
		while(j>0 && num < A[j])
		{
			A[j+1] = A[j];
			--j;
		}
		A[j+1] = num;
	}
}

*/

public class Insertion
{
	public static void main(String[] args)
	{
		int[] A = {5,4,3,2,1};
		int n = A.length;

		for(int i=1; i<=n-1; i++)
		{
			int num = A[i];
			int j = i-1;
			while(j>=0 && num < A[j])
			{
				A[j+1] = A[j];
				--j;
			}
			A[j+1] = num;
			print_arr(A,n);
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