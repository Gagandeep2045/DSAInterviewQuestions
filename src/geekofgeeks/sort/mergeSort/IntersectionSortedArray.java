package geekofgeeks.sort.mergeSort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionSortedArray {

	public static void main(String[] args) {
		// int[] arr1 = { 2, 5, 5, 7, 10, 12, 22, 25 };
		// int[] arr2 = { 3, 4, 5, 5, 5, 6, 10, 13 };
		int[] arr1 = { 1, 1, 3, 3, 3 };
		int[] arr2 = { 1, 3, 8, 15, 18, 20, 25 };
		Collection<Integer> set = intersectionOfSortedArray(arr1, arr2);
		System.out.println(set);
	}

	private static Collection<Integer> intersectionOfSortedArray(int[] arr1, int[] arr2) {
		int i = 0, j = 0;
		// List<Integer> al = new ArrayList<>();
		Set<Integer> al = new HashSet<>();
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] == arr2[j]) {
				al.add(arr1[i]);
				i++;
				j++;
			} else if (arr1[i] < arr2[j]) {
				i++;
			} else {
				j++;
			}
		}
		return al;
	}

}
