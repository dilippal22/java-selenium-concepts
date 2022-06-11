/*The java string split() method splits this string against given regular expression and returns a char array.
 * It throws PatternSyntaxException if pattern for regular expression is invalid*/

package com.java.string.methods;

public class SplitExample1{  
	public static void main(String args[]){  
		String s1="java string split method by javatpoint";
		//Syntax:public String split(String regex)
		String words[]=s1.split("\\s");//splits the string based on whitespace
		//using java for each loop to print elements of string array
		for(String w:words){
			System.out.println(w);
		}
	}
}