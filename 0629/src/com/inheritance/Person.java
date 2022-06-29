package com.inheritance;

// java에는 Object라는 클래스 존재함.
// 이 Object는 클래스 체계의 근본임
// 클래스가 아무런 값을 상속받지 않느다면 객체(Object)를 상속받음

// 모든 클래스는 기본적으로 객체 클래스의 연장이다!
// 하위 클래스에서 상위 클래스의 메서드를 오버라이딩(덮어 씌우기) 가능, 가장 보편적인 예가 toString

public class Person {
	private String name;
	private String email;
	private String phoneNumber;

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
	}

}
