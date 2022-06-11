/*Java StringBuilder class is used to create mutable (modifiable) string. The Java StringBuilder class is same as StringBuffer class except that it is non-synchronized.
 * Constructor: 1)StringBuffer() 2)StringBuffer(String str)-creates a string buffer with
 * specified string. 3)StringBuffer(int capacity)-creates a string buffer with specified capacity as length.*/

package com.java.string;

public class StringBuilderAppend {
	public static void main(String[] args){
		StringBuilder sb = new StringBuilder("Hello ");
		sb.append("Java");
		System.out.println(sb);
	}

}
