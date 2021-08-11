import java.util.*;
public class Rectangle_area {
	
	public int rect(int l ,int b)
	{
	    int Area;
		Area = l *b;
		return Area;	
	}
	
public static void main(String[] args) {
	
	Rectangle_area a = new Rectangle_area();
	System.out.println("Enter the length and width of rectangle");
	Scanner s = new Scanner(System.in);
	int l = s.nextInt();
	int b = s.nextInt();
	int r = a.rect(l,b);
    System.out.println("Area of Rectangale is:  "+r);
}

}
