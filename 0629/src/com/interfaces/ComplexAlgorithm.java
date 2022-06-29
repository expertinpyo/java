package com.interfaces;

public interface ComplexAlgorithm {
	int complexAlgorithm(int num1, int num2);

}

// 인터페이스 내 하위 인터페이스가 있고, 각 인터페이스들이 메서드를 가지고 있는 경우
// 두번째 인터페이스의 클래스는 두 메서드를 모두 구현해야 한다.
// 하지만, 해당 클래스를 추상화 한다면 정의하고 싶은 메서드만 구현이 가능하다.
// 그러나 이 경우 해당 클래스의 하위 클래스는 모든 메서드를 구현해야 한다.

// 요약하자면, 자신이 연장하는 인터페이스에 대한 구현이 없는, 그저 인터페이스만 구현하는 추상 클래스를 만들 수 있다.
// 하지만 그 추상 클래스를 어떤 구상 클래스가 연장한다면 그 추상 클래스 + 인터페이스와 하위 인터페이스에서 정의된 모든 메서드들의 구현을 해야 한다.

// 인터페이스는 기본적으로 default를 사용해 메서드를 정의할 수 있음. => 이 것은 overriding 가능함

// 추상 클래스와 인터페이스 비교
// 둘 사이에는 특별한 관계는 없고 문법만 조금 비슷해 보이는 정도이다.

// 추상 클래스를 사용하고 싶을 때 : 구현의 세세한 부분들을 하위 클래스에 맡기고 싶을 때 => 상속을 해야하므로 자연스럽게 상위, 하위 클래스로 나뉘게 됨
// 인터페이스를 사용하고 싶을 때  : 두 시스템(클래스 등) 사이에 소통하길 원할 때 / 한쪽에서는 인터페이스를 소비, 다른 한 쪽 에서는 구현을 제공한다.

// 인터페이스 안에서 private 선언 안됨 / 인터페이스 안에 변수 못 넣음 ex) public interface Asd => 이게 끝, () 해서 변수 안에다 못 넣음
// 추상 클래스는 여러 인터페이스 구현 가능
