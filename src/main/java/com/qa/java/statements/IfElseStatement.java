/*The Java if statement is used to test the condition. It checks boolean condition: true or false. There are various types of if statement in java.
if statement
if-else statement
nested if statement
if-else-if ladder*/

package com.java.control.statements;

public class IfElseStatement {
	
	public static void main(String[] args){
		
		//Example: if statement
		int age = 20;
		if(age>18){
			System.out.println(age);
		}
		
		//Example: if-else statement
		int number = 13;
		if(number%2 == 0){
			System.out.println("Even Number");
		}else{
			System.out.println("Odd Number");
		}
		
		//if-else-if ladder statement
		int marks = 65;
		if(marks<50){
			System.out.println("fail");
		}else if(marks>=50 && marks<60){
	        System.out.println("D grade");
	    }else if(marks>=60 && marks<70){
	        System.out.println("C grade");
	    }else if(marks>=70 && marks<80){
	        System.out.println("B grade");
	    }else if(marks>=80 && marks<90){
	        System.out.println("A grade");
	    }else if(marks>=90 && marks<100){
	        System.out.println("A+ grade");
	    }else{
	        System.out.println("Invalid!");
	    } 
		
	}

}
