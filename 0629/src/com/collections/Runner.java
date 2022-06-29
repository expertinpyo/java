package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Ascending implements Comparator<Student> {
	// Comparator interface를 가져옴으로써 직접 정의한 정렬 방법 사용 가능
	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student1.getId(), student2.getId());
	}

}


public class Runner {
	public static void main(String[] args) {
		List<Student> students = List.of(new Student(1, "Inpyo"), new Student(2, "asdad"));
		System.out.println(students);
		List<Student> studentsAl = new ArrayList<>(students);

		Collections.sort(studentsAl);

		Collections.sort(studentsAl, new Ascending()); // 이런 식으로 오림차순 정렬 사용 가능

		studentsAl.sort(new Ascending()); // 위와 같은 결과
	}
}
