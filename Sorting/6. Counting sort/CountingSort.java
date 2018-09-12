public class CountingSort
{
	public static void main(String[] args)
	{
		int[] arr = {5,4,1,4,3,2,1};
		print(arr);
		sort(arr);
		print(arr);
	}

	public static void sort(int[] a)
	{
		// c array indices are the range of numbers in which our i/p array lies. We initialize the elements to 0.
		int[] c = new int[10];
		for(int i=0; i<10; i++)
			c[i] = 0;

		// Array in which the new sorted values will be inserted
		int[] b = new int[a.length];

		// c array stores the counts of occurance of each element
		for(int i=0; i<a.length; i++)
			c[a[i]] = c[a[i]] + 1;

		// Updating the c array to store the last position of a element
		for(int i=1; i<10; i++)
			c[i] = c[i] + c[i-1];

		// Placing elements in b array
		for(int i=0; i<a.length; i++)
		{
			b[c[a[i]]-1] = a[i];
			c[a[i]] = c[a[i]] - 1;
		}

		for(int i=0; i<a.length; i++)
			a[i] = b[i];
	}

	public static void print(int[] arr)
	{
    for (int i=0; i<arr.length; ++i) 
    {
      System.out.print(arr[i]);
    	System.out.print(" ");
    }
    System.out.println();
	}
}