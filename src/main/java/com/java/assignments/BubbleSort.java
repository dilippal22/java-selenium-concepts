/*Bubble sort using Java*/

package com.java.assignments;

import java.util.Arrays;

public class BubbleSort {

	public void BubbleSortConstructor(int arr[]){
		int n = arr.length;
		int i, j;
		for(i=0; i<n-1; i++)
			for(j=0; j<n-i-1; j++)
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
	}
	
	//Printing Array
	public void PrintArray(int arr[]){
		int n = arr.length;
		for(int i=0; i<n; i++)
			System.out.println(arr[i]);
	}
	
	public static void main(String[] args){
		BubbleSort BS = new BubbleSort();
		int arr[] = {64, 34, 25, 12, 22, 11, 90};
		BS.BubbleSortConstructor(arr);
		System.out.println("Sorted Array");
		BS.PrintArray(arr);
		
		//*Second Method*
				/*int Data[] = {3, 1, 5, 7, 0, 6};
				
				Arrays.sort(Data);
				for(int c : Data){
					System.out.println(c);
				}*/
	}

}
