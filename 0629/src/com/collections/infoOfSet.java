package com.collections;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class infoOfSet {
	public static void main(String[] args) {
		List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');

		// unique value = > Set을 생각하자!
		Set<Character> treeSet = new TreeSet<>(characters);
		System.out.println(treeSet);
	}
}
// HashSet -> 삽입, 정렬 순서 신경 안씀
// LinkedSet -> 요소를 삽입 순서대로 보관
// TreeSet -> 요소를 크기가 작은 순서대로 정렬
// TreeSet NavigableSet : floor lower ceiling higher subSet headSet tailSet
