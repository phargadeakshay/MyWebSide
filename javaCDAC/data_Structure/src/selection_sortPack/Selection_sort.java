package selection_sortPack;

import java.util.Scanner;

public class Selection_sort {
	
	private int size;
	private int arr[];
	static Scanner sc = new Scanner(System.in);
	
	public Selection_sort()
	{
		System.out.println("Enter size of array: ");
		size=sc.nextInt();
		arr = new int[size];
	}
	public void accept()
	{
		System.out.println("Enter the value");
		for(int i= 0;i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
	}
	public void display()
	{
		System.out.println("Element: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("\t"+arr[i]);
		}
	}
     public void sort()
     {
    	 int i,j,small;
    	 for(i = 0;i<size-1; i++)
    	 {
    		 small =i;
    		 for (j = i+1; j < size; j++) 
    		 {
    			 if(arr[j]<arr[small])
    			 {
    				 small= j;
    			 }
			}
    		 if(i!=small)
    		 {
    			 int temp = arr[i];
    			 arr[i] = arr[small];
    			 arr[small] = temp;
    		 }
    	 }
     }
     public static void main(String[] args) 
    {
		Selection_sort s= new Selection_sort();
		s.accept();
		System.out.println("\n---------befor sorting-----------");
		s.display();
		s.sort();
		System.out.println("\n---------After sorting-----------");
		s.display();
	}
}
