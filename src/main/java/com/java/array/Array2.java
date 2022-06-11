/*Array copy method*/

package com.java.array;

public class Array2 {
	
	public static void main(String[] args){
	char copyFrom[]={'a','b','c','d','e','f','g','h','i','j'};
	char copyTo[]=new char[5];
	
	System.arraycopy(copyFrom, 3, copyTo, 0, 5);
	System.out.println(new String(copyTo));
	
	}
}
