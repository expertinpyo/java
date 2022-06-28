package com.firstjavaproject;

// Refactoring(리팩터링) : 코드의 기능은 건들지 않으면서 구조에만 변화를 주는 것
public class MultipllicationTable {
	void print() {
		print(5, 1, 10);
	}
	
	void print(int n) {
		print(n, 1, 10);
	}

	void print(int n, int from, int to) {
		for (int i = from; i < to; i++) {
			System.out.printf("%d * %d = %d", n, i, n*i).println();
		}
	}
	
}
