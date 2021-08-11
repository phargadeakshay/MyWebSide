package session_11;

public class DeepCloningInJava {

	public static void main(String[] args) throws CloneNotSupportedException{
		
	
	Course course = new Course("OS","Java","Python");
	Student student1 = new Student(1, "Kiran", course);
	Student student2 = null;
	
student2 = (Student) student1.clone();

System.out.println(student1.course.sub1);
student1.course.sub1 = "Angular";
System.out.println(student1.course.sub1);

System.out.println(student2.course.sub1);


	}
}
