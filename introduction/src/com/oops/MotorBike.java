package com.oops;

public class MotorBike {
	// state, 변할 수 있음, 변수로 표현
	private int speed;
	// 클래스는 특정 클래스의 데이터를 직접적으로 바꿀 수 없음
	// 바꾸고 싶다면 해당 클래스에서 수행하는 메서드를 통해야함 => 캡슐화
	// 따라서 private 설정 해줌

	// 캡슐화 : 한 개체를 다른 개체로부터 보호하는 것. 외부 개체가 직접 개체 내 데이터를 제어하지 못하도록 함. 따라서 간접적으로는 제어할
	// 수 있도록 메서드 만드는 것임
	// 캡슐화의 이점 : [1] 잘못된 데이터 처리를 미연에 방지할 수 있다.
	// [2] 객체에 행할 수 있는 다양한 연산을 고안하고 메서드를 만듬

	// 추상화 / 생성자 / 캡슐화
	// 추상화 : 어떤 일이 일어날 때 우릴가 그 모든 과정을 다 알 필요는 없다는 이야기

	// behavior

	// method


	MotorBike() {
		// 생성자 생성 시 초기 default를 담을 수 있는 메서드도 필요
		this(5);
		// 위 식은 아래 MotorBike를 호출함
	}

	MotorBike(int speed) {
		this.speed = speed;
		// 생성자는 반환타입이 필요없음
		// 생성자는 객체의 초기 상태를 설정해주는데 지대한 역할을 함

	}

	void start() {
		System.out.println("Bike Start");
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}

	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
//		if (this.speed >= howMuch) {
//			this.speed -= howMuch;
//		}
		setSpeed(this.speed - howMuch);

	}
}
