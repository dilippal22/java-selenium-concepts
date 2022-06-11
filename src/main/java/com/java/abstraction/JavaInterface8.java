/*From Java 8 onwards, we can have static method inside interface*/

package com.java.abstraction;

interface Inteface1{
	void draw();
	static int multiply(int n){
		return n*n;
	}
}

public class JavaInterface8 implements Inteface1{
	public void draw(){
		System.out.println("This is draw() method from Interface1");
	}
	
	public static void main(String[] args){
		JavaInterface8 obj = new JavaInterface8();
		obj.draw();
		int result = Inteface1.multiply(5);
		System.out.println("Multiply value is: "+result);
	}

}
