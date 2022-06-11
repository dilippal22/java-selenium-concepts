/*Java StringBuffer class is used to create mutable (modifiable) string.
 * Java StringBuffer class is thread-safe i.e. multiple threads cannot access it simultaneously. So it is safe and will result in an order.
 * Constructor: 1)StringBuffer() 2)StringBuffer(String str)-creates a string buffer with
 * specified string. 3)StringBuffer(int capacity)-creates a string buffer with specified capacity as length.*/

//The append() method concatenates the given argument with this string.

package com.java.string;

public class StringBufferAppend {
	public static void main(String args[]){  
		StringBuffer sb=new StringBuffer("Hello ");  
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java  
		}  
	}
