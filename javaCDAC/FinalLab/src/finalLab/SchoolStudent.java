package finalLab;

public class SchoolStudent extends Student  {

	private String Classname;

	public SchoolStudent(int rollno, float percentage, String classname) 
	{
		super(rollno, percentage);
		this.Classname = classname;
	}
	
	public SchoolStudent()
	{
		
	}
	
	public void show()
	{
		super.show();
		System.out.println("Class Name is: "+Classname);
	}


	
}
