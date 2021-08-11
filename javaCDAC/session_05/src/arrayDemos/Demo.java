package arrayDemos;

public class Demo {
 
public static void main(String[] args)
{
//	int arr[] = new int[5]; 
//	int []arr = new int[5];
	int[] arr = new int[5];
	
//	arr[0]= 10;
//	arr[3]= 78;
	
//    System.out.println("arr[0] = " +arr[0]);
//    System.out.println("arr[3] = " +arr[3]);
	
	int a[] = {1,2,3,4,5,6,6};
	System.out.println("Array Element are: ");
	
//	for(int i= 0; i<a.length;i++)
//	{
//		System.out.println(a[i]+ "\t");
//	}
	
	
	for (int i:a)
	{
		System.out.print(i+"\t");
	}
	
	
}
}