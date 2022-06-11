/*Instance block with multiple method*/

package com.java.objectclass;

public class JavaInstanceBlock1 {
	
	public void method1(){
		System.out.println("This is first method");
	}
	
	public void method2(JavaMethod1 j1){
		System.out.println("This is second method");
	}
	
	public void method3(JavaMethod1 j1, JavaMethod2 j2){
		System.out.println("This is third method");
	}
	{
	System.out.println("This is instance block");
	}
	
	public static void main(String[] args){
		JavaInstanceBlock1 i = new JavaInstanceBlock1();
		JavaMethod1 m1 = new JavaMethod1();
		JavaMethod2 m2 = new JavaMethod2();
		i.method1();
		i.method2(m1);
		i.method3(m1, m2);
	}

}
