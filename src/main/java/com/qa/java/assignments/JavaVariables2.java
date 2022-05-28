package com.java.assignments;

public class JavaVariables2 {
	
	int a = 10;
	int b = 20;
	static int c = 30;
	static int d = 40;
	
	public void m1(){
		System.out.println(a);
		System.out.println(b);
		System.out.println(JavaVariables2.c);
		System.out.println(JavaVariables2.d);
	}
	
	public static void m2(){
		JavaVariables2 jv = new JavaVariables2();
		System.out.println(jv.a);
		System.out.println(jv.b);
		System.out.println(JavaVariables2.c);
		System.out.println(JavaVariables2.d);
	}
	public static void main(String[] args){
		JavaVariables2 jv = new JavaVariables2();
		jv.m1();
		JavaVariables2.m2();
		System.exit(0);
		
	}
}
