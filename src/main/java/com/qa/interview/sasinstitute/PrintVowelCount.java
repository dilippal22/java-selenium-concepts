/* Write a Java program to print vowel count for the given String: Hi Amazon how are you*/

package com.qa.interview.sasinstitute;

import java.util.Scanner;

public class PrintVowelCount {

	public static void vowelCountMethodTwo(char[] charInputArray) {
		int count = 0;

		for (int i = 0; i < charInputArray.length; i++) {

			if (charInputArray[i] == 'a' || charInputArray[i] == 'e' || charInputArray[i] == 'i'
					|| charInputArray[i] == 'o' || charInputArray[i] == 'u') {
				count++;
			}
		}
		System.out.println("Vowel Count is: " + count);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the input String:");

		String inputString = sc.nextLine();

		sc.close();

		char[] charInputArray = inputString.toCharArray();

		vowelCountMethodTwo(charInputArray);

	}

}
