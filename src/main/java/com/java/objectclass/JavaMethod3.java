/*Passing parameter to the method as an object*/

package com.java.objectclass;

public class JavaMethod3 {
	
	public void method1(){
		method2(null);
		System.out.println("This is first method");
	}
	
	public void method2(JavaMethod1 j1){
		method3(null, null);
		System.out.println("This is second method");
	}
	
	public void method3(JavaMethod1 j1, JavaMethod2 j2){
		System.out.println("This is third method");
	}
	
	public static void main(String[] args){
		JavaMethod3 m = new JavaMethod3();
		JavaMethod1 jm1 = new JavaMethod1();
		JavaMethod2 jm2 = new JavaMethod2();
		m.method1();
		m.method2(jm1);
		m.method3(jm1, jm2);
	}

}
