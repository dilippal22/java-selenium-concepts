package com.java.string.methods;

public class SplitExample2{  
	public static void main(String args[]){  
		String s1="welcome to split world";
		//Syntax:public String split(String regex, int limit)
		//limit : limit for the number of strings in array. If it is zero, it will returns all the strings matching regex.
		System.out.println("returning words:");
		for(String w:s1.split("\\s",0)){  
			System.out.println(w);
			}
		
		System.out.println("returning words:");
		for(String w:s1.split("\\s",1)){
			System.out.println(w);
		}
		
		System.out.println("returning words:");  
		for(String w:s1.split("\\s",2)){  
			System.out.println(w);
		}
	}
}