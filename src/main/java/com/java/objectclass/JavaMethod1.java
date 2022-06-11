/*Calling one method from another method using this()*/

package com.java.objectclass;

public class JavaMethod1 {
	
	int a = 2, b = 4;
	String name = "Selenium";
	
	public void method1(){
		System.out.println("This is first method");
	}
	
	public void method2(int a){
		System.out.println("This is second method");
		//this.a = a;
		System.out.println(this.a);
	}
	
	public void method3(int b, String name){
		System.out.println("This is third method");
		//this.b = b;
		//this.name = name;
		System.out.println(this.b+" "+this.name);
	}
	
	public static void main(String[] args){
		JavaMethod1 m = new JavaMethod1();
		m.method1();
		m.method2(10);
		m.method3(20, "Java");
		System.exit(0);
	}

}
