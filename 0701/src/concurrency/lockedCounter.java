package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class lockedCounter {

	private int i = 0;
	private int j = 0;

	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();

	public void increment() {
		lockForI.lock();
		i++;
		lockForI.unlock();

	}

	public int getI() {
		return i;
	}

	public void incrementJ() {
		lockForJ.lock();
		j++;
		lockForJ.unlock();

	}

	public int getJ() {
		return j;
	}
}
// 이렇게 작성하게 되면 각각의 thread가 lock을 가질 수 있게 되는듯.
