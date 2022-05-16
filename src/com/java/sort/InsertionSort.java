package com.java.sort;

import com.myutilities.Myutil;

public class InsertionSort {
	static void sort(int arr[], int n) {
		if (n <= 1) {
			return;
		}

		sort(arr, n - 1);

		int last = arr[n - 1];
		int j = n - 2;

		while (j >= 0 && arr[j] > last) {
			arr[j + 1] = arr[j];
			j--;
		}
		arr[j + 1] = last;
	}

	public static void main(String[] args) {
		int arr[] = { 22, 21, 11, 15, 16 };

		sort(arr, arr.length);
		Myutil.display(arr);
	}

}
