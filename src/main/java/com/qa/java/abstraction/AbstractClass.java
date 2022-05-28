/*A class that is declared with abstract keyword is known as abstract class.
 * Abstraction is the process of hiding implementation details and
 * showing only the functionality to the user. Abstraction can be
 * achieved in 2 ways: 1)Abstract class(0 to 100%) 2)Interface(100%).
 * Abstract method does not have body. Abstract classes are extended
 * and abstract methods are implemented.*/

//This is a simple example of abstract class and abstract method
package com.java.abstraction;

abstract class ChildClass {
	abstract void run();
}

public class AbstractClass extends ChildClass{
	void run(){
		System.out.println("This is implemented abstract run() method..");
	}
	
	public static void main(String[] args){
		ChildClass obj = new AbstractClass();
		obj.run();
	}
}
