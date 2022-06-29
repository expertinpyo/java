package com.ObjectOrientedProgramming;

public class Customer {
	private String name;
	private Address homeAddress; // Customer 클래스 안에 Address라는 클래스 넣음
	private Address workAddress;
	// 이 경우, Customer 클래스는 Address 클래스의 인스턴스에 대해 참조 역할을 수행한다

	public Customer(String name, Address homeAddress) {
		this.name = name;
		this.homeAddress = homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", homeAddress=" + homeAddress + ", workAddress=" + workAddress + "]";
	}

	public Address getWorkAddress() {
		return workAddress;
	}

}
