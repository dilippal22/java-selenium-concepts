package com.java.string;

public class StringBuilderDelete {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		sb.delete(1, 3);
		System.out.println(sb);

	}

}
