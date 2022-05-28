/*The java.util.StringTokenizer class allows you to break a string into tokens. It is simple way to break string.*/

package com.java.string;

import java.util.StringTokenizer;

public class StringToken{
	public static void main(String[] args){
		StringTokenizer st = new StringTokenizer("Selenium Java is very interesting and funny");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}
}