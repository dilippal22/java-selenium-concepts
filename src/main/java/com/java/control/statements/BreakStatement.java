/*The Java break is used to break loop or switch statement. It breaks the current flow of the program at specified condition. In case of inner loop, it breaks only inner loop.
 * Syntax:
 * jump-statement;    
	break; 
*/

package com.java.control.statements;

public class BreakStatement {
	
	public static void main(String[] args){
		
		int i;
		//Java Break Statement with Loop
		for(i=1;i<=10;i++){
			if(i==5){
				break;
			}
			System.out.println(i);
		}
		
		
		//Java Break Statement with Inner Loop
		//It breaks inner loop only if you use break statement inside the inner loop.
		for(i=1;i<=3;i++){
			for(int j=1;j<=3;j++){
				if(i==2 && j==2){
					break;
				}
				System.out.println(i+""+j);
			}
		}
	}

}
