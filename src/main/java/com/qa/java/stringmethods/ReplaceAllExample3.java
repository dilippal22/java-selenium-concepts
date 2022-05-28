package com.java.string.methods;

public class ReplaceAllExample3{  
	public static void main(String args[]){  
		String s1="My name is Khan. My name is Bob. My name is Sonoo.";
		//remove all the occurrences of white spaces.
		String replaceString=s1.replaceAll("\\s","");  
		
		System.out.println(replaceString);
	}
}
