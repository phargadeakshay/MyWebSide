
public class Tostring {
	
	private int empId;
	private String empNm;
	private float empSal;
	
	public Tostring()
	{
		System.out.println("Default Constructor Invoked");
		empId = 111;
		empNm = "Rahul";
		empSal = 120000.78f;
		
	}
	
	public Tostring(int id,String nm,float sal) {
		System.out.println("Parameterized Constructor Invoked");
		this.empId = id;
		this.empNm =nm;
		this.empSal= sal;		
	}
	
	public String toString()
	{
		return "Employee =[" +empId+" "+empNm+" "+empSal+" ]";
	}
	
	
	public static void main(String[] args)
	{
		Tostring e = new Tostring();
		Tostring e1 = new Tostring(222,"Ankita",35133.5f);
		System.out.println(e1);

	}

}
