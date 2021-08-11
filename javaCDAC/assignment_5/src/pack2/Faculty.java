package pack2;

public class Faculty extends Person {
	private int id;
	private String branch;
	float salary;

	public Faculty(int id ,String name, String address, int age,String branch,float salary) {
		super(name, address, age);
		this.id = id;
		this.branch = branch;
		this.salary= salary;
		
	}
	
	public void show()
	{
		super.show();
		System.out.println("Id = "+id+"\nBranch = "+branch+ "\nSalary = "+salary);
	}
	

}
