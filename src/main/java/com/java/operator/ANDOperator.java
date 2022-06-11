/*Java AND Operator Example: Logical && and Bitwise &.
 * Logical &&: The logical && operator doesn't check second condition if first condition is false. It checks second condition only if first one is true.
 * Bitwise &: The bitwise & operator always checks both conditions whether first condition is true or false.*/

package com.java.operator;

public class ANDOperator {
	static int a = 10;
	static int b = 5;
	static int c = 20;
	
	public static void main(String[] args){
		System.out.println(a<b && a<c);	//false && true = false
		System.out.println(a<b & a<c);	//false & true = false
		
		//Logical AND(&&) vs Bitwise AND(&)
		System.out.println(a<b && a++<c);	//10<5 && 10(11)<20 = false && true = false
		System.out.println(a);	//10(Because second condition is not checked)
		System.out.println(a<b & a++<c);	//10<5 && 11(12)<20 = false & true = false
		System.out.println(a);	//11(Because second condition is checked)
	}

}
