/*Write a java program to print the given output from input.
 * Input: Mississippi 
 * Output: Miss ssissi sissip issipp sippi */

package com.qa.interview.xoriant;

public class PrintGivenOutput {

	public static void main(String[] args) {

		String inputString = "Mississippi";
		
		//Output needed: Miss ssissi sissip issipp sippi

		for (int i = 0; i < inputString.length(); i += 2) {

			if (i == 0) {
				System.out.println(inputString.substring(i, 4));
			} else {
				if (i + 6 < inputString.length()) {
					System.out.println(inputString.substring(i, i + 6));
					--i;
				} else if (i + 6 == inputString.length()) {
					++i;
					System.out.println(inputString.substring(i, i + 5));
				}
			}
		}

	}

}
