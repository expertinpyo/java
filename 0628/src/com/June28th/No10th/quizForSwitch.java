package com.June28th.No10th;

import java.util.Scanner;

public class quizForSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Type your three numbers");
		Scanner scanner = new Scanner(System.in);
		int dayNumber = scanner.nextInt();
		int monthNumber = scanner.nextInt();

		puzzle1(dayNumber);
		puzzle2(monthNumber);

	}

	public static void puzzle1(int num) {
		switch (num) {
		case (0):
			System.out.println("SUN");
			break;
		case (1):
			System.out.println("MON");
			break;
		case (2):
			System.out.println("TUE");
			break;
		case (3):
			System.out.println("WED");
			break;
		case (4):
			System.out.println("THR");
			break;
		case (5):
			System.out.println("FRI");
			break;
		case (6):
			System.out.println("SAT");
			break;
		default:
			System.out.println("Invaild number :(");
		}
	}

	public static void puzzle2(int num) {
		switch (num) {
		case (0):
			System.out.println("JAN");
			break;
		case (1):
			System.out.println("FEB");
			break;
		case (2):
			System.out.println("MAR");
			break;
		case (3):
			System.out.println("API");
			break;
		case (4):
			System.out.println("MAY");
			break;
		case (5):
			System.out.println("JUN");
			break;
		case (6):
			System.out.println("JUL");
			break;
		case (7):
			System.out.println("JUL");
			break;
		case (8):
			System.out.println("AUG");
			break;
		case (9):
			System.out.println("SEP");
			break;
		case (10):
			System.out.println("OCT");
			break;
		case (11):
			System.out.println("NOV");
			break;
		case (12):
			System.out.println("DEC");
			break;
		default:
			System.out.println("Invaild number :(");
		}
	}
}
