/*Array is an object that contains collection of similar type of
 * element that have continuous memory location.
 * It is an index based data structure where we store fixed set
 * of similar elements.
 * It makes the code optimized, we can retrieve or sort data easily.
 * Since we can store only fixed size of element in array. It doesn't
 * grow its size during runtime, to solve this problem collection
 * framework came into existance.
 * Single-dimensional and multi-dimensional are two type of array.*/

//This is an example of single-dimensional array

package com.java.array;

public class SingleDimensional {
	
	//Declaring and instantiating array
	public static void main(String[] args){
		int a[] = new int[5];
		//initializing array
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		//Printing array
		for(int i=0; i<a.length; i++){
			System.out.println("Array elements are: "+a[i]);
			
		}
	}

}
