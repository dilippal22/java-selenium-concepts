/*The java string concat() method combines specified string at the end of this string. It returns combined string. It is like appending another string.*/

package com.java.string.methods;

public class ConcatExample{  
	
	public static void main(String args[]){  
		String s1="java string";  
		
		s1 = s1.concat(" is immutable");  
		//System.out.println(s1);  
		
		s1=s1.concat(" so assign it explicitly");  
		System.out.println(s1);
	}
}
