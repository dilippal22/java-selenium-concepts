/*Write a Java program that, given integer N, returns the smallest non-negative whose individual digits sum to N.
Example:
	N = 16; the function should return 79. There are many numbers like 79, 97, 808, 5551, 22822 etc. 
			whose digits sum to 16 but lowest such number is 79.
	N = 19; the function should return 199. The sum of digits 1+9+9=19.
	If N = 7; the function should return 7;
	Assume N = 0 to 50.*/

package com.qa.interview.opentext;

import java.util.Arrays;

public class SumOfNumberOfDigits {

	public static boolean sumOfNumofDigits(int arrayElement, int N) {

		int sum = 0;

		while (arrayElement != 0) {
			sum = sum + arrayElement % 10;
			arrayElement = arrayElement / 10;
		}

		if (sum == N) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {

		int[] inputArray = { 97, 808, 79, 5551, 5506, 22822, 199, 7 };

		Arrays.sort(inputArray);

		for (int i = 0; i < inputArray.length; i++) {
			if (sumOfNumofDigits(inputArray[i], 7)) {
				System.out.println("Lowest number is: " + inputArray[i]);
				break;
			}
		}

	}

}
