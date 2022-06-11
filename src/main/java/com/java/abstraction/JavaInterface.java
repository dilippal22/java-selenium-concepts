/*The interface is used to achieve abstraction. There can be only
 * abstract method in interface. It used to achieve abstraction and
 * multiple inheritance. Interface has static constants and abstract
 * methods. Interface also represents IS-A relationship. It is used
 * to achieve loose coupling.
 * By default, interface data members are public, static, final added
 * by compiler and methods are public abstract added by compiler.*/

//A simple interface example
package com.java.abstraction;

interface Printable{
	void print();
}

public class JavaInterface implements Printable{
	public void print(){
		System.out.println("This is implemented print() method from interface..");
	}
	
	public static void main(String[] args){
		JavaInterface obj = new JavaInterface();
		obj.print();
	}
}
