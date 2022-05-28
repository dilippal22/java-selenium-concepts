/*Multiplicative: *, / and %
 * addictive: + and -*/

package com.java.operator;

public class ArithmeticOperator {
	
	public static void main(String[] args){
		int a = 10;
		int b = 5;
		
		System.out.println(a+b);	//15
		System.out.println(a-b);	//5
		System.out.println(a*b);	//50
		System.out.println(a/b);	//2
		System.out.println(a%b);	//0 (modulus gives remainder)
		
		System.out.println(10*10/5+3-1*4/2);	//21 - BODMAS  rule(bracket of Division Multiplication addition subtraction)
		
	}

}
