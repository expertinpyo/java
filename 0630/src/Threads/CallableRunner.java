package Threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String> {
	// Callable => 특정값을 반환하는 Thread를 만들고 싶은 경우 사용하는 인터페이스
	private String name;

	public CallableTask(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Hello " + name;
	}

}

public class CallableRunner {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(1);

		Future<String> welcomeFuture = executorService.submit(new CallableTask("Inpyo"));


	}


}

// newSingleThreadExecutor() => 단 한개의 Thread만 동작할 수 있게끔 함.
// newFixedThreadPool(숫자) => 숫자만큼 Thread 개수 활성화
// callable은 실행을 위해 execute 대신 submit를 사용
// ExecutorService에서 반환값은 Future임
// get을 Future에 사용하게 되면 그 곳에서 결과를 기다리겠다는 것을 의미
// invokeAll() 결과를 리스트 등으로 반환해줌
// invoeAny() 가장 빠른 결과 하나를 반환
