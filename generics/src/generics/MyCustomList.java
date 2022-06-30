package generics;

import java.util.ArrayList;

public class MyCustomList<T> {
	// 클래스 이름 옆에 <T> 추가 => generic 사용 가능
	// 내가 원하는 대로 커스텀 할 수 있는 듯.
	// 굳이 <T>가 아니더라도 원하는 값으로 이를 표현할 수 있음
	// <T extends Number> 아런식으로 가능한 T에 대한 제약을 걸 수도 있음
	// 본인이 생성한 메서드가 T 역할을 할 수도 있음

	ArrayList<T> List = new ArrayList<>();

	public void addElement(T element) {
		List.add(element);
	}

	public void removeElement(T element) {
		List.remove(element);
	}

	@Override
	public String toString() {
		return List.toString();
	}

	public T toString(int value) {
		return List.get(value);
	}
}
