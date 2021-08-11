package session_12;

public class Employee implements Comparable {
private int id;
private String name;

public Employee(int id,String name)
{   
	super();
	this.id = id;
	this.name = name;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + "]";
}



@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	Employee e = (Employee)o;
	int id1 = this.id;
	int id2 = (int)e.id;
	
	if(id1 <id2)
	{
		return -1;
	
	}
	else if (id1>id2) {
		return -1;
				
	}
	
	else {
		return 0;
	}
	
}
	
	
	

}
