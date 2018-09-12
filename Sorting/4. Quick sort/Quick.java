public class Quick
{
	public static void main(String[] args)
	{
    int arr[] = {10, 7, 8, 9, 1, 5}; 
    int n = arr.length; 
  
    Quick ob = new Quick(); 
    ob.sort(arr, 0, n-1); 
  
    System.out.println("sorted array"); 
    printArray(arr); 
	}

  static void printArray(int arr[]) 
  { 
    int n = arr.length; 
    for (int i=0; i<n; ++i) 
      System.out.print(arr[i]+" "); 
    System.out.println(); 
  } 


	public static void sort(int[] arr, int front, int rear)
	{
		if(front < rear)
		{
			int pivot = partition(arr, front, rear);
			sort(arr, front, pivot-1);
			sort(arr, pivot+1, rear);
		}
	}


	public static int partition(int[] arr, int front, int rear)
	{
		int pivot = arr[rear];

		int i = front-1;

		for(int j = front; j <= rear; j++)
		{
			if(arr[j] < pivot)
			{
				++i;
				swap(arr, i, j);
			}
		}

		swap(arr, i+1, rear);
		return i+1;
	}

	public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}