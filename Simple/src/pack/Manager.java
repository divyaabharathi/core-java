package pack;

public class Manager extends Employee {
	private int  employeecount;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, int age, int employeecount) {
		super(name, age);
		this.employeecount = employeecount;
	}

	public int getEmployeecount() {
		return employeecount;
	}

	public void setEmployeecount(int employeecount) {
		this.employeecount = employeecount;
	}

	@Override
	public String toString() {
		return "Manager [employeecount=" + employeecount + ", toString()="
				+ super.toString() + "]";
	}

	
	
	
	

}
