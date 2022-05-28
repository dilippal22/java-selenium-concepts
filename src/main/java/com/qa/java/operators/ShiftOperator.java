/*left shift (<<)
 * right shift (>> and >>>)*/

package com.java.operator;

public class ShiftOperator {
	
	public static void main(String[] args){
		
		//Left shift
		System.out.println(10<<2);	//10*2^2 = 10*4 = 40
		System.out.println(10<<3);	//10*2^3 = 10*8 = 80
		System.out.println(20<<2);	//20*2^2 = 20*4 = 80
		System.out.println(15<<4);	//15*2^4 = 15*16 = 240
		
		//Right shift
		System.out.println(10>>2);	//10/2^2 = 10/4 = 2
		System.out.println(20>>2);	//20/2^2 = 20/4 = 5
		System.out.println(20>>3);	//20/2^3 = 20/8 = 2
		
		//>> vs >>>
		//for positive number >> and >>> works same
		System.out.println(20>>2);	//20/2^2 = 20/4 = 5
		System.out.println(20>>>2);	//20/2^2 20/4 = 5
		
		//for negative number >>> changes parity bit (MSB) to 0
		System.out.println(-20>>2);		//-20/2^2 = -20/4 = -5
		System.out.println(-20>>>2);	//1073741819 - changes parity bit to 0
		
	}

}
