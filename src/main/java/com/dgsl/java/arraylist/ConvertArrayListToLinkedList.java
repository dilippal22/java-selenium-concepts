/* Write a Java program to convert ArrayList to LinkedList.
 	Input: ArrayList: [Geeks, forGeeks, A computer Portal] 
	Output: LinkedList: [Geeks, forGeeks, A computer Portal]
	Input: ArrayList: [1, 2, 3, 4, 5] 
	Output: LinkedList: [1, 2, 3, 4, 5] 
*/

package com.dgsl.java.arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConvertArrayListToLinkedList {

	public static void main(String[] args) {

		List<String> arrayListSports = new ArrayList<String>();

		arrayListSports.add("Cricket");
		arrayListSports.add("Football");
		arrayListSports.add("Hockey");
		arrayListSports.add("Vollyball");
		arrayListSports.add("Baseball");
		arrayListSports.add("Tennis");
		arrayListSports.add("Snooker");
		arrayListSports.add("Racing");

		System.out.println("Sports from Array List: " + arrayListSports);

		List<String> linkedListSports = new LinkedList<String>();

		System.out.println("-------------- 1st Method ------------");
		for (String s : arrayListSports) {
			linkedListSports.add(s);
		}
		System.out.println("Sports from Linked List: " + linkedListSports);

		System.out.println("-------------- 2nd Method ------------");
		linkedListSports.addAll(arrayListSports);
		System.out.println("Sports from Linked List: " + linkedListSports);

	}

}
