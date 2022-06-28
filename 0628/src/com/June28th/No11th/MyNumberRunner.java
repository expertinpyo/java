package com.June28th.No11th;

import java.util.Scanner;

public class MyNumberRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Input your number");
		int num = scanner.nextInt();

		MyNumber number = new MyNumber(num);

		boolean isPrime = number.isPrime();
		System.out.println(isPrime);

		int sum = number.sumUptoN();
		System.out.println(sum);

		int sums = number.sumOfDividers();
		System.out.println(sums);

		number.trianlges();
	}

}
