package com.ObjectOrientedProgramming;

public class Fan {

	// state
	// non variable
	private String make;
	private double radius;
	private String color;

	// variable
	private boolean isOn;
	private byte speed;
	
	// creation 생성자

	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}

	public void isOn(boolean isOn) {
		this.isOn = isOn;
	}

	public void button() {
		if (this.isOn) {
			this.isOn = false;
			setSpeed((byte) 0);
		} else {
			this.isOn = true;
		}
	}

	public void setSpeed(byte speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return String.format("make - %s radius - %f color - %s isOn - %b speed - %d", make, radius, color,
				isOn, speed);
	}

}
