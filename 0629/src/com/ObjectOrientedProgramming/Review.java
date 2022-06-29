package com.ObjectOrientedProgramming;

public class Review {
	private int reviewId;
	private String comment;
	private int rate;

	public Review(int reviewId, String comment, int rate) {
		this.reviewId = reviewId;
		this.comment = comment;
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", comment=" + comment + ", rate=" + rate + "]";
	}

}
