/*Calling instance variable in static method and static method in
 * static main method*/

package com.java.assignments;

public class JavaVariables {
	int a = 10;
	int b = 20;
	
	static void m1(){
		JavaVariables jv = new JavaVariables();
		System.out.println(jv.a);
		System.out.println(jv.b);
	}
	
	static void m2(){
		JavaVariables jv2 = new JavaVariables();
		System.out.println(jv2.a);
		System.out.println(jv2.b);
		
	}
	public static void main(String[] args){
		JavaVariables.m1();
		JavaVariables.m2();

		System.exit(0);
}
}
