package com.ObjectOrientedProgramming;

import java.util.ArrayList;

public class Book {
	private int id;
	private String title;
	private String author;
	private ArrayList<Review> review = new ArrayList<>();

	public Book(int id, String title, String author){
		this.id = id;
		this.title = title;
		this.author = author;
		
	}

	public void addReview(Review review) {
		this.review.add(review);
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", review=" + review + "]";
	}

}
