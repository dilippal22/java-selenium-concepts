/*The java string lastIndexOf() method returns last index of the given character value or substring. If it is not found, it returns -1. The index counter starts from zero.*/

package com.java.string.methods;

public class LastIndexOfExample{
	public static void main(String args[]){  
		String s1="this is index of example";//there are 2 's' characters in this sentence
		
		//returns last index position for the given char values
		int index1=s1.lastIndexOf('s');//returns last index of 's' char value
		System.out.println(index1);//6
		
		//returns last index position for the given char value and from index
		int index2=s1.lastIndexOf('s',4);
		System.out.println(index2);
		
		//returns last index position for the given substring
		int index3=s1.lastIndexOf("is");
		System.out.println(index3);
		
		//returns last index position for the given substring and from index
		int index4=s1.lastIndexOf("is", 2);
		System.out.println(index4);
	}
}
