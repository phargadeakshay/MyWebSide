package session_11;

public class Student implements Cloneable{
	
	int rn;
	String name;
	Course course;
	
	public Student(int rn, String name, Course course) {
		super();
		this.rn = rn;
		this.name = name;
		this.course = course;
	}
	
   protected Object clone() throws CloneNotSupportedException
   {
	   Student student = (Student) super.clone();
	   student.course = (Course) course.clone();
	   return student;
   }
   
   
	
}	

