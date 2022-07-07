package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LombokTest {
	private String hello;
	private int lombok;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LombokTest helloLombok = new LombokTest();
		helloLombok.setHello("Hello");
		helloLombok.setLombok(5);

		System.out.println(helloLombok.getHello());
	}

}
