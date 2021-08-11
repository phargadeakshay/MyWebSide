import java.util.Scanner;

public class Area_m {
	
	private float pi = 3.14f;
	public float x,r;
	
	Scanner s = new Scanner(System.in);
	
	public void init()
	{
		System.out.println("Enter The value");
		 r=s.nextInt();
		 multiplay();
	}
	public void multiplay()
	{  
		x = (float) (pi * r*r);
		display();
	}

	public void display()
	{
		System.out.println(x);
	}
	
	
	public static void main(String[] arg)
	{
		Area_m t = new Area_m();
		t.init();
	}

}

