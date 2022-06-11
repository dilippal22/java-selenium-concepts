/*The Java continue statement is used to continue loop. It continues the current flow of the program and skips the remaining code at specified condition. In case of inner loop, it continues only inner loop.
 * Syntax:
 * jump-statement;    
   continue; 
*/

package com.java.control.statements;

public class ContinueStatement {
	
	public static void main(String[] args){
		
		int i;
		//Java Continue Statement Example
		for(i=1;i<=10;i++){
			if(i==5){
				continue;
			}
			System.out.println(i);
		}
		
		
		//Java Continue Statement with Inner Loop
		//It continues inner loop only if you use continue statement inside the inner loop.
		for(i=1;i<=3;i++){
			for(int j=1;j<=3;j++){
				if(i==2 && j==2){
					continue;
				}
				System.out.println(i+""+j);
			}
		}
		
	}

}
