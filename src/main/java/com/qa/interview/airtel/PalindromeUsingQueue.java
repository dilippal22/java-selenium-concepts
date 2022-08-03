/*Write a Java program to find the given string is Palindrome or not using data structure. No loops are allowed.
Also write all the test data you will consider as an input to test your code.*/

package com.qa.interview.airtel;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PalindromeUsingQueue {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the input string:");
		String inputString = sc.nextLine();

		sc.close();

		char[] charArray = inputString.toCharArray();

		Queue<Character> queue = new LinkedList<Character>();

		for (int i = charArray.length - 1; i >= 0; i--) {
			queue.add(charArray[i]);
		}

		System.out.println("Queue elements are: " + queue);

		String reverseString = "";

		while (!queue.isEmpty()) {
			reverseString = reverseString + queue.remove();
		}

		if (inputString.equals(reverseString)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}

	}

}
