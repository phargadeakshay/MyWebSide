
//Constuctor in java
public class Employee {

	private int empId;
	private String empNm;
	private float empSal;
	
	public Employee()
	{
		System.out.println("Default Constructor Invoked");
		empId = 111;
		empNm = "Rahul";
		empSal = 120000.78f;
		
	}
	
	public Employee(int id,String nm,float sal) {
		System.out.println("Parameterized Constructor Invoked");
		empId = id;
		empNm =nm;
		empSal= sal;		
	}
	
	public void display()
	{
		System.out.println("Employee =["+empId+" "+empNm+" "+empSal+"]");
	}
	
	public static void main(String[] args)
	{
		Employee e = new Employee();
		e.display();
		Employee e1 = new Employee(222,"Ankita",35133.5f);
		e1.display();
	}
}
