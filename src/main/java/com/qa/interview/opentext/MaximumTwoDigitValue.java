/* You are given a String consisting of digits. Find the biggest two-digit value that is a consistent fragment of a given
 * String.
 * 
 * For example, two-digit consistent fragments of "50552" are ["50", "05", "55", "52"], representing the numbers
 * [50, 5, 55, 52]. The biggest value among them is 55.
 * 
 * Write a function that, given a String S consisting of digits, returns the maximum two-digit value that is consistent
 * fragment of S.
 * 
 * Examples:
 * 		1. Given S = "50552", your function should return 55.
 * 		2. Given S = "10101", your function should return 10.
 * 		3. Given S = "88", your function should return 88.
 * 
 * Assume that:
 * 		1. String S consists only of digits (0-9);
 * 		2. the number of digits of S is within the range [2..10];
 * 		3. S does not start with '0'.
 */

package com.qa.interview.opentext;

import java.util.Scanner;

public class MaximumTwoDigitValue {
	
	public static String solution(String inputString){
		return 0 + inputString;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the input string:");
		String inputString = sc.nextLine();
		
		solution(inputString);

	}

}
