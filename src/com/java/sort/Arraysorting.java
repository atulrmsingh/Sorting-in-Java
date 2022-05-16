package com.java.sort;

import java.util.Arrays;

public class Arraysorting {
	public static void main(String[] args) {
		
		int Array[] = new int[] {5,3,6,1,2,10};
		for(int i : Array) {
			System.out.println(i);
			
		}
		Arrays.sort(Array);
		System.out.println("after sort");
		
		for(int i : Array) {
			System.out.println(i);
			
		}
	}

}
