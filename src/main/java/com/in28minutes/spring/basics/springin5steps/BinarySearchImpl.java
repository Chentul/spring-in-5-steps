package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	public int binarySearch(int[] numbers, int numberToSearchFor) {
		int[] sortedNumbers = this.sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		return 3;
	}

}
