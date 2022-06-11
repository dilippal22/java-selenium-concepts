/*Instantiation and initialization of array together in one line*/

package com.java.array;

public class SingleDimensional2 {
	
	public static void main(String[] args){
		String subject[] = {"Physics", "Chemistry", "Maths", "Science"};
		
		for(int i=0; i<subject.length; i++){
			System.out.println(subject[i]);
		}
	}
}
