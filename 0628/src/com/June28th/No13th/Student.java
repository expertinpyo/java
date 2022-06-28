package com.June28th.No13th;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Student {
	private String name;
//	private int[] marks;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student(String name, int... marks) { // 이러면 marks는 가변 변수가 된다.
		this.name = name;
//		this.marks = marks;
		for (int mark : marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberofMarks() {
		// TODO Auto-generated method stub
//		return marks.length;
		return marks.size();
	}

	public int getTotalSumOfMarks() {
		// TODO Auto-generated method stub
		int result = 0;
		for (int mark : marks) {
			result += mark;
		}
		return result;
	}

	public int getMaximumMark() {
		// TODO Auto-generated method stub
		Integer result = Integer.MIN_VALUE;
		for (int mark : marks) {
			if (mark > result) {
				result = mark;
			}
		}
		return result;
	}

	public int getMinimumMark() {
		// TODO Auto-generated method stub
		Integer result = Integer.MAX_VALUE;
		for (int mark : marks) {
			if (mark < result) {
				result = mark;
			}
		}
		return result;
	}

	public BigDecimal getAverageMarks() {
		// TODO Auto-generated method stub
		int sum = this.getTotalSumOfMarks();
		int number = this.getNumberofMarks();
		
		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
	}
}
