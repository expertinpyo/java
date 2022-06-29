package com.ObjectOrientedProgramming;

public class Rectangle {
	public int vertical;
	public int horizontal;

	public int width;
	public int length;

	public Rectangle(int vertical, int horizontal) {
		this.vertical = vertical;
		this.horizontal = horizontal;

		setWidth();
		setLength();
	}

	public void setWidth() {
		this.width = vertical * horizontal;
	}

	public void setLength() {
		this.length = 2 * (vertical + horizontal);
	}

	@Override
	public String toString(){
		return String.format("가로 - %d 세로 - %d 넓이 - %d 둘레 - %d", vertical, horizontal, width, length);
	}
}
