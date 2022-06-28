package com.June28th.No11th;

public class WhileNumberPlayer {
	private int num;

	public WhileNumberPlayer(int number) {
		this.num = number;
	}

	public void printSquareUptoNumber() {
		// TODO Auto-generated method stub
		int result = 1;
		while (result * result < num) {
			System.out.print(result * result + " ");
			result += 1;
		}
	}

	public void printCubesUptoNumber() {
		// TODO Auto-generated method stub
		int result = 1;
		while (result * result * result < num) {
			System.out.print(result * result * result + " ");
			result += 1;
		}
	}

}
