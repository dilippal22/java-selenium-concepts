/* inputChar = Nomura */

package com.qa.interview.ibm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Dilip Pal
 *
 */
public class PrintDuplicateCharacters {

	public static List<Character> duplicateCharacter(List<Character> inputChar) {

		for (int i = 0; i < inputChar.size(); i++) {

			for (int j = i + 1; j < inputChar.size(); j++) {

				if (inputChar.get(i).equals(inputChar.get(j))) {

					System.out.println(inputChar.get(i));

				}
			}
		}
		return inputChar;

	}

	public static void main(String[] args) throws IOException {
		InputStreamReader stream = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(stream);

		List<Character> list = new ArrayList<Character>();

		System.out.println("Enter the characters you want to check for duplicates: ");

		String inputString = reader.readLine();

		for (char ch : inputString.toCharArray()) {
			list.add(ch);
		}

		PrintDuplicateCharacters.duplicateCharacter(list);

	}

}
