package search;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search{
	private int size;
	private int arr[];

static Scanner sc = new Scanner(System.in);

public Binary_Search()
{
	System.out.println("\nEnter Size: ");
	size = sc.nextInt();
	arr = new int[size];
}
public void accept()
{
	System.out.println("Enter the sorted Elements:: ");
	for (int i = 0; i < size; i++) 
	{
		arr[i]=sc.nextInt();
	}
}
public void display()
{
	System.out.println("Elements:: ");
	System.out.println(Arrays.toString(arr));
}
public int binarySearch(int element){
    int low, mid, high;
    low = 0;
    high = size-1;
    // Keep searching until low <= high
    while(low<=high){
        mid = (low + high)/2;
        if(arr[mid] == element){
           return mid;
     
        }
        if(arr[mid]<element){
            low = mid+1;
        }
        else{
            high = mid -1;
        }
    } 
    return -199;
    
}


//public void Search(int key)
//{
//	int mid=-1,flag = 0;
//	int i=0,j=size;
//	while(i!=j)
//	{
//		mid = (i+j)/2;
//		if(key == arr[mid])
//		{
//			flag = 1;
//			break;
//		}
//		else if(key <arr[mid])
//		{
//			i = 0;
//			j = mid;
//			continue;
//		}
//		else if(key >arr[mid])
//		{
//			i=mid+1;
//			j=size;
//			continue;
//		}
//	}
//	if(flag==0)
//	{
//		System.out.println("\tElement is NOT FOUND..");
//	}
//	else
//	{
//		System.out.println("\tElement found at index "+mid);
//	}
//}

public static void main(String[] args) {
	int ch;
	Binary_Search obj = new Binary_Search();
	obj.accept();
	obj.display();
	
	
	do {
		System.out.println("\n1: Search \n0:exit");
		ch=sc.nextInt();
		if(ch==1)
		{
			obj.display();
			System.out.println("\nEnter key to search:: ");
			int key = sc.nextInt();
//			obj.Search(key);
			int a =obj.binarySearch(key);
			if(a== -199)
			{
				System.out.println("Not Found..");
			}
			else {
				System.out.println("element Found: "+a);
			}
		}
		else
		{
		  System.exit(0);	
		}
	} while (ch !=0);
}
	
	
	
	
}
