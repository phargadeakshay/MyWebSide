package abstractDemos;

public abstract class Shape {
	
protected int x,y;
	
	public Shape(int x)
	{
		this.x= x;
		
	}
	public Shape(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public abstract void area();
	public void sayHello()
	{
		System.out.println("Hello");
	}
}
