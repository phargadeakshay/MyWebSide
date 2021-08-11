

public class Student {

	private int rollNo;
	private String name;
	private float fees;
	private static int count;
	
	public Student(int rollNo,String name,float fess)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.fees = fees;
		count++;
		
	}
	
	public static int getcount()
	{  
		return count;
	}
	
	public void display()
	{
		System.out.println("Student = ["+rollNo+" "+name+" "+fees+"] "+count);
	}
	
	static 
	{
		System.out.println("static block invoked");
		count = 600;
	}
	
	
	
	public static void main(String[] args)
	{
	  System.out.println("Main method Called");
	  Student s1 = new Student(1,"rahul",20000.0f);
	  s1.display();
	  System.out.println("getcount method  "+s1.getcount());
	  Student s2 = new Student(1,"Ankita",10000.0f);
	  s2.display();
	  Student s3 = new Student(1,"Vaibhav",5000.0f);
	  s3.display();
//	  int count = Student.getcount();
	  System.out.println("count=  "+count);
	}
}
