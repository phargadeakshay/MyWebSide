package pack2.mypack;
import pack1.*;

public class B extends A{
	
	public static void main(String[] args)
	{
		B b = new B();
		System.out.println(b.no);
		b.msg();
		
		System.out.println(b.n);
	}

}
