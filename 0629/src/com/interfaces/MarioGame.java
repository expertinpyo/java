package com.interfaces;

public class MarioGame implements GamingConsole {
	// implements로 interface 불러올 수 있음
	// 클래스는 extends였음
	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("Jump");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Crawl");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("Go right");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("Go left");
	}

}
