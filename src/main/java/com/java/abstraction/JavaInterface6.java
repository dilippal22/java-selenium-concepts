/*From Java 8 onwards, we can have method body inside interface but it has
 *to default interface.*/

package com.java.abstraction;

interface Interface1{
	default void firstMethod(){
		System.out.println("This is firstMethod from OneInterface");
	}
}

interface Interface2 extends Interface1{
	void twoMethod();
}

public class JavaInterface6 implements Interface2{
	public void twoMethod(){
		System.out.println("This is twoMethod implementation from Interface2");
	}
	
	public static void main(String[] args){
		JavaInterface6 obj = new JavaInterface6();
		Interface2 obj2 = new JavaInterface6();
		obj.twoMethod();
		obj2.firstMethod();
	}

}
