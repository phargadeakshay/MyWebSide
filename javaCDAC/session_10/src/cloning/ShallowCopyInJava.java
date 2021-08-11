package cloning;

public class ShallowCopyInJava {

	public static void main(String[] args) throws CloneNotSupportedException {
		Course c = new Course("Os", "Java", "Angular");
		Student s1 = new Student(1,"Akshay", c);
		System.out.println("s1 = "+s1);
		Student s2 = null;
		s2 =(Student) s1.clone();
		System.out.println("s2 "+s2);
	}
}
