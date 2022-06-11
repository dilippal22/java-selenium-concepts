/*The java string charAt() method returns a char value at the given index number. The index number starts from 0. It returns StringIndexOutOfBoundsException if given index number is greater than this string or negative index number.
 * It throws StringIndexOutOfBoundsException : if index is negative value or greater than this string length.*/

package com.java.string.methods;

public class CharAt {
	
	public static void main(String[] args){
	String name = "Dilip";
	
	//Java String charAt() method example
	char c = name.charAt(3);
	System.out.println(c);
	
	//StringIndexOutOfBoundsException with charAt() example
	/*char c = name.charAt(9);
	System.out.println(c);*/
	}

}
