package com.functional_programming;

import java.util.List;

public class FucntionalProgrammingRunner {
	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Banana", "Cat");
		List<Integer> intList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		printBasic(list);
		printWithFP(list);
		hw(intList);
	}

	private static void printBasic(List<String> list) {
		for (String string : list) {
			System.out.println(string);
		}
	}

	private static void printWithFP(List<String> list) {
		list.stream().forEach(element -> System.out.println(element)); // 람다 표현식
		list.stream().filter(element -> element.endsWith("at")).forEach(element -> System.out.println(element));
	}

	private static void hw(List<Integer> intList) {
		intList.stream().filter(element -> element % 2 == 1).forEach(element -> System.out.println(element));
	}
}
