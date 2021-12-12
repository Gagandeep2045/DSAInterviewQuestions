package geekofgeeks.array;

import java.util.ArrayList;
import java.util.stream.Stream;

public class LeftRotateArrayByD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 19, 9, 23, 5, 99 };
		// leftRotateByOne(a);
		// leftRotateByD(a, 6);
		leftRotateByD_OptimalSolution(a, 8);
		printArray(a);
	}

	private static void leftRotateByD_OptimalSolution(int[] arr, int d) {

		if (d > arr.length) {
			d = d % arr.length;
		}
		reverse(arr, 0, d - 1);
		reverse(arr, d, arr.length - 1);
		reverse(arr, 0, arr.length - 1);
	}

	private static void reverse(int[] arr, int startIndex, int lastIndex) {
		while (startIndex < lastIndex) {
			int temp = arr[lastIndex];
			arr[lastIndex--] = arr[startIndex];
			arr[startIndex++] = temp;
		}

	}

	private static void leftRotateByD(int arr[], int d) {
		if (d >= arr.length) {
			d = d % arr.length;
		} // if d=arr.length , then no rotation taking place
		int temp[] = new int[d];
		for (int i = 0; i <= d - 1; i++) {
			temp[i] = arr[i];
		}
		for (int i = 0; i <= arr.length - d - 1; i++) {
			arr[i] = arr[d + i];
		}
		printArray(arr);
		for (int i = 0; i < temp.length; i++) {
			arr[arr.length - d + i] = temp[i];
		}
	}

	private static void leftRotateByOne(int[] a) {
		int startElement = a[0];
		for (int i = 0; i <= a.length - 2; i++) {
			a[i] = a[i + 1];
		}
		a[a.length - 1] = startElement;
	}

	static void printArray(int[] arr) {
		ArrayList a = new ArrayList();
		Stream.iterate(0, i -> i + 1).limit(arr.length).forEach(i -> a.add(arr[i]));
		System.out.println(a);
	}
}
