package com.qa.interview.persistent;

import java.util.Scanner;

public class SeperateUpperAndLowerCaseMethod2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the input string:");
		String inputString = sc.nextLine(); // PeRsIsTeNt

		sc.close();

		char[] charArray = inputString.toCharArray();

		for (char ch : charArray) {

			if(Character.isUpperCase(ch)){
				
			}
		}

	}

}
