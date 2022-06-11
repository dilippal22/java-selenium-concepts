/*Swapping two numbers using third/temp variable.*/

package com.java.assignments;

public class SwappingWithTemp {
	
	public static void main(String[] args){
		int a = 10, b = 20;
		int temp;
		
		System.out.println("Before Swap:");
		System.out.println("a value is: "+a);
		System.out.println("b value is: "+b);
		
		temp = b;	//20
		b = a;	//10
		a = temp;	//20
		
		System.out.println("After Swap:");
		System.out.println("a value is: "+a);
		System.out.println("b value is: "+b);
	}

}
