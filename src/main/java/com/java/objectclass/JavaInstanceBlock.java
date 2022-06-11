/*Java Instance block example.
 * NOTE: Instance block is always executed first*/

package com.java.objectclass;

public class JavaInstanceBlock {
	
	public void method1(){
		System.out.println("This is first method");
	}
	//Instance Block declaration
	{
		System.out.println("This is instance block");
	}
	
	public static void main(String[] args){
		JavaInstanceBlock i = new JavaInstanceBlock();
		i.method1();
	}

}
