/*Write a program to check prime number*/

package com.java.assignments;

public class PrimeNumber {
	
	public static void main(String[] args){
		
		int i, m, a = 44, b = 7;
		int flag=0;
		
		m = a/2;
		for(i=2; i<=m; i++){
			if(a%i==0){
				System.out.println("Prime number");
				flag=1;
				break;
			}
		}
		
		if(flag==0){
			System.out.println("Not a Prime Number");
		}
	}

}
