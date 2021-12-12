package geekofgeeks.sort.mergeSort;

import java.util.Arrays;

public class MergeFunction {

	public static void main(String[] args) {
		int arr[] = { 12, 18, 20, 32, 89, 5, 19, 25, 90, 99, 100 };
		mergeFunction(arr, 4, 4, 5);
		String x = Arrays.toString(arr);
		System.out.println(x);
	}

	public static void mergeFunction(int[] arr, int low, int mid, int high) {
		int[] temp = new int[high - low + 1];
		int i = low;
		int j = mid + 1;
		int k = 0;
		while (i <= mid && j <= high) {
			if (arr[i] <= arr[j]) { // = ensures stability feature of merge sort
				temp[k++] = arr[i++];
			} else {
				temp[k++] = arr[j++];
			}
		}
		while (i <= mid) {
			temp[k++] = arr[i++];
		}
		while (j <= high) {
			temp[k++] = arr[j++];
		}
		i = low;
		k = 0;
		while (k <= temp.length - 1) {
			arr[i++] = temp[k++];
		}
	}

}
//https://www.geeksforgeeks.org/merge-sort/
//https://www.youtube.com/watch?v=JSceec-wEyw