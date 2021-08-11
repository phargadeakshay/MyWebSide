package pack_08;

public class StringSplit {

	public static void main(String[] args) {
		
	
	int sum = 0;
	String s = "1,2,3,4,5";
	String[] arr_name = s.split(",");
	
	int[] intArr = new int[arr_name.length];
	for (int i = 0; i < intArr.length; i++) {
		String num = arr_name[i];
		System.out.println("what is in the num\t"+num);
		intArr[i] = Integer.parseInt(num);
		sum = sum+intArr[i];
	}
	for(int n : intArr) 
	{
		System.out.println(n);
	}
	System.out.println("Sum if integers = "+sum);
		
}
}