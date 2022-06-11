/*Swapping two numbers without using third/temp variable.*/

package com.java.assignments;

public class SwappingWithoutTemp {
	
	public static void main(String[] args){
		int a = 10, b = 20;
		
		System.out.println("Before Swap:");
		System.out.println("a value is: "+a);
		System.out.println("b value is: "+b);
		
		a = a+b;	//30
		b = a-b;	//10
		a = a-b;	//20
		
		System.out.println("After Swap:");
		System.out.println("a value is: "+a);
		System.out.println("b value is: "+b);
	}

}
