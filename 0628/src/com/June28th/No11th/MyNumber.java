package com.June28th.No11th;

public class MyNumber {
	private int number;

	public MyNumber(int number) {
		this.number = number;

	}

	public boolean isPrime() {
		// TODO Auto-generated method stub
		if (number < 2) {
			return false;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public int sumUptoN() {
		// TODO Auto-generated method stub
		int result = 0;
		for (int i = 1; i <= number; i++) {
			result += i;
		}

		return result;
	}

	public int sumOfDividers() {
		// TODO Auto-generated method stub
		int result = 0;

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				result += i;
			}
		}
		return result;
	}

	public void trianlges() {

		// TODO Auto-generated method stub
		for (int i = 1; i <= number; i++) {
			System.out.print(i + " ");
		}
	}
}
