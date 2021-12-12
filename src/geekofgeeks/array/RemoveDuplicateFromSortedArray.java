package geekofgeeks.array;

import java.util.ArrayList;
import java.util.stream.Stream;

public class RemoveDuplicateFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 20, 30, 30, 30, 30, 40, 50, 50 };

		removeDuplicateFromSortedArray(arr);
		printArray(arr);
	}

	private static void removeDuplicateFromSortedArray(int[] arr) {
		int distinctIndex = 0;
		for (int i = 1; i <= arr.length - 1; i++) {
			if (arr[i] != arr[distinctIndex]) {
				arr[++distinctIndex] = arr[i];
			}
		}

		// Strem code and below for loop code both are equivalent
		Stream.iterate(distinctIndex + 1, i -> i + 1).limit(arr.length - distinctIndex - 1)
				.forEach(index -> arr[index] = 0);
		/*
		 * for (int i = distinctIndex + 1; i <= arr.length - 1; i++) { arr[i] = 0; }
		 */

	}

	static void printArray(int[] arr) {
		ArrayList a = new ArrayList();
		Stream.iterate(0, i -> i + 1).limit(arr.length).forEach(i -> a.add(arr[i]));
		System.out.println(a);
	}
}
