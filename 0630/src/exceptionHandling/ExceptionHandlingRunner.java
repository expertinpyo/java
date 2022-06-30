package exceptionHandling;

public class ExceptionHandlingRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
// 기본적으로 try - catch block으로 에러 해결
// 자바스크립트와 동일
// finally - try던지 catch던지 간에 된다면 마지막으로 실행되는 것 의미

// error의 가장 상위 개념은 Throwable
// 그 것들을 상속 받는 것이 Error and Exception
// Error를 방지할 수는 있지만 handle할 수는 없다.
// 하지만 Exception은 handle 가능함
// Exceptio은 크게 RuntimeException 과 그 자식 클래스(unchecked Exception) / 나머지(checked Exception) 로 나뉜다.
// 메서드가 checked Exception을 넘기는 경우 calling 메서드는 이를 처리 or 또다시 넘기는 것 중 하나를 선택할 수 있음
// RuntimeException과 자식들(unchecked Exception)을 넘기는 경우 calling 메서드는 아무것도 하지 않아도 됨.
