package generics;

import java.util.List;

public class GenericsRunner {

	static <X> X doubleValue(X value) {
		return value;
	}

	static <X extends List> void duplicate(X list) {
		list.addAll(list);
	}
	// 이 X들은 제너릭 역할을 할 수 있다!

	// 상한경계 와일드 카드. 이 정적 메서드는 어떤 타입의 숫자던지 간에 합을 리턴한다.
	// 상한 경계 와일드카드는 이 경우 Number클래스의 하위 클래스인 모든 것들에 대해 공통된 논리를 구현하게 해줌
	static double sumOfNumbeRList(List<? extends Number> numbers) {
		double sum = 0.0;
		for (Number number : numbers) {
			sum += number.doubleValue();
		}
		return sum;
	}

	// 하한경계 와일드 카드
	// 하한경꼐 와일드카드는 숫자의 하위 타입들의 여러 다른 값들을 많이 추가할 ㅜ 있게 해줌
	static void addACoupleOfValues(List<? super Number> numbers) {
		numbers.add(1);
		numbers.add(1.0);
		numbers.add(1.1f);
	}

	public static void main(String[] args) {
		MyCustomList<String> myList = new MyCustomList();
		myList.addElement("possible?");

		MyCustomList<Integer> myList2 = new MyCustomList();
		myList2.addElement(Integer.valueOf(5));

	}
}
