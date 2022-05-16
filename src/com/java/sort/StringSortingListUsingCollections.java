package com.java.sort;

import java.util.*;

import com.myutilities.Myutil;

public class StringSortingListUsingCollections {
	public static void main(String[] args) {

		List<String> songList = new ArrayList<>();
		songList.add("zara zara");
		songList.add("besabriyan");
		songList.add("kaisa hua");
		songList.add("aisa desh hai mera");
		songList.add("nahc meri radha");

		Myutil.iterator(songList);

		Collections.sort(songList);
		System.out.println("\n after sorting");

		Myutil.iterator(songList);

	}

}
