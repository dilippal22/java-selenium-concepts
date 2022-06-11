/*Using this() to invoke current class constructor.	It is use to reuse
 * constructor. In other words, it is used for constructor chaining.
 * Example: calling default constructor from parameterized
 * constructor.*/

package com.java.objectclass;

public class Constructor3 {
	
	Constructor3(){
		System.out.println("This is non-parameterized/default constructor");
	}
	
	Constructor3(int x){
		this();
		System.out.println(x);
	}
	
	public static void main(String[] args){
		new Constructor3(10);
	}
}
