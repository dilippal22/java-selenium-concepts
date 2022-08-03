/*Write a function:
that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].*/

package com.qa.interview.opentext;

import java.util.Arrays;

public class SmallestPositiveIntegerNotInArray {

	public static int solution(int[] inputArray) {
		int smallestInt = 1;

		if (inputArray.length == 0)
			return smallestInt;

		Arrays.sort(inputArray);

		if (inputArray[0] > 1)
			return smallestInt;
		if (inputArray[inputArray.length - 1] <= 0)
			return smallestInt;

		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] == smallestInt) {
				smallestInt++;
			}
		}

		return smallestInt;
	}

	public static void main(String[] args) {

		int[] inputArray = { 10, 2, 25, 43, 0, 67, 1, 7 }; // Output: 3

		int[] inputArray1 = { 1, 3, 6, 4, 1, 2 }; // Output: 5

		int[] inputArray2 = { 1, 2, 3 }; // Output: 4

		int[] inputArray3 = { -1, -3 }; // Output: 1

		System.out.println(solution(inputArray));

	}

}
