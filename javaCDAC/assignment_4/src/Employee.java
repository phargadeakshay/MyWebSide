
public class Employee {
	private static int empId;
    private int salary;
    private static int totalSalary;
    
    
	public Employee(int salary) {
		this.empId = empId;
		this.salary = salary;
		this.totalSalary = totalSalary;
		totalSalary +=salary;
		empId++;
	}
    
	public void display()
	{
		System.out.println("Employee = ["+empId+" "+salary+" "+totalSalary+"] ");
	}
	
//	static 
//	{
//		System.out.println("static block invoked");
//		empId = 600;
//	}
	
	public static void main(String[] arg)
	{
		Employee a = new Employee(60000);
		a.display();
		Employee b = new Employee(60000);
		a.display();
		Employee c = new Employee(50000);
		a.display();
		
	}
    
    

}
