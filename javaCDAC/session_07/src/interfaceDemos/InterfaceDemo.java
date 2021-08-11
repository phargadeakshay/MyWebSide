package interfaceDemos;

public class InterfaceDemo {

	public static void main(String[] args)
	{
		AllCalculations a= new AllCalculations();
		a.fact(5);
		a.add(10,20);
		a.sub(56,45);
		a.min(7,9);
		a.avg(67,67);
		System.out.println("No ="+a.NO);
	}
	
}
