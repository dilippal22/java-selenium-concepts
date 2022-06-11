/*The java string substring() method returns a part of the string.
 * We pass begin index and end index number position in the java substring method where start index is inclusive and end index is exclusive. In other words, start index starts from 0 whereas end index starts from 1.
 * If you don't specify endIndex, java substring() method will return all the characters from startIndex.
 * It throws StringIndexOutOfBoundsException if start index is negative value or end index is lower than starting index.*/

package com.java.string.methods;

public class SubstringExample{  
	public static void main(String args[]){  
		String s1="javatpoint";  
		/*Syntax:public String substring(int startIndex)
		 * public String substring(int startIndex, int endIndex) */
		System.out.println(s1.substring(2,4));//returns va
		System.out.println(s1.substring(2));//returns vatpoint
	}
}
