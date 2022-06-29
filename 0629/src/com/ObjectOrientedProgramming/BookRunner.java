package com.ObjectOrientedProgramming;

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book(123, "Once upon a time", "Inpyo Hong");
		book.addReview(new Review(10, "this is such a gorgeous book", 100));
		System.out.println(book);
	}

}
