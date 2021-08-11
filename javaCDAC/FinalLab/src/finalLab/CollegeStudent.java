package finalLab;

public class CollegeStudent extends Student implements Comparable<CollegeStudent>{
	private int semester;

	public CollegeStudent(int rollno, float percentage, int semester) {
		super(rollno, percentage);
		this.semester = semester;
	}
	
	public CollegeStudent()
	{

	}
	
	public void show()
	{
	    super.show();
	    System.out.println("Semister is: "+semester);
	}


	@Override
	public int compareTo(CollegeStudent stt) {
		
		return this.semester - stt.semester;
	}

}
