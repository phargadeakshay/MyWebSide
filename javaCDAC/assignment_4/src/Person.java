
public class Person {
	private String name;
	private static int age;
	
    public void per1(String name) 
    {
		this.name = name;
	}
    public void per1(int age) 
    {
    	this.age = age;
    }
  
	static
   {
	age = 18;
   }
 
	public void display()
	{
		System.out.println("Name and Age of Person is " +name+" and "+age+" Respectively");
	}
	public static void main(String[] args) {
		Person s = new Person();
		s.per1("Akshay");
		 s.display();
		 s.per1("Rahul");
		 s.per1(20);
		 s.display();
	}

}
