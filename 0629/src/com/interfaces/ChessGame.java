package com.interfaces;

public class ChessGame implements GamingConsole {

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("King");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Queen");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("Knight");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("Von");
	}

}
