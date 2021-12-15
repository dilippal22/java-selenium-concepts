/*Write a Java program to print following pattern.
 * 
 * 1	2	3	4	*
 * 1	2	3	*	5
 * 1	2	*	4	5
 * 1	*	3	4	5
 * *	2	3	4	5
 * 
 * */

package com.dgsl.java.interview;

import java.util.Scanner;

/**
 * @author DilipP
 *
 */
public class StarAndNumericalPattern1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of rows and column resp.: ");
		int rows = sc.nextInt();

		int column = sc.nextInt();

		for (int i = rows; i >= 1; i--) {
			for (int j = 1; j <= column; j++) {
				if (i != j) {
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
