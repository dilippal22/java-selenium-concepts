//Example of an interface is inheriting another interface

package com.java.abstraction;

interface OneInterface{
	void firstMethod();
}

interface TwoInterface extends OneInterface{
	void secondMethod();
}

public class JavaInterface5 implements TwoInterface{
	public void firstMethod(){
		System.out.println("This is firstMethod implementation from OneInterface");
	}
	
	public void secondMethod(){
		System.out.println("This is secondMethod implementation from TwoInterface");
	}
	
	public static void main(String[] args){
		JavaInterface5 obj = new JavaInterface5();
		obj.firstMethod();
		obj.secondMethod();
	}

}
