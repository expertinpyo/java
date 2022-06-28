package com.oops;

public class MyChar {
	private char word;

	MyChar(char myWord) {
		this.word = myWord;
	}

	public boolean isNumber() {
		// TODO Auto-generated method stub
		if (this.word) {
			return true
		} else {
			return false
		}
	}

	public char[] isAlphabet() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void printLowerCaseAlphabets() {
		// TODO Auto-generated method stub
		for(char ch='a'; ch <= 'z'; ch ++) {
			System.out.println(ch);
		}
	}

	public static void printUpperCaseAlphabets() {
		// TODO Auto-generated method stub
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}
	}
	
	
}
