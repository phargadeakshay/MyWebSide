import java.util.Scanner;

public class Circle {
	 float pie= 3.14f;
	public float circle_area(float r) 
	{
	      float area =pie*r*r; 
		    return area;
		
	}

public float circum_of_cir(float r)
{
	float circum = 2 * pie *r;
	return circum;
}
	

public static void main() {
	
	Circle a = new Circle();
	System.out.println("Enter the redius of circle");
	Scanner s = new Scanner(System.in);
	float r = s.nextFloat();
	float b= a.circle_area(r);
	float c = a.circum_of_cir(r);
	System.out.println("Area of circle is "+b+"Circumference of circle is "+c);
	
	
}
	
	
	
	
}
