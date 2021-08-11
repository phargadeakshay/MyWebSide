package pack2;

public class Person {
	
	private String name,address;
	private int age;
	public Person(String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}

	public void show()
	{
		System.out.println("\nName = " +name+ "\nAddress = " +address+ "\nAge =  "+age);
	}
	

}
