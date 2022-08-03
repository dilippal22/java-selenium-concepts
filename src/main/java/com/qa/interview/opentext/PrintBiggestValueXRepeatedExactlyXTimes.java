/*Write a java program for the given input array A consisting of N integers, returns the biggest value X, which occurs
 * in A exactly X times. If there is no such value, the function should return 0.*/

package com.qa.interview.opentext;

import java.util.Arrays;

public class PrintBiggestValueXRepeatedExactlyXTimes {

	public static int solution(int[] intArray) {
		int result = 0;
		int count = 0;
		
		Arrays.sort(intArray);
		
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray.length; j++) {
				if (intArray[i] == intArray[j]) {
					count++;
				}
			}

			if (count == intArray[i] && result < intArray[i]) {
				result = intArray[i];
			}
			count = 0;

		}
		return result;
	}

	public static void main(String[] args) {

		int[] intArray = { 3, 8, 2, 3, 3, 2 }; // Output : 3

		int[] intArray1 = { 7, 1, 2, 8, 2 }; // Output : 2

		int[] intArray2 = { 3, 1, 4, 1, 5 }; // Output : 0

		int[] intArray3 = { 5, 5, 5, 5, 5, 5 }; // Output : 0

		int[] intArray4 = { 5, 5, 5, 5, 5 }; // Output : 5

		System.out.println(solution(intArray));

	}

}
