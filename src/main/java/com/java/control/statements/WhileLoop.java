/*The Java while loop is used to iterate a part of the program several times. If the number of iteration is not fixed, it is recommended to use while loop.
 * Syntax;
 * while(condition){  
//code to be executed  
}  */

package com.java.control.statements;

public class WhileLoop {
	
	public static void main(String[] args){
		
		int i = 1;
		while(i<=10){
			System.out.println(i);
			i++;
		}
		
		
		//Java Infinitive While Loop
		//If you pass true in the while loop, it will be infinitive while loop.
		//Syntax:
		/*while(true){  
			//code to be executed  
			}*/
		/*while(true){
			System.out.println("Infinit while Loop");
		}*/
	}

}
