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

		boolean flag = false;
		int count = 0;

		for (int i = startYear; i <= endYear; i++) {

			if (startYear % 4 == 0) {
				flag = true;
			} else if (startYear % 100 == 0) {
				flag = false;
			} else if (startYear % 4 == 0) {
				flag = true;
			} else {
				flag = true;
			}
		}

		if (flag) {
			count++;
			System.out.println("Total leap years for the given year range is: " + count);
		}else{
			System.out.println("Not a leap year!");
		}

	}

}
