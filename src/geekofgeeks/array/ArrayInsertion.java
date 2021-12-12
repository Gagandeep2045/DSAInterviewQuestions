package geekofgeeks.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ArrayInsertion {

	public static void main(String args[]) {
		int[] arr = new int[10];
		int[] p = { 23, 45, 67, 89, 2 };
		for (int i = 0; i < p.length; i++) {
			arr[i] = p[i];
		}
		System.out.print("Before Insertion: ");
		printArray(arr);
		insert(arr, 73, 1, p.length);
		System.out.print("After Insertion: ");
		printArray(arr);

	}

	public static void insert(int arr[], int element, int pos, int size) {
		if (size == arr.length) {
			System.out.println("Not possible");
			return;
		}

		for (int i = size; i >= pos; i--) {
			arr[i + 1] = arr[i];
		}
		arr[pos] = element;

	}

	static void printArray(int[] arr) {
		ArrayList a = new ArrayList();
		Stream.iterate(0, i -> i + 1).limit(arr.length).forEach(i -> a.add(arr[i]));
		System.out.println(a);

	}

}
