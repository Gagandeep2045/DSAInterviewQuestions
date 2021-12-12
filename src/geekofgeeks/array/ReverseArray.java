package geekofgeeks.array;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[] = { 23, 45, 12,34, 1 };
		reverse1(arr);
		printArray(arr);

	}

	private static void reverse(int[] arr) {
		for (int left = 0, right = arr.length - 1; left < right; left++, right--) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
		}
	}

	private static void reverse1(int[] arr) {
		for (int left = 0; left <= (arr.length / 2) - 1; left++) {
			int temp = arr[left];
			arr[left] = arr[arr.length - 1 - left];
			arr[arr.length - 1 - left] = temp;
		}
	}

	static void printArray(int[] arr) {
		ArrayList a = new ArrayList();
		Stream.iterate(0, i -> i + 1).limit(arr.length).forEach(i -> a.add(arr[i]));
		System.out.println(a);
	}

}
