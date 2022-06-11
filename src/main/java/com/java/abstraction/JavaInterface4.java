//Example to achieve multiple inheritance through interface

package com.java.abstraction;

interface FirstInterface{
	void print();
}

interface SecondInterface{
	void show();
}

public class JavaInterface4 implements FirstInterface, SecondInterface {
	public void print(){
		System.out.println("This is first interface print() method implementation");
	}
	
	public void show(){
		System.out.println("This is second interface show() method implementation");
	}
	
	public static void main(String[] args){
		JavaInterface4 obj = new JavaInterface4();
		obj.print();
		obj.show();
	}

}
