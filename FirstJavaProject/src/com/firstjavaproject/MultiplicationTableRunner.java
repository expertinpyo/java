package com.firstjavaproject;

public class MultiplicationTableRunner {
//	자바를 실행시키려면 메인 메서드가 필요함
	public static void main(String[] args) {
		MultipllicationTable table = new MultipllicationTable();
		table.print();
		table.print(13);
		table.print(13, 4, 15);
	}

}
