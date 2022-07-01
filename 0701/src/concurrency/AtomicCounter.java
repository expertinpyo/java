package concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {
	private AtomicInteger i = new AtomicInteger();
	private AtomicInteger j = new AtomicInteger();

	public void increment() {
		i.incrementAndGet();
	}

	public int getI() {
		return i.get();
	}

	public void incrementJ() {
		j.incrementAndGet();
	}

	public int getJ() {
		return j.get();
	}
}
// Atomic은 일련의 과정들을 다 처리해줌
// 하지만 모든 경우에서 Atomic을 사용할 수 있는 것은 아님
// 위의 경우, 덧셈이라는 가벼운 연산이었기에 사용이 가능했던 것.
// 만약 복잡한 식인 경우 lock을 사용해야 함

// Concurrent Collecitons는 기본적인 atomic 연산 지원
