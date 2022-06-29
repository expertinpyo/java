package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class infoOfList {
	// List.of로 리스트 생성이 가능하나, 이 경우 해당 리스트는 불변형태이다.
	// 따라서, 가변 형태의 리스트 생성을 원하는 경우
	// ArrayList, LinkedList 혹은 Vector를 사용한다.
	public static void main(String[] args) {
		List<String> words = List.of("asd", "asdasd");
		List<String> words2 = List.of("linked", "lists");
		List<String> words3 = List.of("asd", "asdasd");
		List<String> wordsArrayList = new ArrayList<String>(words);
		List<String> wordsLinkedList = new LinkedList<String>(words2);
		List<String> wordsVector = new Vector<String>(words3);

		wordsArrayList.add("added");
		System.out.println(wordsArrayList);

		wordsLinkedList.add("added");
		System.out.println(wordsLinkedList);

		wordsVector.add("added");
		System.out.println(wordsVector);

		for (String word : words) {
			System.out.println((word));
		}
		Iterator wordsIterator = words.iterator();
		while (wordsIterator.hasNext()) {
			System.out.println(wordsIterator.next());
		}
	}
}
// ArrayList와 Vector는 Array
// LinkedList 는 LinkedList다.

// Array, 배열 : 특정 원소에 접근하는 것은 쉬우나 뱌열 값들 추가, 삭제하는 것은 소모적임
// LinkedList 연결 리스트 : 특정 원소의 값을 지우거나 추가하는 것은 쉽지만, 그 원소로 접근하는 것이 무척 소모적임

// Vector : 모든 요소들이 동기화 되어있음 => 안전함
// ArrayList : 안전하진 않음

// add : append / set : 해당 위치로 원소 넣고 그 위치의 오리지널 값 반환 / remove : 해당 위치 원소 반환