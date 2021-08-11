public class MathOperation1 {
	
	public int multiplay(int a,int b)
	{
		return  a*b;
	}
	public float multiplay(float a,float b,float c)
	{
		return a*b*c;
	}
	public double multiplay(double a,int b)
	{

		return a*b;
	}
	
	public int multiplay(int... x)
	{
		int count = x.length;
		int sum = 1;
		for (int i = 0; i < count; i++) {
			sum = sum * x[i];
		}
		return sum;
	}
 public static void main(String[] args)
 {
	 MathOperation1 a = new MathOperation1();
	 System.out.println(a.multiplay(1,1,1,1,1,1,5,2));
	 System.out.println(a.multiplay(1,2));
	 System.out.println(a.multiplay(2.5,5));
	 System.out.println(a.multiplay(3,5,6));
 }

}
