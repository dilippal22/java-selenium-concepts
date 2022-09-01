/* Write a Java program to remove duplicate characters from the given string: Java has ooops concepts */

package com.qa.java.bakerhughes;

import java.util.Scanner;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the input string:");

		String inputString = sc.nextLine();
		sc.close();

		String[] inputArray = inputString.split(" ");

		for (String eachWord : inputArray) {
			for (char eachChar : eachWord.toCharArray()) {
				if (eachWord.indexOf(eachChar) == eachWord.lastIndexOf(eachChar))
					System.out.print(eachChar);
			}
			System.out.print(" ");
		}
	}
}
