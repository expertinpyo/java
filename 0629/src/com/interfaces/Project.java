package com.interfaces;

public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ComplexAlgorithm algorithm = new DummyAlgorithm(); // 이런 식으로 DummyAlgorithm을 선 사용 하다가 RealAlgorithm 등 진짜 무언가가
															// 나오면 손쉽게 대체할 수 있다.

		algorithm.complexAlgorithm(100, 200);
	}

}
