/*From Java 8 onwards, we can have method body inside interface but it has
 *to default interface.*/

package com.java.abstraction;

interface InterfaceOne{
	void draw();
	default void msg(){
		System.out.println("This is msg() method implementation form InterfaceOne");
	}
}

public class JavaInterface7 implements InterfaceOne{
	public void draw(){
		System.out.println("This is draw() method implementation from InterfaceOne");
	}
	
	public static void main(String[] args){
		InterfaceOne obj = new JavaInterface7();
		obj.draw();
		obj.msg();
	}

}
