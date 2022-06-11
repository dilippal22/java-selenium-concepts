/*Write a program to print only repeated character in a given sentence: my name is java i think your name is also java*/

package com.qa.interview.ibm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PrintRepeatedWord {

	public static String repeatedWords(String inputString) {

		String[] wordInputString = inputString.split(" ");

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String ch : wordInputString) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get((ch) + 1));
				System.out.print(ch + " ");
			} else
				map.put(ch, 1);
		}

		return inputString;

	}

	public static void main(String[] args) throws IOException {
		InputStreamReader stream = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(stream);

		System.out.println("Enter the input string:");

		// Reading command line input string
		String inputString = reader.readLine();

		// Passing the input string to the method
		PrintRepeatedWord.repeatedWords(inputString);
	}

}
