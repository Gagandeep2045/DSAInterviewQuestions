package geekofgeeks.sort.mergeSort;

import java.util.Arrays;

public class MergeSortAlgo {

	public static void main(String[] args) {
		int arr[] = { 18, 99, 5, 12, 89, 90, 20, 19, 32, 100, 25 };
		mergeSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));

	}

	private static void mergeSort(int[] arr, int left, int right) {
		if (left < right) // should have altleast 2 elements
		{
			int middle = (left + right) / 2;
			mergeSort(arr, left, middle);
			mergeSort(arr, middle + 1, right);
			//By this time elements from index left to middle & middle+1 to right will be sorted in arr
			MergeFunction.mergeFunction(arr, left, middle, right);
		}

	}
}