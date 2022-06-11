/*The java string replaceAll() method returns a string replacing all the sequence of characters matching regex and replacement string.*/

package com.java.string.methods;

public class ReplaceAllExample1{  
	public static void main(String args[]){  
		String s1="javatpoint is a very good website";
		//Syntax:public String replaceAll(String regex, String replacement)
		String replaceString=s1.replaceAll("a","e");//replaces all occurrences of "a" to "e"  
		
		System.out.println(replaceString);
	}
}
