package com.dgsl.java.interview;

/**
 * @author DilipP
 *
 */
public class FindMissingNumberMethod1 {

	public static int FindMissionNumber(int[] inputArray, int n) {

		int total = (n + 1) * (n + 2) / 2;

		for (int i = 0; i < n; i++) {
			total = total - inputArray[i];
		}

		return total;
	}

	public static void main(String[] args) {

		int[] inputArray = { 1, 2, 4, 6, 3, 7, 8 };

		System.out.println(FindMissionNumber(inputArray, inputArray.length));

	}

}
