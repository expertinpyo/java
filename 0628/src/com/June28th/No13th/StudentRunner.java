package com.June28th.No13th;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = { 19, 97, 100 };
 		Student student = new Student("quiz", marks);

		int number = student.getNumberofMarks();
		int sum = student.getTotalSumOfMarks();
		int maximumMark = student.getMaximumMark();
		int minimumMark = student.getMinimumMark();
		BigDecimal average = student.getAverageMarks();
		System.out.println(number);
		System.out.println(sum);
		System.out.println(maximumMark);
		System.out.println(minimumMark);
		System.out.println(average);

	}
	}

