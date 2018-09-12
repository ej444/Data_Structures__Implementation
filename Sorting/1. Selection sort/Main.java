/* Selection Sort
The selection sort algorithm sorts an array by repeatedly finding the minimum element 
(considering ascending order) from unsorted part and putting it in the sorted part. The algorithm maintains two 
subarrays in a given array.

1) The subarray which is already sorted.
2) Remaining subarray which is unsorted.

In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted 
subarray is picked and moved to the sorted subarray. 


Selection_Sort(A,n)
{
	for(i = 1:n-1)
	{
		min_index = i;
		for(j = i:n-1) {if(A[i] > A[j]) {min_index = j;}}
		swap(A[i], A[min_index]);
	}
}


*/

public class Main
{
	public static void main(String[] args)
	{
		int[] arr = {50, 40, 30, 20, 10};
		printArray(arr);
		selectionSort(arr, arr.length);
		printArray(arr);
	}


	public static void selectionSort(int[] arr, int size)
	{
		int min, min_index = 0, temp;
		for(int i=0; i<size-1; i++)
		{
			min_index = i;

			for(int j=i+1; j<size; j++)
			{
				if(arr[i] > arr[j])
				{
					min_index = j;
				}
			}

			temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;
		}
	}

	public static void printArray(int[] arr)
	{
		for(int i : arr)
		{
			System.out.printf("%d ", i);
		}
		System.out.println();
	}
}