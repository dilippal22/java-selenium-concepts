/*Java Static block example. Static block is loaded when .class byte
 * is loaded into the memory. Before JDK1.5 main() method
 * declaration was optional to call static method but from JDK1.6
 * main() method is mandatory.*/

package com.java.objectclass;

public class JavaStaticBlock1 {
	
	//Instance block
	{
		System.out.println("This is first instance block");
	}
	
	//static block
	static{
		System.out.println("This is first static block");
	}
	
	//Constructor
	JavaStaticBlock1(){
		System.out.println("This is first constructor");
	}
	
	JavaStaticBlock1(int a){
		System.out.println("This is second constructor");
	}
	
	public static void main(String[] args){
		new JavaStaticBlock1();
		new JavaStaticBlock1(10);
	}

}