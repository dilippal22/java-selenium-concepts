/*The java string getChars() method copies the content of this string into specified char array. There are 4 arguments passed in getChars() method.
 * It throws StringIndexOutOfBoundsException if beginIndex is greater than endIndex.*/

package com.java.string.methods;

public class StringGetCharsExample{  
	public static void main(String args[]){  
		String str = new String("hello javatpoint how r u");  
		char[] ch = new char[10];
		try{
			//Syntax: public void getChars(int srcBeginIndex, int srcEndIndex, char[] destination, int dstBeginIndex)
			str.getChars(6, 16, ch, 0);
			System.out.println(ch);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
			}
	}
} 
