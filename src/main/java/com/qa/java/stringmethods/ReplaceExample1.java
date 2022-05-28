/*The java string replace() method returns a string replacing all the old char or CharSequence to new char or CharSequence.*/

package com.java.string.methods;

public class ReplaceExample1{  
	public static void main(String args[]){
		String s1="javatpoint is a very good website";
		//Syntax:public String replace(char oldChar, char newChar)
		String replaceString=s1.replace('a','e');//replaces all occurrences of 'a' to 'e'  
		
		System.out.println(replaceString);
	}
}
