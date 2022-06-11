package com.dgsl.java.collectionframework;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

/* 1. It is synchronized
 * 2. Stores key-value pair
 * 3. When using a Hashtable or HashMap, we specify an object that is used as a key and the value that you want to be linked to that key. 
 * 	The key is then hashed, and we get hash code which is used as the index at which the value is stored in the table.
 * 4. Synchronized hence thread-safe
 * 5. Accepts only unique value and no NULL key and NULL value
 * 6. Synchronized hence slow
 * 7. Traversed by Enumerator and Iterator
 * 8. Not fail-fast
 * 9. Inherits Dictionary class
 * 10. It stores Key-Value pair in hash table data structure which internally maintains array list.
 * 11. Hash Code can be duplicate but Key and Value can never be duplicate.
*/

public class HashTableConcepts {

	public static void main(String[] args) {

		Hashtable<Integer, String> tab1 = new Hashtable<Integer, String>();
		tab1.put(1, "Pestro");
		tab1.put(2, "Preetho");
		tab1.put(3, "Centro");

		// Creating clone copy/shallow copy
		Hashtable<Integer, String> tab2 = new Hashtable<Integer, String>();
		tab2 = (Hashtable) tab1.clone();

		// Printing values from both the object after cloning
		System.out.println("*****Printing values from first object*****\n" + tab1);
		System.out.println("\n*****Printing values from second object*****\n" + tab2);

		// Remove the values from first object and then print
		tab1.clear();
		System.out.println("*****Printing after removing values from first object*****\n" + tab1);
		System.out.println("\n*****Printing values from second object*****\n" + tab2);

		// Contains Example
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("A", "Strokes");
		ht.put("B", "Teo");
		ht.put("C", "Cheema");

		System.out.println("\n*****Printing Hashtable value based on contains method*****");
		if (ht.containsValue("Cheema"))
			System.out.println("Value is found");

		// Printing all the values of HashTable using Enumeration
		Enumeration enu = ht.elements();
		System.out.println("\n*****Printing values from Hashtable using Enumeration*****");

		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}

		// Printing all the Hashtable values using entryset
		System.out.println("\n*****Printing values from Hashtable using Entryset*****");
		Set s = ht.entrySet();
		System.out.println(s);

		// Printing values from two Hashtable using equals method to check if they are
		// equal
		Hashtable<String, String> ht1 = new Hashtable<String, String>();
		ht1.put("A", "Strokes");
		ht1.put("B", "Teo");
		ht1.put("C", "Rayner");

		System.out.println(
				"\n*****Printing values from two Hashtable using equals method to check if they are equal*****");
		if (ht.equals(ht1))
			System.out.println("Both are equal");
		else
			System.out.println("Both are not equal");

		// Printing hashtable value from key
		System.out.println("\n*****Printing hashtable values using key*****");
		System.out.println(ht1.get("C"));

		// Printing hashcode
		System.out.println("\n*****Printing hashcode*****");
		System.out.println(ht1.hashCode());

	}

}
