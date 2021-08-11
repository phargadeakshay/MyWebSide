package inheritance;

public class HOD extends Teacher{
	private String branch;
	private String specialization_sub;
	
	public void getData()
	{    
		super.getData();
		System.out.println("Enter Branch =");
		branch = s.next();
		System.out.println("Specializations Subject = ");
		specialization_sub = s.next();
	}
	
	public void show()
	{
		super.show();
		System.out.println("Specilization Subject is  = "+specialization_sub);
		System.out.println("Branch of HOD  = "+branch);
	}
	public static void main(String[] args)
	{
	    HOD a = new HOD();
		a.getData();
		a.show();
	
	
	}

}
