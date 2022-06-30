package com.functional_programming;

import java.util.List;
import java.util.stream.IntStream;

public class FPNumberRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> list = List.of(1, 5, 2, 3, 6, 7);

//		int sum = list.stream().reduce(0, (number1, number2) -> number1 + number2); // 좌변수 + 우변수, 이렇게 하나 하나씩 쪼개져서 들어간다
//																					 생각하자.
//		System.out.println(sum);
		
		IntStream list = IntStream.range(1, 11);
		list.map(e -> e * e).forEach(element -> System.out.println(element));

		List<String> fruits = List.of("Apple", "Banana", "StrawBerry");
		fruits.stream().map(e -> e.toLowerCase()).forEach(e -> System.out.println(e));
		fruits.stream().map(e -> e.length()).forEach(e -> System.out.println(e));

//		List answer = list.filter(e -> e % 2 == 0).boxed().collect(Collectors.toList());
//		System.out.println(answer);
	}
}


// 중간연산 - 스트림에 실행할 수 있는 중간 연산의 개수는 제한이 없다.
// sorted, distinct, map 등

// 종단연산 - 실행할 수 있는 연산 수 1개
// 결과는 보통 하나의 값임
// reduce, max, min, collect(collectors.toList) -> 결과들을 한 리스트로 return 등
// stream은 optional 반환함
// 그 다음 orElse를 통해 기본값 설정 가능
