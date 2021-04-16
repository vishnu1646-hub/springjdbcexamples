package org.techouts;

public class EmployeeRSE {
	private int id;
	private String employeename;
	private float salary;

	public EmployeeRSE(int id, String employeename, float salary) {
		super();
		this.id = id;
		this.employeename = employeename;
		this.salary = salary;
	}

	public EmployeeRSE() {
		super();
		// TODO Auto-generated constructor stub
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

	public String toString() {
		return id + " " + employeename + " " + salary;
	}
}
