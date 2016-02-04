package com.collections.learn;

import java.util.Set;
import java.util.TreeSet;


public class SortedSetDemo {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		Set<String> sortedNames = new TreeSet<>();
	    sortedNames.add("Java");
	    sortedNames.add("SQL");
	    sortedNames.add("HTML");
	    sortedNames.add("CSS");

	    System.out.println(sortedNames);

		long endTime   = System.currentTimeMillis();

		System.out.println(endTime - startTime);
		

	}

}
