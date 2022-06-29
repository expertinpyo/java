package com.collections;

import java.util.HashMap;

public class MapInfo {
	public static void main(String[] args) {
		String sentence = "This is a great thing";
		HashMap<Character, Integer> hashmap = new HashMap<>();

		char[] chars = sentence.toCharArray();
		for (char character : chars) {
			Integer integer = hashmap.get(character);
			if (integer == null) {
				hashmap.put(character, 1);
			} else {
				hashmap.put(character, integer + 1);
			}

		}
		System.err.println(hashmap);
	}
}

// map은 collections 프레임워크의 일부이나 collection 인터페이스를 구현하지 않음
// key와 value 로 이뤄짐 , dict

// HashMap : key 값으로 null값으로 저장하게끔 해줌
// HashTable : 동기화 되어있음

// HashMap / LinkedHashMap / TreeMap
// 각 map별 성질은 set 때의 그것과 동일함
// TreeMAp은 NavigableMap interface 존재
