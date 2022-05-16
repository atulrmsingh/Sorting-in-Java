package com.myutilities;

import java.util.List;

public class Myutil {
	public static <T> void iterator(List<T> anything) {
		for(T temp : anything ) {
			System.out.println( temp + " " );
		}
	}
	
	public static void display(int arr[]) {
		for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}
	}

}
