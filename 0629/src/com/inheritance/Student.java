package com.inheritance;

public class Student extends Person {
	// extends 클래스 이름 -> 상속됨
	// 이 경우 부모 클래스인 Person = 슈퍼 클래스
	// 자식 클래스인 Student => 서브 클래스
	// 서브클래스는 슈퍼 클래스의 모든 것을 가짐

	// 상속하려는 두 클래스 사이 관계가 "IS A"가 아니라면 상속은 추천되지 않음

	private String collegeName;
	private int year;

	public Student(String name) {
		super(name);
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
