/*postfix: exp++ and exp--
 * prefix: ++exp, --exp, +exp, -exp, ~, !*/

package com.java.operator;

public class UnaryOperator {
	
	public static void main(String[] args){
		int x = 10;
		
		System.out.println(x++);	//10(11)
		System.out.println(++x);	//(12)12
		System.out.println(x--);	//12(11)
		System.out.println(--x);	//(10)10
		
		int a = 10;
		int b = 10;
		
		System.out.println(a++ + ++a);	//10(11) + (12)12 = 22
		System.out.println(a++ + ++b);	//12(13) + (11)11 = 23
		System.out.println(b++ + b++);	//11(12) + 12(13) = 23
		
		int c = 10;
		int d = -10;
		boolean t = true;
		boolean f = false;
		
		System.out.println(~c);	//-11 (negative of total positive value that starts from 0)
		System.out.println(~d);	//9 (positive of total negative value that starts from 0)
		System.out.println(!t);	//false (opposite of boolean value)
		System.out.println(!f);	//true (opposite of boolean value)
	}

}
