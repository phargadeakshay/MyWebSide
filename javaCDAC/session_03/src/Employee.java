
public class Employee {
private int EmpID;
private String EmpName;
private float Sal;
public void setData (int a, String b, float c) {
	
	EmpID = a;
	EmpName = b;
	Sal= c;
	
}
public void DisplayData() {
	System.out.println("Employee Data\nEmployeeID = "+EmpID+"\nEmployee Name = "+EmpName+"\nSalary = "+Sal);
}
public static void main(String[] args) {
	Employee a = new Employee();
	a.setData(1, "Akshay", 50000);
	a.DisplayData();
}
}
