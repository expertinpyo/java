package com.June28th.No11th;

import java.util.Scanner;

public class quizForWhileRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("INPUT YOUR NUMBER");
		int num = scanner.nextInt();
		while (num > 0)
		{
			System.out.println(num*num);
			System.out.println("INPUT YOUR NUMBER");
			num = scanner.nextInt();
		}
		System.out.println("End");
	}

}
