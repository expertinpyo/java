package com.June28th.No12th;

public class References {
	// 자바에 메모리가 저장되는 방법
	// 1. 우선 Heap 구조에 location과 Object로 저장된다. (정확한 개념은 아니며 rough한 설명임)
	// 2. 이제 이 저장된 메모리가 Stack 구조에 저장되는데, 이 때 저장되는 값이 Heap의 location이다.
	// 따라서 참조 변수라고 불리우는 것.

	// 실제 객체 정보는 Heap에, Stack에 저장되는 정보는 실제 객체가 저장된 메모리의 "경로"

	// 위 차이점을 가지고 기본 변수와 참조 변수를 구분하는데 이 것은 몹시 중요한 개념임.

	// 참조 변수를 복사할 때, 복사된 것은 객체의 주소임.
	// 따라서 복사된 값을 수정한다면 같은 주소를 공유하고 있는 원본도 수정됌. Python의 List와 비슷한 개념인듯

	// 하지만 기본 변수들 ex int i = 5 등 / 은 int j = i 로 값을 복사한 뒤 j를 수정해도 i가 변하지 않음.
	// why? j는 i의 값을 가져왔을 뿐, 주소는 명백히 다르기 때문

	// == 연산자는 비교하는 대상이 값이 아니라 객체임(참조 변수일 시, 기본변수일 시에는 value 즉 값을 비교함)

	// String 연산자는 생성 시 new 생성자가 필요하지 않음
	// 단순히 String text = "Text" 이게 가능함.
	// 스트링 리터럴은 모두 인스턴스이다.

	// charAt(index) : 해당 인덱스 글자 반환
	// substring(시작, 끝) : 시작 위치부터 끝-1까지의 string 반환
	// indexOf('글자') : 해당 글자의 인덱스 반환
	// lastIndexOf('글자') : 해당 글자의 마지막 인덱스 반환
	// contains('글자') : 해당 글자 포함 여부 boolean으로 반환
	// starts(ends)With('글자') : 해당 글자로 시작(끝)하는지 여부 boolean으로 반환
	// isEmpty() : 해당 string 비었는지 여부 판단
	// string1.equals('string2') : 같은지 여부 => equlasIgnoreCase : 대소문자 구분 없이 판단

	// str.concat('글자') : str과 글자를 결합시킴 그렇지만 저장되는 것은 아니므로 해당 값을 다른 변수로 넘겨줘야함
	// str.trim() = python의 strip 개념과 동일

	// StringBuffer는 값을 수정할 수 있음, 하지만 멀티스레딩 관련하여 문제가 있음 따라서 StringBuilder를 사용한다.
	// 언제? 굉장히 많은 String을 연결해야 하거나 String 인스턴스를 많이 생성해야 할 때 !

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String someString = "This is a lot of text again";
		for (int i = 0; i < someString.length(); i++) {
			System.out.println(someString.charAt(i));
		}
	}

}
