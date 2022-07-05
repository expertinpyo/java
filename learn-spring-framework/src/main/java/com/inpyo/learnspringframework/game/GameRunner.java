package com.inpyo.learnspringframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // Java Spring Framework에게 권한 이임
public class GameRunner {

	@Autowired // Component들을 자동으로 찾아줌
	private GamingConsole game;

	public GameRunner(GamingConsole game) {
		this.game = game;
	}

	public void runGame() {
		game.up();
		game.down();
		game.right();
		game.left();
	}

}

// 이런 식으로 코드 작성 시 GameRunner와 MarioGame간의 강한 결합이 형성됨
// 이는 코드의 자유도를 침해하는 결과를 야기함.
// 이 경우 PracticeGame을 불러올 때 private와 선언되는 변수의 타입을 늘 수정해야함
// 너무 번거로운 일
