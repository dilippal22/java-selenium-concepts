package com.dgsl.java.collectionframework;

import java.util.HashMap;
import java.util.Map;

/* 1. Not synchronized
 * 2. Stores key-value pair
 * 3. Non-Synchronized hence not a thread-safe or it is thread fail
 * 4. Allows one NULL key and multiple NULL values
 * 5. Fast
 * 6. HashMap is traversed by iterator
 * 7. Iterator in HashMap is fail-fast
 * 8. Iterator inherits AbstractMap
 * 9. HashMap is generally preferred over Hashtable if synchronization is not needed
 * 10. HashMap doesn't allow duplicate Key and Duplicate Values.
 * 11. If Key is duplicate then old Key is replaced with new Key
*/

public class HashMapConcepts {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();

		System.out.println("********** Entering values to hash map object **********");
		map.put("Sports", "Cricket");
		map.put("Captain", "Sourav");
		map.put("Best Player", "Sachin");
		map.put("Opener", "Sehwag");
		map.put("Bowler", "Harbhajan");

		System.out.println("********** Printing hash map object values on console **********");
		System.out.println(map);

	}

}
