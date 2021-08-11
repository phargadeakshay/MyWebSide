package abstractDemos;

public class Circle extends Shape {
	double a;
	
	public Circle(int x)
	{
		super(x);
	}
	public void area()
	{
		a = 3.14f *x*x;
		System.out.println("Area of circle = "+a);
	}

}
