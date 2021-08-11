package finalLab;

public class Student {
	
	private int rollno;
	private float percentage;
	public Student(int rollno,float percentage) {
		super();
		this.rollno = rollno;
		this.percentage = percentage;
	}
	public Student()
	{
	}

	public void show()
	{
		System.out.println("Roll Number is: "+rollno+"\n Percentage is: "+percentage);
	}

}









