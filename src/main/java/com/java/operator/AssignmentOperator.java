/*Java Assignment operators are: = += -= *= /= %= &= ^= |= <<= >>= >>>= */

package com.java.operator;

public class AssignmentOperator {

	public static void main(String[] args) {
		
		int a = 10, b = 20;
		a+= 4;
		b-= 4;
		System.out.println(a);	//a = a+4 = 14
		System.out.println(b);	//b = b-4 = 16
		
		int c = 15;
		c+= 5;
		System.out.println(c);	//20
		
		c-= 4;
		System.out.println(c);	//c = c-4 = 20-4 = 16
		
		a*=2;
		System.out.println(a);	//14*2 = 28
		
		a/=2;
		System.out.println(a);	//28/2 = 14
		

	}

}
