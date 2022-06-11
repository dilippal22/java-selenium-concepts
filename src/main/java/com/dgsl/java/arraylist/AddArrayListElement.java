package com.dgsl.java.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class AddArrayListElement {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		// Adding elements to arraylist object
		al.add("Sachin");
		al.add("Brian");
		al.add(1, "Matthew");
		al.add("Matthew");

		// Using iterator interface
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("");

		// Using for each loop
		for (String name : al) {
			System.out.println(name);
		}

		System.out.println("");

		// Using for loop
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		System.out.println("");

		// Using for each and lambda expression
		al.forEach(name -> {
			System.out.println(name);
		});

		System.out.println("");

		// Using iterator and for eachEachRemaining loop and lambda expression
		itr = al.iterator();
		itr.forEachRemaining(name -> {
			System.out.println(name);
		});

		System.out.println("");
		
		// Using list iterator to traverse in both direction
		ListIterator<String> listItr = al.listIterator(al.size());

		while (listItr.hasPrevious()) {
			String name = listItr.previous();
			System.out.println(name);
		}
	}

}
