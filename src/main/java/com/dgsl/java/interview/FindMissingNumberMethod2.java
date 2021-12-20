package com.dgsl.java.interview;

/**
 * @author DilipP
 *
 */
public class FindMissingNumberMethod2 {

	// Using X-OR method to find the missing number
	public static int FindMissionNumber(int[] inputArray, int n) {

		int x1 = inputArray[0]; // For XOR of all the elements in the array
		int x2 = 1; // For XOR of all the elements from 1 to n+1

		for (int i = 1; i < n; i++)
			x1 = x1 ^ inputArray[i];

		for (int i = 2; i <= n + 1; i++)
			x2 = x2 ^ i;

		return (x1 ^ x2);

	}

	public static void main(String[] args) {

		int[] inputArray = { 1, 2, 4, 6, 3, 7, 8 };

		System.out.println(FindMissionNumber(inputArray, inputArray.length));

	}

}
