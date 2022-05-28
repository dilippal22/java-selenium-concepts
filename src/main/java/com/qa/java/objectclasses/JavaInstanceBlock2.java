/*Java instance block with one method calling another inside it*/

package com.java.objectclass;

public class JavaInstanceBlock2 {
	
	public void method1(){
		method2();
		System.out.println("This is first method");
	}
	{
		System.out.println("This is first instance block");
	}
	
	public void method2(){
		System.out.println("This is second method");
	}
	{
		System.out.println("This is second instance block");
	}
	{
		System.out.println("This is third instance block");
	}
	
	public static void main(String[] args){
		JavaInstanceBlock2 j = new JavaInstanceBlock2();
		j.method1();
		j.method2();
	}

}
