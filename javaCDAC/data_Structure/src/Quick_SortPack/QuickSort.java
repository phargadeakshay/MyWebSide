package Quick_SortPack;

import java.util.Scanner;

public class QuickSort {
     static int size;
	private int arr[];
	Scanner sc = new Scanner(System.in);
	
	public QuickSort()
	{
	System.out.println("Enter The Size of Array: ");
	size = sc.nextInt();
	arr = new int [size];
	
	}
	
	public void accept()
	{
		System.out.println("Enter The Element of Arrray : ");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = sc.nextInt();
		}
	}
	
	public void display()
	{		
		System.out.println("Element of Array are: ");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print("\t"+arr[i]);
		}
	}
	
	int partition(int low, int high)
	{
	    int pivot = arr[low];
	    int i = low + 1;
	    int j = high;
	    int temp;

	    do
	    {
	        while (arr[i] <= pivot)
	        {
	            i++;
	        }

	        while (arr[j] > pivot)
	        {
	            j--;
	        }

	        if (i < j)
	        {
	            temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	        }
	    } while (i < j);

	    // Swap A[low] and A[j]
	    temp = arr[low];
	    arr[low] = arr[j];
	    arr[j] = temp;
	    return j;
	}
	public void quickSort(int low, int high)
	{
	    int partitionIndex;

	    if (low < high)
	    {
	        partitionIndex = partition(low, high); 
	        quickSort(low, partitionIndex - 1); 
	        quickSort(partitionIndex + 1, high);
	    }
	}

	public static void main(String[] args) 
	{
		QuickSort a = new QuickSort();
		a.accept();
		System.out.println("\nElement Befor Sorted: ");
		a.display();
		a.quickSort(0,size-1);
		System.out.println("\nElement After Sorted: ");
		a.display();
		
	}
}
