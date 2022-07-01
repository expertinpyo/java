package concurrency;

public class CounterBI {
	private int i = 0;
	private int j = 0;

	synchronized public void increment() {
		i++;

	}

	public int getI() {
		return i;
	}

	synchronized public void incrementJ() {
		j++;

	}

	public int getJ() {
		return i;
	}
}
// 이 경우 오직 하나의 쓰레드 만이 실행될 수 있다. (전혀 다른 두 메서드임에도) 
// 동기화의 단점 => 오직 하나의 쓰레드만 사용 가능
