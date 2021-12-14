/*Write a Java program to print the longest word from the given sentence.
 * Input : "Its my interview today"
 * Output: interview
 * */

package com.dgsl.java.interview;

import java.util.Scanner;

public class PrintLongestWordFromSentence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the sentance: ");
		String inputSentance = sc.nextLine();

		String[] eachWord = inputSentance.split(" ");

		String temp = "";

		for (int i = 0; i < eachWord.length; i++) {
			for (int j = i + 1; j < eachWord.length; j++) {
				if (eachWord[i].length() > eachWord[j].length()) {
					temp = eachWord[i];
				}
			}
		}
		System.out.println(temp);
		sc.close();
	}

}
