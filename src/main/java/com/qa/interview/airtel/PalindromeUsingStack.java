/*Write a Java program to find the given string is Palindrome or not using data structure. No loops are allowed.
Also write all the test data you will consider as an input to test your code.*/

package com.qa.interview.airtel;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeUsingStack {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string:");

		String inputString = sc.nextLine();
		
		sc.close();

		char[] charArray = inputString.toCharArray();

		Stack<Character> stack = new Stack<Character>();

		for (char ch : charArray) {
			stack.push(ch);
		}
		System.out.println("Stack elements are: " + stack);

		String reverseString = "";

		while (!stack.isEmpty()) {
			reverseString = reverseString + stack.pop();
		}

		if (inputString.equals(reverseString)) {
			System.out.println("String is palindrom");
		} else {
			System.out.println("String not palindrom");
		}

	}

}
