/*Write a java program to separate upper case and lower case alphabet from the given string*/

package com.qa.interview.persistent;

import java.util.Scanner;

public class SeperateUpperAndLowerCaseMethod1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the input string:");
		String inputString = sc.nextLine(); // PeRsIsTeNt

		sc.close();

		char[] charArray = inputString.toCharArray();

		String lowerCase = "";
		String upperCase = "";

		for (int i = 0; i < charArray.length; i++) {

			if (i % 2 == 0) {

				upperCase = upperCase + Character.toString(charArray[i]);
			} else {
				lowerCase = lowerCase + Character.toString(charArray[i]);
			}

		}

		System.out.println("Upper Case string is: " + upperCase);

		System.out.println("Lower Case string is: " + lowerCase);

	}

}
