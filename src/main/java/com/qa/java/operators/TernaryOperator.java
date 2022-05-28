/*Java Ternary Operators are '?' and ':'*/

package com.java.operator;

public class TernaryOperator {
	
	public static void main(String[] args){
		
		int a= 2, b = 5;
		
		int min = (a<b)?a:b;
		System.out.println(min);	//(2<5)?2:5 = 2 (true, hence 2. If a is less than b then min is assigned value of a)
		
		int x = 10, y = 5;
		int min2 = (x<y)?x:y;
		System.out.println(min2);	//(10<5)?10:5 = 5 (false, hence 5)
		
	}

}
