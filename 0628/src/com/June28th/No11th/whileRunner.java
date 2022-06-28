package com.June28th.No11th;

import java.util.Scanner;

public class whileRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input your number");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		WhileNumberPlayer player = new WhileNumberPlayer(num);
		player.printSquareUptoNumber();
		System.out.println();
		player.printCubesUptoNumber();

	}

}
