//Real scenario of abstract class

package com.java.abstraction;

abstract class Shape{
	abstract void draw();
}

class Rectangle extends Shape{
	void draw(){
		System.out.println("Drawing rectangle..");
	}
}

class Circle extends Shape{
	void draw(){
		System.out.println("Drawing Circle..");
	}
}

public class AbstractClass2 {
	public static void main(String[] args){
		Shape s = new Circle();
		Shape s2 = new Rectangle();
		s.draw();
		s2.draw();
		
	}
	

}
