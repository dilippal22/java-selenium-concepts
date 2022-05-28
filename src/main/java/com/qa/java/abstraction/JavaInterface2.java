//Drawable example using interface

package com.java.abstraction;

interface Drawable{
	void draw();
}

class Rectangular implements Drawable{
	public void draw(){
		System.out.println("Draw a Rectangle..");
	}
}

class Circular implements Drawable{
	public void draw(){
		System.out.println("Draw a Circle..");
	}
}

public class JavaInterface2 {
	public static void main(String[] args){
		Drawable obj = new Rectangular();
		Drawable obj2 = new Circular();
		obj.draw();
		obj2.draw();
	}

}
