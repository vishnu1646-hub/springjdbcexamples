package org.techouts;

public class EmployeePS {
	private int id;
	private String employeename;
	private float salary;

	public EmployeePS() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeePS(int id, String employeename, float salary) {
		super();
		this.id = id;
		this.employeename = employeename;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}
