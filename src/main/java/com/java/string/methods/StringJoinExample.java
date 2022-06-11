/*The java string join() method returns a string joined with given delimiter. In string join method, delimiter is copied for each elements.
 * In case of null element, "null" is added.
 * It returns NullPointerException if element or delimiter is null.*/

package com.java.string.methods;

public class StringJoinExample{  
	public static void main(String args[]){
		//Syntax: public static String join(CharSequence delimiter, CharSequence... elements)
		String joinString1=String.join("-","welcome","to","javatpoint");  
		System.out.println(joinString1);
	}
}
