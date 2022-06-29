package com.collections;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLength implements Comparator<String> {

	@Override
	public int compare(String value1, String value2) {
		// TODO Auto-generated method stub
		return Integer.compare(value1.length(), value2.length());
	}

}

public class QueueInfo {
	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>(new StringLength()); // 이러면 괄호안에 있는 것 기준으로 우선순위 큐 실행됌
		queue.addAll(List.of("Zebra", "Apple", "Branch"));

	}
}
// poll = popleft
// offer = append
// addAll = list append
// 