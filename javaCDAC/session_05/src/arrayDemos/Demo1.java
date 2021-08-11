package arrayDemos;

public class Demo1 {
	
	public static void main(String[] args)
	{
//		int[][] arr = new int[2][2];
//		arr[0][0] = 10;
//		System.out.println("arr[0][0] = "+arr[0][0]);
		
	int [][]arr = new int[][] {{1,2,3},{3,4},{5,7}};
	
//	int a[][] = {{1,2,3},{3,4},{5,6,7}};
//	int[][] ar a= new int[2][];  
//	row is must in java
//	column is must in c
	
	for(int i =0; i<arr[i].length;i++)
		for(int j=0;j<arr[i].length;j++)
		{
			System.out.print(arr[i][j]+"\t");
			
		}
	System.out.println();
		
	}
	

}
