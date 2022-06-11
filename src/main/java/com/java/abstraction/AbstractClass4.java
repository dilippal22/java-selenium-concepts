//Example of Abstract class and interface

package com.java.abstraction;

interface Interface{
	void method1();
	void method2();
	void method3();
	void method4();
}

abstract class OneClass implements Interface{
	public void method1(){
		System.out.println("This is first method");
	}
}

class TwoClass extends OneClass{
	public void method2(){
		System.out.println("This is second method");
	}
	public void method3(){
		System.out.println("This is third method");
	}
	public void method4(){
		System.out.println("This is fourth method");
	}
}
public class AbstractClass4 {
	public static void main(String[] args){
	TwoClass obj = new TwoClass();
	obj.method1();
	obj.method2();
	obj.method3();
	obj.method4();
}
}