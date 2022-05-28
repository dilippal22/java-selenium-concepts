/*Proving that this() keyword refers to the current class instance
 * variable. In this program, we are printing the reference
 * variable and this(), output of both variables are same.
 * Since both Reference IDs are same, it proves that this() keyword refers to the current class instance variable.*/

package com.java.objectclass;

public class Constructor8 {
	
	public void method1(){
		System.out.println("Reference ID of this() is: "+this);
	}
	
	public static void main(String[] args){
		Constructor8 obj = new Constructor8();
		System.out.println("Reference ID of obj is: "+obj);
		obj.method1();
	}

}
