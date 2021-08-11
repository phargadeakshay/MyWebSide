package abstractDemos;

public class Rectangle extends Shape {
	int a;
	public Rectangle(int x , int y)
	{
		super(x,y);
		
	}
	
	public void area()
	{
		a = x*y;
		System.out.println("area of rectangle = "+a);
	}

}
