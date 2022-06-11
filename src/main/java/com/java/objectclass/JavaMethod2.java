/*Calling one method from another method*/

package com.java.objectclass;

public class JavaMethod2 {
	
	public void method1(){
		method2(10);
		System.out.println("This is first method");
	}
	
	public void method2(int a){
		method3();
		System.out.println("This is second method");
	}
	
	public void method3(){
		System.out.println("This is third method");
	}
	
	public static void main(String[] args){
		JavaMethod2 m2 = new JavaMethod2();
		m2.method1();
		m2.method2(10);
		m2.method3();
	}

}
