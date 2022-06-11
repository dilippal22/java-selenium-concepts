/*Passing array to method*/

package com.java.array;

public class SingleDimension3 {
	
	public static void method(int arr[]){
		int min = arr[0];
		
		for(int i=1;i<arr.length;i++){
			if(min>arr[i]){
				min = arr[i];
				System.out.println(min);
			}
		}
	}
		
		public static void main(String[] args){
			int arr[] = {76,332,67,12};
			SingleDimension3.method(arr);
		}
	}

