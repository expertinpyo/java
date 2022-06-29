package com.interfaces;

public class GameRunner {
	public static void main(String[] args) {
		GamingConsole game = new MarioGame(); // new ChessGame()으로 바꾼다면 ChessGame에 저장된 메서드들을 실행시킴
		// 이는 다형성이다. 같은 것에 여러가지 구현을 부여할 수 있다.
		// 즉, 인터페이스는 공통적인 시행 가능 행동들을 대표하는 것임

	}
}
