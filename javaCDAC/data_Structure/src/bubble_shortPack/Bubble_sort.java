package bubble_shortPack;

import java.util.Scanner;

public class Bubble_sort {
private int size;
private int arr[];
static Scanner sc = new Scanner(System.in);


public Bubble_sort() 
{    
   System.out.println("Enter size of Array");
    size =sc.nextInt();
    arr = new int [size];
}

 public void accept()
 {  
	 System.out.println("Enter The Element: ");
	 for (int i = 0; i < arr.length; i++) 
	{
	      arr[i] =sc.nextInt(); 	
	}
 }
 public void sort()
 {  
	 int i,j;
	 for (i= 0; i <size -1; i++) 
	{
		for (j = 0; j <size -1 -i; j++) 
		{
		   if(arr[j]>arr[j+1])
		   {
			   int temp = arr[j];
			   arr[j]=arr[j+1];
			   arr[j+1] = temp;
	
			  
		   }
		}
	}
 }
 
 public void display()
 {
	 for (int i = 0; i < arr.length; i++) 
	{
		System.out.print("\t"+arr[i]);
	}
 }
 
 public static void main(String[] args) {
	Bubble_sort B = new Bubble_sort();
	B.accept();
	System.out.println("\n-----Element Befor Sorting-------\n");
	B.display();
	B.sort();
	System.out.println("\n---Element After Sorting\n");
	B.display();
}
}
