/* Move all the zeroes to the right and all the ones to the left.
 * int a[] = {1,0,1,1,0,0,1,0,1} */

package com.qa.interview.servicenow;

public class MoveAllZeroesToTheRight {

	public static void pushZerosToEnd(int arr[], int n) {
		int count = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				arr[count++] = arr[i];
			}
			while (count < n) {
				arr[count++] = 0;
			}
		}
	}

	public static void main(String[] args) {

		int arr[] = { 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9 };

		int n = arr.length;
		pushZerosToEnd(arr, n);

		System.out.println("Array after pushing zeros to the back: ");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");

	}

}
