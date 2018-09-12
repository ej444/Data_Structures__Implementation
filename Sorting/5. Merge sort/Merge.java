public class Merge
{
	public static void main(String[] args)
	{
    int arr[] = {12, 11, 13, 7, 6, 5}; 
  
    System.out.println("Given Array"); 
    printArray(arr); 
  
    Merge ob = new Merge(); 
    ob.sort(arr, 0, arr.length-1); 
  
    System.out.println("\nSorted array"); 
    printArray(arr);
	}

	public static void merge(int a[], int front, int rear)
	{
		int mid = (front + rear)/2;
		int n1 = mid - front + 1;
		int n2 = rear - mid;

    int[] l = new int [n1]; 
    int[] r = new int [n2]; 

		int i = 0;
		while(i < n1)
		{
			l[i] = a[front+i];
			++i;
		}

		int j = 0;
		while(j < n2)
		{
			r[j] = a[mid+j+1];
			++j;
		}

		i=0;
		j=0;
		int k=front;

		while(i < n1 && j < n2)
		{
			if(l[i] <= r[j])
			{
				a[k] = l[i];
				++i;
			}
			else
			{
				a[k] = r[j];
				++j;
			}
			++k;
		}

		while(i < n1)
		{
			a[k] = l[i];
			++i;
			++k;
		}

		while(j < n2)
		{
			a[k] = r[j];
			++j;
			++k;
		}
	}

	public static void sort(int a[], int front, int rear)
	{
		int mid = (front+rear)/2;
		if(front < rear)
		{
			sort(a, front, mid);
			sort(a, mid+1, rear);
			merge(a, front, rear);
		}
	}

  static void printArray(int[] arr) 
  { 
    int n = arr.length; 
    for (int i=0; i<n; ++i) 
      System.out.print(arr[i] + " "); 
    System.out.println(); 
    } 
}
