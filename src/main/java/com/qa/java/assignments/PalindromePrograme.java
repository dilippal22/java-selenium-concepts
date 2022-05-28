/*Java Palindrome program using scanner class*/

package com.java.assignments;

import java.util.Scanner;

public class PalindromePrograme {
	private static Scanner Scan;
	
	public static void main(String[] args){
		
		int i;
		String Original, Reverse="";
		Scan = new Scanner(System.in);
		
		System.out.println("Write something to check for Palindrome:");
		Original = Scan.nextLine();
		int TextLength = Original.length();
		
		for(i = TextLength-1; i>=0; i--){
			Reverse = Reverse + Original.charAt(i);
		}
		if(Original.equals(Reverse)){
			System.out.println("Entered String is Palindrome");
		}else{
			System.out.println("Entered String is not a Palindrome");
		}
		
	}
	
	/*public static void main(String args[]){  
		  int r,sum=0,temp;    
		  int n=454;//It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  */
		
}
