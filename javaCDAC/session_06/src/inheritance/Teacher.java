package inheritance;

public class Teacher extends Person {
	
	private String sub;
	private int yr_of_exp;
	
	
	public void getData()
	{
		super.getData();
		System.out.println("Enter years of experience = ");
		yr_of_exp = s.nextInt();
		System.out.println("Enter Subject");
		sub = s.next();
		
		
		
	}
	public void show()
	{
		super.show();
		System.out.println("Subject = "+sub);
		System.out.println("Years of experience = "+yr_of_exp);
	}

	
}
