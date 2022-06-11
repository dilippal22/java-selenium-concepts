/*String is basically an object that represents sequence of char values. An array of character works same as java string.
 * String class provides lot of method to perform operations such as compare(), concat(), equals(), split(), length(), replace(), compareTo(), intern(), substring() etc.
 * java.lang.string class implements Serializable, Comparable and CharSequence interface.
 * CharSequence interface is used to represent sequence of character. CharSequence is implemented by String, StringBuffer and StringBuilder class. That means we can create string in java by using these 3 classes.
 * Java String is immutable i.e can not be changed. Whenever we change string, a new instance is created. For mutable string, StringBuffer and StringBuilder classes are used.
 * There are two ways to create string object: 1) By string literal 2) By new keyword.
 * String objects are stored in special area known as string constant pool.
 * Every time you crate a string literal, JVM checks the String constant pool. If the string already exists in the pool, a reference to the pooled instance is returned. If string doesn't exist in pool a new string instance is created and placed in the pool.
 * Java uses string literal to make more memory efficient because no new objects are created if it is already existing in string constant pool.*/

//Simple java string example

package com.java.string;

public class JavaString {
	public static void main(String[] args){
		//creating string literal
		String s = "Dilip";
		
		//Declaring and initializing array
		char c[] = {'s', 't', 'r', 'i', 'n', 'g'};
		
		//Converting char type array to string
		String s1 = new String(c);
		
		//creating string using new keyword
		String s2 = new String("Kavita");
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
	}

}
