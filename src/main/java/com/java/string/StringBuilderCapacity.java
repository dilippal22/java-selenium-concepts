package com.java.string;

public class StringBuilderCapacity {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());	//default 16
		sb.append("Java");
		System.out.println(sb.capacity());	//default 16
		sb.append("I am selenium with java");
		System.out.println(sb.capacity());	//34
		sb.append("I am selenium with java in stringbuilder class having fun.enjoying too much.");
		System.out.println(sb.capacity());	//103
	}

}
