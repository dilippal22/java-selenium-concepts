/*The java string startsWith() method checks if this string starts with given prefix. It returns true if this string starts with given prefix else returns false.*/

package com.java.string.methods;

public class StartsWithExample{  
	public static void main(String args[]){
		String s1="java string split method by javatpoint";  
		/*Syntax:public boolean startsWith(String prefix)
		 * public boolean startsWith(String prefix, int offset)*/
		System.out.println(s1.startsWith("ja"));  
		System.out.println(s1.startsWith("java string"));
	}
}
