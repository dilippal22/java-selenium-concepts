/*The java string getBytes() method returns the byte array of the string. In other words, it returns sequence of bytes.*/

package com.java.string.methods;

public class StringGetBytesExample{  
	public static void main(String args[]){  
		String s1="abcdefg";  
		byte[] barr=s1.getBytes();  

		for(int i=0;i<barr.length;i++){  
			System.out.println(barr[i]);
		}
	}
}
