package com.xyz;

public class Employee implements Comparable<Employee>{
	private int employeeID;
	private String name;
	private String skills;
	private int age;
	private int salary;
	private String joiningDate;
	
	@Override
	public int compareTo(Employee co) {
		return this.age - co.age;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}

	public Employee(int employeeID, String name, String skills, int age, int salary, String joiningDate) {
		super();
		this.employeeID = employeeID;
		this.name = name;
		this.skills = skills;
		this.age = age;
		this.salary = salary;
		this.joiningDate = joiningDate;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", name=" + name + ", skills=" + skills + ", age=" + age
				+ ", salary=" + salary + ", joiningDate=" + joiningDate + "]";
	}
}
