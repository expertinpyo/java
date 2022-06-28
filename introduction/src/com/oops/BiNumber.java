package com.oops;

public class BiNumber {
	private int num1;
	private int num2;

	BiNumber() {

	}

	BiNumber(int a, int b) {
		this.num1 = a;
		this.num2 = b;
	}

	int add() {
		return this.num1 + this.num2;
	}

	int multiply() {
		return this.num1 * this.num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}



}

