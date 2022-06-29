package com.inheritance;

public class Employee extends Person {
	private String title;
	private String employer;
	private String employGrade;
	private int salary;

	public Employee(String name) {
		super(name);
		// 하위 클래스에서 생성자를 만들 때 마다 첫번째 줄에서는 자동으로 상위 생성자가 발동된다.
		// super가 없어도 상위 클래스를 만난다.
		// 상위 클래스에 생성자가 있을 시 하위 클래서의 super를 통해 해당 생성자 값을 보내야만 한다.

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public String getEmployGrade() {
		return employGrade;
	}

	public void setEmployGrade(String employGrade) {
		this.employGrade = employGrade;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString() + "Employee [title=" + title + ", employer=" + employer + ", employGrade=" + employGrade
				+ ", salary=" + salary;
	}

}