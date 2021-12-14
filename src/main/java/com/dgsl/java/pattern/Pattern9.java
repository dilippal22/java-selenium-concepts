/* Print pattern in following way
 *   5	4	3	2	*
     5	4	3	*	1
     5	4	*	2	1
     5	*	3	2	1
     *	4	3	2	1
 */

package com.dgsl.java.pattern;

import java.util.Scanner;

/**
 * @author DilipP
 *
 */
public class Pattern9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows you want to print.");
		int rows = sc.nextInt();

		for (int i = 1; i <= rows; i++) {
			for (int j = rows; j >= 1; j--) {
				if (j != i) {
					System.out.print(j + " ");
				} else {
					System.out.print("*" + " ");
				}
			}
			System.out.println("\n");
		}
		sc.close();

	}

}
