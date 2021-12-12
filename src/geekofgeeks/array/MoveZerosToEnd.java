package geekofgeeks.array;

import java.util.ArrayList;
import java.util.stream.Stream;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		int arr[] = { 0,23, 12,6, 0, 0, 1, 2, 0, 3, 0 };
		movesZerosToEnd(arr);
		printArray(arr);
	}
	
	private static void movesZerosToEnd(int[] arr) {
		// count maintains no of non zero elements upto index i in arr
		for (int i = 0, count = 0; i <= arr.length - 1; i++) {
			if (arr[i] != 0) {
				if (arr[count] == 0) {
					swap(arr, i, count);
				}
				count++;
			}
		}
	}

	private static void swap(int[] arr, int i, int count) {
		int temp = arr[i];
		arr[i] = arr[count];
		arr[count] = temp;
	}

	static void printArray(int[] arr) {
		ArrayList a = new ArrayList();
		Stream.iterate(0, i -> i + 1).limit(arr.length).forEach(i -> a.add(arr[i]));
		System.out.println(a);
	}

}
