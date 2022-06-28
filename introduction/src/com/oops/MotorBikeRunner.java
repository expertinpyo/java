package com.oops;

public class MotorBikeRunner {
	public static void main(String[] args) {
		MotorBike honda = new MotorBike(100);
		MotorBike ducati = new MotorBike(2);
		
		ducati.start();
		honda.start();

		ducati.setSpeed(100);
		honda.setSpeed(120);
		// 위 두 값은 서로 독립적임
		
		ducati.increaseSpeed(100);
		honda.increaseSpeed(200);

		ducati.decreaseSpeed(100);
		honda.decreaseSpeed(200);

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());

	}
	}

