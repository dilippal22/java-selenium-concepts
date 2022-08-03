/*Write a program to find the segment of numbers with largest width from lower bound to upper bound which are divided
 * into segments based on number in the list.
 * Example:
 * Input:
 * List<Integer>=[20,13,7,29,35]
 * LowerBound = 3
 * upperBound = 30
 * Output:
 * 8; because [21-28] is the one having longest width out of all the segments [3-6], [7-12], [13-19], [20-28]
 * */

package com.qa.interview.opentext;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestWidthSegmentNumber {

	public static int NumberWithLargestWidthSegment(List<Integer> list, int lowerBound, int upperBound) {

		Collections.sort(list); // This will sort the list in ascending

		List<Integer> segmentLength = new ArrayList<>();

		for (int num : list) {
			System.out.println("lowerBound: " + lowerBound);

			for (int i = lowerBound; i < upperBound; i++) {
				if (i == num) {

					int lengthOfSegment = num - lowerBound;

					segmentLength.add(lengthOfSegment);

					lowerBound = num;
					break;
				}
			}
		}

		System.out.println(segmentLength);

		return Collections.max(segmentLength);

	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(13);
		list.add(7);
		list.add(29);
		list.add(35);
		list.add(45);

		System.out.println(NumberWithLargestWidthSegment(list, 3, 48));
	}

}
