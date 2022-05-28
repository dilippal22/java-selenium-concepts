//Fibonacci series program in java using recursion.

package com.java.assignments;

public class FibonacciSeriesWithRecursion {
	
	static int a = 0, b = 1, c = 0;
	
	static void printFibonacci(int count){
		if(count>0){
			c = a + b;
			a = b;
			b = c;
			
			System.out.println(" "+c);
			printFibonacci(count-1);
		}
	}
	
	public static void main(String[] args){
		int count = 10;	//count is nothing but number of iteration
		System.out.println(a+" "+b);	//printing 0 and 1
		printFibonacci(count-2);	//n-2, because 2 numbers are already printed
	}

}
