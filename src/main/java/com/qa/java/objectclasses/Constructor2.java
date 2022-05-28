/*using this() keyword to invoke current class method. If you don't
 * use this() keyword, then compiler automatically adds this()
 * keyword while invoking the method.*/

package com.java.objectclass;

public class Constructor2 {
	
	public void method1(){
		System.out.println("This is first method");
	}
	
	public void method2(){
		//this.method1();
		System.out.println("This is second method");
		this.method1();
	}
	
	public static void main(String[] args){
		Constructor2 obj = new Constructor2();
		obj.method2();
	}

}
