/*The Java for loop is used to iterate a part of the program several times. If the number of iteration is fixed, it is recommended to use for loop.
 *There are three types of for loop in java.
 *Simple For Loop
 *Syntax:
 *for(initialization;condition;incr/decr){  
//code to be executed  
}  
 *For-each or Enhanced For Loop
 *Syntax:
 *for(DataType var:array){  
//code to be executed  
}  
 *Labeled For Loop
 *Syntax:
 *labelname:  
for(initialization;condition;incr/decr){  
//code to be executed  
}
 */

package com.java.control.statements;

public class ForLoop {
	
	public static void main(String[] args){
		
		//Simple For Loop
		//The simple for loop is same as C/C++. We can initialize variable, check condition and increment/decrement value.
		int p;
		for(p=1; p<=10; p++){
			System.out.println(p);
		}
		
		
		//Java For-each Loop
		//The for-each loop is used to traverse array or collection in java.
		//It works on elements basis not index. It returns element one by one in the defined variable.
		String arr[] = {"Physics", "Chemistry", "Maths", "Science", "Biology"};
		for(String x:arr){
			System.out.println(x);
		}
		
		
		//Java Labeled For Loop
		//We can have name of each for loop. To do so, we use label before the for loop. It is useful if we have nested for loop so that we can break/continue specific for loop.
		//Normally, break and continue keywords breaks/continues the inner most for loop only.
		aa:
			for(int i=1;i<=3;i++){
				bb:
					for(int j=1;j<=3;j++){
						if(i==2 && j==2){
							break aa;	//If you use break bb;, it will break inner loop only which is the default behavior of any loop.
						}
						System.out.println(i+""+j);
					}
			}
		
		
		//Java Infinitive For Loop
		//Syntax:
		//for(;;){  
			  //code to be executed  
			//}
		//If you use two semicolons ;; in the for loop, it will be infinitive for loop.
		/*for(;;){
			System.out.println("Infinitive Loop");
		}*/
	}

}
