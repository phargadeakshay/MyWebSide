package interfaceDemos;

public class Demo implements Printable {

	public void print()
	{
		System.out.println("Printing ");
		
	}
	public static void main(String[] args)
	{
		Printable p = new Demo();
		p.print();
	}
}
