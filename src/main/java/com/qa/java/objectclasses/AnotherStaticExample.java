/*Program to get cube of a given number by static method*/

package com.java.objectclass;

public class AnotherStaticExample {
	
	public static int cube(int x){
		return x*x*x;		
	}
	
	public static void main(String[] args){
		int result = AnotherStaticExample.cube(5);
		System.out.println("Cube is: "+result);
	}

}
