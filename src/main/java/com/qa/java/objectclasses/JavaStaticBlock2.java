/*Another Java Static Block example. Static block is used to
 * initialize static variable also. When code is ran, JVM performs
 * two operation viz. loading .class file into memory and then calling
 * main() method. When class file loaded into memory static method
 * is called.
 * Static method is called once only i.e during class file loading
 * into memory*/

package com.java.objectclass;

public class JavaStaticBlock2 {
	
	static int a;
	
	static{
		a = 10;
	}
	
	static void disp(){
		System.out.println(JavaStaticBlock2.a);
	}
	
	{
		System.out.println("This is first instance block");
	}
	
	public static void main(String[] args) throws ClassNotFoundException{
		JavaStaticBlock2.disp();
		new JavaStaticBlock2();//nameless object
		Class.forName("JavaStaticBlock3");
	}

}