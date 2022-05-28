/*Write a java program to print Fibonacci series without using recursion and using recursion.
Input: 10
Output: 0 1 1 2 3 5 8 13 21 34*/

package com.java.assignments;

public class FibonacciSeriesWithoutRecursion {
	
	public static void main(String[] args){
		
		//without using recursion
		int a = 0; int b = 1;
		int c;
		int i = 2;
		int count = 10;	//count is nothing but number of iteration
		
		System.out.println(a+""+b);
		for(i=2;i<count;i++){
			c = a + b;
			System.out.println(""+c);
			
			a = b;
			b = c;
		}
	
	}

}
