/*Write a Java program to find GCD(Greatest Common Divisor) for the given number.
 * Input1 : 15; Input2 : 25
 * */

package com.dgsl.java.interview;

import java.util.Scanner;

/**
 * @author DilipP
 *
 */
public class FindGCDForGivenNumber {

	public static int findGCD(int inputNum1, int inputNum2) {

		if (inputNum1 == 0)
			return inputNum2;
		if (inputNum2 == 0)
			return inputNum1;

		if (inputNum1 == inputNum2)
			return inputNum1;

		if (inputNum1 > inputNum2)
			return findGCD(inputNum1 - inputNum2, inputNum2);
		else
			return findGCD(inputNum1, inputNum2 - inputNum1);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First input number: ");
		int inputNum1 = sc.nextInt();

		System.out.println("Enter second input number: ");
		int inputNum2 = sc.nextInt();

		System.out.println("GCD value is: " + findGCD(inputNum1, inputNum2));

		sc.close();

	}

}
