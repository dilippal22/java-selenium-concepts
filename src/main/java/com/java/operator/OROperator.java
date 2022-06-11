/*Java OR Operator Example: Logical || and Bitwise |.
 * The logical || operator doesn't check second condition if first condition is true. It checks second condition only if first one is false.
 * The bitwise | operator always checks both conditions whether first condition is true or false.*/

package com.java.operator;

public class OROperator {
	
	public static void main(String[] args){
		int a = 10, b = 5, c = 20;
		
		System.out.println(a>b || a<c);	//10>5 || 10<20 = true || true = true
		System.out.println(a>b | a<c);	//10>5 | 10<20 = true | true = true
		
		//Logical OR(||) vs Bitwise OR(|)
		System.out.println(a>b || a++<c);	//10>5 || 10(11)<20 = true || true = true
		System.out.println(a);	//10 (Because second condition is not checked)
		System.out.println(a>b | a++<c);	//10>5 | 11(12)<20 = true | true = true
		System.out.println(a);	//11(Because second condition is checked)
		
	}

}
