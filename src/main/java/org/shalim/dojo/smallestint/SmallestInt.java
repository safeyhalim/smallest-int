package org.shalim.dojo.smallestint;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Safey A.Halim
 *
 */
public class SmallestInt {
	public static List<Integer> createList(int size) {
		if (size < 0) {
			return null;
		}
		final List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			list.add(null);
		}
		return list;
	}
	
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int getSmallestInt(int[] arr) {
		int max = getMax(arr);
		if (max < 0) {
			return 0;
		} if (max == 0) {
			return 1;
		}
		final List<Integer> list = createList(max + 1);
		for (int i = 0; i < arr.length; i++) {
			list.set(arr[i], new Integer(arr[i]));
		}
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) == null) {
				return i;
			}
		}	
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println(getSmallestInt(new int[] {1, 5, 7, 9, 3}));
		System.out.println(getSmallestInt(new int[] {0, -1, -5, -6, -9}));
		System.out.println(getSmallestInt(new int[] {-1, -5, -6, -9}));
	}
}