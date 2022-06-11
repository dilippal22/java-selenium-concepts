package com.java.string;

public class StringBuilderEnsureCapacity {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());	//default 16
		sb.append("Hello");
		System.out.println(sb.capacity());	//16
		sb.append("i am selenium with java enjoying.");
		System.out.println(sb.capacity());	//38
		sb.ensureCapacity(10);
		System.out.println(sb.capacity());	//38
		sb.ensureCapacity(40);
		System.out.println(sb.capacity());	//78

	}

}
