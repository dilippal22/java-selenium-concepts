/*We can return this keyword as an statement from the method. In such case, return type of the method must be the class type (non-primitive).
 * Syntax: return_type method_name{
 * 		   return this;
 * 		}*/

package com.java.objectclass;

public class Constructor7 {
	
	Constructor7 method1(){
		return this;
	}
	
	public void method2(){
		System.out.println("This is second method");
	}
	
	public static void main(String[] args){
		new Constructor7().method1().method2();
	}

}
