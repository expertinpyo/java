package com.June28th.No10th;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 입력 받기
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a Number1 : ");
		int num1 = scanner.nextInt();
		System.out.println("Enter a Number2 : ");
		int num2 = scanner.nextInt();

		System.out.println("Choose what you want to do : ");
		int symbol = scanner.nextInt();

		int result;
		if (symbol == 1) {
			result = num1 + num2;
		} else if (symbol == 2) {
			result = num1 - num2;
		} else if (symbol == 3) {
			result = num1 * num2;
		} else if (symbol == 4) {
			result = num1 / num2;
		} else {
			System.out.println("You chose wrong Symbol");
			result = 0;
		}
		System.out.println("The result is : " + result);
	}

}
