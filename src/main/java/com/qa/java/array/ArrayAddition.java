/*Addition of two array*/

package com.java.array;

public class ArrayAddition {
	
	public static void main(String[] args){
		//Creating two array or two dimensional matrix
		int a[][]={{1,2,3},{4,5,6}};
		int b[][]={{7,8,9},{1,2,3}};
		
		//Creating another array or matrix to store addition of two matrix
		int c[][]=new int[2][3];
		
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				c[i][j]=a[i][j]+b[i][j];
				System.out.println(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
