/*this() keyword is used to pass argument to the method. The this()
 * keyword can also be passed as an argument in the method. It is
 * mainly used in the event handling.
 * NOTE: In event handling (or) in a situation where we have to
 * provide reference of a class to another one. It is used to
 * reuse one object in many methods.*/

package com.java.objectclass;

public class Constructor6 {
	
	public void method1(Constructor6 obj){
		System.out.println("This is first method");
	}
	
	public void method2(){
	method1(this);
	System.out.println("This is second method");
	}
	
	public static void main(String[] args){
		Constructor6 s = new Constructor6();
		s.method2();
	}

}
