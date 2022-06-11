/*Example on Anonymous Object*/

package com.java.control.statements;

public class AnonymousObjectExample {
	void fact(int n){
		int fact = 1;
		for(int i=1; i<=n; i++){
			fact=fact*i;
		}
		System.out.println("Factorial is: "+fact);
	}
	
	public static void main(String[] args){
		//Anonymous Object created and using that called method
		new AnonymousObjectExample().fact(5);
	}

}
