/* Write a Java program to convert input string to palindrome and print it and then check if the converted string is
 * palindrom or not. Input: abab output: abba*/

package com.qa.interview.airtel;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ConvertingStringIntoPalindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the input string:");
		String inputString = sc.nextLine(); // abab

		char[] charArray = inputString.toCharArray(); // ['a','b','a','b']

		Queue<Character> queue = new LinkedList();

		String reverseString = "";

		for (int i = inputString.length() - 1; i >= 2; i--) {

			queue.add(inputString.charAt(i)); // [b, a]
		}

		System.out.println("Queue elements are: " + queue);

		while (!queue.isEmpty()) {
			reverseString = reverseString + queue.remove();
		}

		System.out.println("Reverse String after removing queue elements are: " + reverseString); // ba

		Stack<Character> stack = new Stack<>();

		for (int i = inputString.length() - 2; i > 0 ; i--) {
			stack.push(inputString.charAt(i)); // [a, b]
		}

		System.out.println("Stack elements are: " + stack);

		while (!stack.isEmpty()) {

			reverseString = reverseString + stack.pop();
		}

		System.out.println("Reverse String after popping stack elements are: " + reverseString);

	}

}
