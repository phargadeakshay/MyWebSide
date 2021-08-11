package inheritance;

public class Employee extends Object {
	private int empId;
	private String empNm;

	public Employee(int empId, String empNm) {
		this.empId = empId;
		this.empNm = empNm;

	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empNm=" + empNm + "]";
	}

	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		if ((this.empId == e.empId) && (this.empNm.equals(e.empNm))) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(111, "Akshay");
		Employee e2 = new Employee(111, "Akshay");

//		if(e1 == e2)
//		{
//			System.out.println("Are equal");
//		}
//		else {
//			System.out.println("Are not equal");
//		}

		if (e1.equals(e2)) {
			System.out.println("Object are equal");
		} else {
			System.out.println("Object are not equal");

		}

	}

}
