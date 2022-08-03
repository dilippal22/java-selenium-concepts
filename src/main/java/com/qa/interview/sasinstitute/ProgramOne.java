/*Write a Java Program to print "My is name Amazon" for the given input "My name is Amazon".
  I/P: My name is Amazon; O/P: My is name Amazon*/

package com.qa.interview.sasinstitute;

import java.util.Scanner;

public class ProgramOne {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string:");

		String inputString = sc.nextLine();

		String wordArray[] = inputString.split(" ");

		String temp;

		for (int i = 0; i < wordArray.length; i++) {
			for (int j = i + 1; j < wordArray.length; j++) {

				if (wordArray[i].length() > wordArray[j].length()) {
					temp = wordArray[i];
					wordArray[i] = wordArray[j];
					wordArray[j] = temp;
				} else if (wordArray[i].length() == wordArray[j].length()) {
					continue;
				}
			}

			System.out.print(wordArray[i] + " ");
		}

		sc.close();

	}

}
