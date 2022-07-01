package concurrency;

public class Counter {
	int i = 0;

	synchronized public void increment() {
		i++;
	}

	public int getI() {
		return i;
	}
}
// 이게 만약 멀티스레드로 진행될 시 초기값을 동일하게 받았다면, 몇번의 과정이 있던지 간에 변화가 예상했던 그 것이 아닐 확률이 있다.
// Thread safety - 메소드가 다양한 thread에 의해 한번에 안전하게 실행되는 것
// 따라서 synchronzied를 붙여서 싱글 스레드로 돌린다.
