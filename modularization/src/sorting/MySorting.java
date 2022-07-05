package sorting;

import java.util.List;

import sorting.algorithm.BubbleSort;

public class MySorting {
	public List<String> sort(List<String> names) {
		BubbleSort bubbleSort = new BubbleSort();
		return bubbleSort.sort(names);
	}
}
