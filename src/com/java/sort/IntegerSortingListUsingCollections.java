package com.java.sort;

import java.util.*;

import com.myutilities.Myutil;

public class IntegerSortingListUsingCollections {
	public static void main(String[] args) {

		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(9);
		arrayList.add(5);
		arrayList.add(11);
		arrayList.add(2);
		arrayList.add(50);

		Myutil.iterator(arrayList);

		Collections.sort(arrayList);
		System.out.println("\nAfter sorting");

		Myutil.iterator(arrayList);
	}

}
