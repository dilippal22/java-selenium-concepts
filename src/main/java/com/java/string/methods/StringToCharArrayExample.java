/*The java string toCharArray() method converts this string into character array. It returns a newly created character array, its length is similar to this string and its contents are initialized with the characters of this string.*/

package com.java.string.methods;

public class StringToCharArrayExample{  
	public static void main(String args[]){  
		String s1="hello";
		//Syntax:public char[] toCharArray()
		char[] ch=s1.toCharArray();
		for(int i=0;i<ch.length;i++){  
			System.out.print(ch[i]);
		}
	}
}
