
public class Addition {
	public int add(int... x)
	{
		int count = x.length;
		int sum = 0;
		System.out.println("Count = "+count);
		for (int i = 0; i < count; i++) {
			sum = sum + x[i];
		}
		return sum;
	}
	public static void main(String[] args)
	{
		Addition a = new Addition();
		System.out.println(a.add(1,2,3,4,5));
		System.out.println(a.add(5,6,7,8));
	}

}
