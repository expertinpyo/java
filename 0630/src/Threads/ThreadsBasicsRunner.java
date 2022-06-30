package Threads;

// Thread를 만드는 방법은 extends Thread와 implements Runnable이 존재
class Task1 extends Thread {
	@Override
	public void run() {
		for (int i = 101; i <= 199; i++) {
			System.out.println(i + " ");
		}
		System.out.println("\nTask1 Done");
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		for (int i = 201; i <= 299; i++) {
			System.out.println(i + " ");
		}
		System.out.println("\nTask2 Done");
	}

}

public class ThreadsBasicsRunner {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Task1 task1 = new Task1();
		task1.start(); // 이 task를 실행하기 위한 명령어는 run이 아닌 start임.
		// 이래야지만 멀티 Thread 사용 가능

		task1.setPriority(10); // 1~10사이의 값으로 우선순위를 줄 수 있음. 숫자가 클수록 우선순위가 높은 것

		Task2 task2 = new Task2();
		Thread thread = new Thread(task2);
		thread.start();

		task1.join(); // 이렇게 코드를 작성하면 task1이 끝날 때 까지 task3는 실행되지 않음

		// task3
		for (int i = 301; i <= 399; i++) {
			System.out.println(i + " ");
		}
		System.out.println("\nTask3 Done");
	}

}

// Thread에는 5가지의 상태 존재
// NEW : Thread가 만들어지고 실행되지는 않았을 때
// RUNNABLE : Thread가 동작할 준비는 되어있으나 실행 중이진 않을 때(다른 thread 등이 동작하고 있으므로)
// RUNNING : thread가 실행 중일 때
// BLOCKED/WAITING : 외부 인터페이스나 데이터베이스 등으로부터 어떤 입력을 위해 대기하고 있거나 실행이 완료되지 않은 다른 thread로부터 데이터를 입력받아야 하는 상황
// TERMINAED : Thread가 종료되었을 때

// Thread 실행에 우선순위를 부여할 수는 있으나, 이는 단순히 request, 즉 추천정도.
// 강제성을 띄고 있지는 않다.

// Thread.yield() : 사용중인 thread를 포기하라고 "요청""
// Therad.Sleep() : 적은 시간만큼 대기
// synchronized keyword : 단 한가지 Thread만이 특정한 인스턴스에 존재하는 코드 작성 가능 / 나머지 코드들은 대기

// Executor Service : 다수의 Thread를 한번에 실행할 수 있게 도와주고, Thread의 상태를 알 수 있게끔 해주며 Thread와 사용자가 "한 Thread가 완료되면 그 결과를 알려준다"라는 로직을 사용할 수 있게끔 해준다.
