package com.java.sort;

import com.myutilities.Myutil;

public class BubbleSort {
	static void sort(int arr[], int n) {
		if (n == 1) {
			return;
		}

		for (int i = 0; i < n - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}

		sort(arr, n - 1);
	}

	public static void main(String[] args) {
		int arr[] = { 6, 4, 5, 12, 2, 11, 9 };
		sort(arr, arr.length);
		Myutil.display(arr);
	}

}
