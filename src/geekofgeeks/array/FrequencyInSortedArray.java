package geekofgeeks.array;

import java.util.HashMap;
import java.util.Map;

public class FrequencyInSortedArray {

	public static void main(String[] args) {
		// int[] arr = { 10, 10, 10, 25, 25, 30, 30 };
		int[] arr = { 10, 10, 10 };
		//int[] arr = { 10, 20, 30 };

		frequencyInSortedArray_IndexApproach(arr);
		frequencyInSortedArray_CountApproach(arr);

	}

	private static void frequencyInSortedArray_CountApproach(int[] arr) {
		Map<Integer, Integer> occurenceMap = new HashMap<>();
		int count = 0;
		for (int i = 0, previous = arr[0]; i < arr.length; i++) {
			if (arr[i] != previous) {
				occurenceMap.put(previous, count);
				previous = arr[i];
				count = 1;
			} else {
				count++;
			}
		}
		occurenceMap.put(arr[arr.length - 1], count);
		System.out.println(occurenceMap);
	}

	public static void frequencyInSortedArray_IndexApproach(int[] arr) {
		Map<Integer, Integer> occurenceMap = new HashMap<>();
		int newValueIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr[newValueIndex]) {
				occurenceMap.put(arr[newValueIndex], i - newValueIndex);
				newValueIndex = i;
			}
		}
		occurenceMap.put(arr[newValueIndex], arr.length - newValueIndex);
		System.out.println(occurenceMap);
	}

}
