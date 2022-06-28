package com.June28th.No13th;

import java.util.Arrays;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = new int[8];
		System.out.println(marks);
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
		Arrays.fill(marks, 100);
		Arrays.fill(marks, 101);
		System.out.println(Arrays.toString(marks)); // [] 형태로 출력 가능

		

	}
}
