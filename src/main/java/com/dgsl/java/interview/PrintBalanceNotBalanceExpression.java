/*Write a Java program to print given expression is balanced or not.abstract
	Input: (][{)}()])([](}[{])
	Output: Balanced
*/

package com.dgsl.java.interview;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author DilipP
 *
 */
public class PrintBalanceNotBalanceExpression {

	public static boolean printBalanceNotBalance(String inputExpression) {

		Deque<Character> queue = new ArrayDeque<Character>();

		for (int i = 0; i < inputExpression.length(); i++) {

			char eachExpr = inputExpression.charAt(i);

			if (eachExpr == '(' || eachExpr == '[' || eachExpr == '{') {
				queue.push(eachExpr);
				continue;
			}

			if (queue.isEmpty())
				return false;
			char check;

			switch (eachExpr) {
			case ')':
				check = queue.pop();
				if (check == '{' || check == '[')
					return false;
				break;

			case ']':
				check = queue.pop();
				if (check == '(' || check == '{')
					return false;
				break;

			case '}':
				check = queue.pop();
				if (check == '(' || check == '[')
					return false;
				break;
			}
		}
		return (queue.isEmpty());

	}

	public static void main(String[] args) {

		String inputExpression = "(][{)}()])([](}[{]";

		if (printBalanceNotBalance(inputExpression))
			System.out.println("Balanced Expression");
		else
			System.out.println("Un-balanced Expression");

	}

}
