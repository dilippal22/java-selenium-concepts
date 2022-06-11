/*Using this() to invoke current class constructor.	It is use to reuse
 * constructor. In other words, it is used for constructor chaining.
 * Example: calling parameterized constructor from default
 * constructor.*/

package com.java.objectclass;

public class Constructor4 {
	
	Constructor4(){
		this(10);
		System.out.println("This is non-parameterized/default constructor");
	}
	
	Constructor4(int x){
		System.out.println(x);
	}
	
	public static void main(String[] args){
		new Constructor4();
	}
}
