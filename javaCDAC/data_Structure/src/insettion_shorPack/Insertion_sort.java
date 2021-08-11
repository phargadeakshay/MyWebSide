package insettion_shorPack;

import java.util.Scanner;

public class Insertion_sort {
private int size;
private int arr[];
static Scanner sc =new Scanner(System.in);

public Insertion_sort()
{
	System.out.println("Enter the Seze of Arrray");
	size = sc.nextInt();
	arr = new int[size];
}
public void accept()
{
	System.out.println("Enter the Element of array");
	for (int i = 0; i < arr.length; i++) 
	{
		arr[i] =sc.nextInt();
	}
}
public void sort()
{
	int i,j,small;
	for(i = 1; i<size;i++)
	{
		small = arr[i];
		for (j = i-1;j>-1 && arr[j]>small;j--)
		{
			arr[j+1] =arr[j];
		}
		arr[j+1] = small;
	}
}
public void display()
{
	for (int i = 0; i < arr.length; i++) {
		System.out.print("\t"+arr[i]);
	}
}
public static void main(String[] args) {
	Insertion_sort s1 = new Insertion_sort();
	s1.accept();
	System.out.println("\n------Befor Insetion sorting--------\n");
	s1.display();
	s1.sort();
	System.out.println("\n------After Insetion sorting--------\n");
	s1.display();
}

}
