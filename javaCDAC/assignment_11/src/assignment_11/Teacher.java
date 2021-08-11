package assignment_11;

public class Teacher {

	
	private int id;
	private String name;

	
	public Teacher(int id, String name)
	{
		this.id = id;
		this.name = name;
	}

	@Override 
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}


	@Override
	public boolean equals(Object obj)
	{

		if (this == obj)
			return true;

		if (obj == null)
			return false;

		if (getClass() != obj.getClass())
			return false;

		Teacher other = (Teacher)obj;
		if (id != other.id)
			return false;
		return true;
	}

	
	@Override
	public String toString()
	{
		return name + " (" + id + ")";
	}
}
