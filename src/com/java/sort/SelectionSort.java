package com.java.sort;

import com.myutilities.Myutil;

public class SelectionSort {
	void sort(int arr[]) {
		int pos;
		int temp;
		for (int i = 0; i < arr.length; i++) {
			pos = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[pos]) {
					pos = j;
				}
			}

			temp = arr[pos];
			arr[pos] = arr[i];
			arr[i] = temp;
		}
	}

	public static void main(String args[]) {
		SelectionSort selectionSort = new SelectionSort();
		int arr[] = { 64, 25, 12, 22, 11 };
		selectionSort.sort(arr);
		Myutil.display(arr);
	}

}
