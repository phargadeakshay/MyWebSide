package cloning;

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
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	@Override
	public String toString() {
		return "Student [rn=" + rn + ", name=" + name + ", course=" + course + "]";
	}
	
}
