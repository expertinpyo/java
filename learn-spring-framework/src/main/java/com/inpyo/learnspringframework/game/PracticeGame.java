package com.inpyo.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // 두 개 이상의 컴포넌트가 있을 때 우선권을 부여함
public class PracticeGame implements GamingConsole {
	@Override
	public void up() {
		System.out.println("jjjjump");
	}

	@Override
	public void down() {
		System.out.println("in to the unknwon");
	}

	@Override
	public void left() {
		System.out.println("left");
	}

	@Override
	public void right() {
		System.out.println("right");
	}

}
