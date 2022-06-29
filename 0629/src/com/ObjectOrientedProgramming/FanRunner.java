package com.ObjectOrientedProgramming;

public class FanRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan fan = new Fan("Manufacture1", 0.3456, "Green");
		fan.button();
		fan.setSpeed((byte) 5);
		System.out.println(fan);
		fan.button();
		System.out.println(fan);
	}

}
