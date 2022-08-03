/* Write a Java Program to find the total number of leap year for the given year range 2300 - 2400(both years inclusive) */

package com.qa.interview.sasinstitute;

import java.util.Scanner;

public class FindLeapYear {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the start year:");
		int startYear = sc.nextInt();

		System.out.println("Enter the end year:");
		int endYear = sc.nextInt();

		sc.close();

		int count = 0;

		for (int i = startYear; i <= endYear; i++) {

			if (i % 4 == 0) {
				count++;
			}
		}
		System.out.println("Total leap years for the given year range is: " + count);
	}
}
