/* Write a java program to sort following array elements using bubble sort algorithm.
 * [18 9 33 4 84 32]
 */

package com.dgsl.java.sorting;

public class BubbleSortApproach2 {

	public static int[] bubbleSort(int bubble[]) {
		int temp;

		for (int i = 0; i < bubble.length; i++) {
			for (int j = 1; j < bubble.length; j++) {
				if (bubble[j - 1] > bubble[j]) {
					temp = bubble[j - 1];
					bubble[j - 1] = bubble[j];
					bubble[j] = temp;
				}
			}
		}
		return bubble;
	}

	public static void main(String[] args) {
		int bubble[] = { 18, 9, 33, 4, 84, 32 };

		System.out.println("Array before bubble sort!");
		for (int i = 0; i < bubble.length; i++) {
			System.out.print(bubble[i] + " ");
		}
		System.out.println();

		bubbleSort(bubble);

		System.out.println("Array after bubble sorting!");
		for (int i = 0; i < bubble.length; i++) {
			System.out.print(bubble[i] + " ");
		}
	}

}
