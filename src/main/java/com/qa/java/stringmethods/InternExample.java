/*The java string intern() method returns the interned string. It returns the canonical representation of string.
 * It can be used to return string from pool memory, if it is created by new keyword.*/

package com.java.string.methods;

public class InternExample{  
	public static void main(String args[]){
		//Creating string using new keyword
		String s1=new String("hello");
		//Creating string using string literal
		String s2="hello";
		String s3=s1.intern();//returns string from pool, now it will be same as s2  
		
		System.out.println(s1==s2);//false because reference is different  
		System.out.println(s2==s3);//true because reference is same
	}
}
