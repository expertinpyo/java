package com.ObjectOrientedProgramming;

public class CustomerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address homeAddress = new Address("asdasd1", "Seoul", "12345");
		Customer customer = new Customer("Inpyo", homeAddress);
		Address workAddress = new Address("work1", "Seoul", "12345");
		customer.setWorkAddress(workAddress);
		System.out.println(customer);
	}

}
