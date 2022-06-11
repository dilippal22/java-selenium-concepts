/*If there is any abstract method in a class, that class must be
 *abstract. If you are extending abstract class then you have to
 *implement its method otherwise make this class as abstract.
 *Another example of abstract class.*/

package com.java.abstraction;

abstract class Bike{
	abstract void run();
	Bike(){
		System.out.println("Bike is created..");
	}
	
	void changeGear(){
		System.out.println("Gear changed..");
	}
}

class Honda extends Bike{
	void run(){
		System.out.println("Bike is running..");
	}
}

public class AbstractClass3 {
	public static void main(String[] args){
		Bike b = new Honda();
		b.run();
		b.changeGear();
	}

}
