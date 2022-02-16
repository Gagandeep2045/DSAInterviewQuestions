package geekofgeeks.array;

import java.util.ArrayList;
import java.util.List;
///IMP -> The best solution in geeksofgeeks.array.test.MinimumFlipsInBinaryArray.java class
public class MinimumFlipsInBinaryArray {

	public static void main(String[] args) {
		 //int[] arr = { 1, 1, 0, 0, 0, 1, 1, 0, 1 };
		 int[] arr = { 0,1, 1, 0, 0, 0, 1, 1, 0, 1 };
		//int[] arr = { 0, 1, 1, 0, 0, 0, 1, 1, 0, 0 };
		// int[] arr = { 1, 1, 1, 1 };
		// int[] arr = { 0, 0, 0, 0 };

		List<Integer> list0 = mimimumFlips(arr, 0);
		List<Integer> list1 = mimimumFlips(arr, 1);
		System.out.println(list0);
		System.out.println(list1);
		int minimumFlips = (Math.min(list0.size(), list1.size())) / 2;
		System.out.println(minimumFlips);
		optimalSolution(arr);
	}

	private static void optimalSolution(int arr[]) {
		int from = -1;
		for (int i = 1; i <= arr.length - 1; i++) {
			if (arr[i] != arr[0] && arr[i - 1] == arr[0]) {
				from = i; // second group's begin index
			}
			if (arr[i] == arr[0] && arr[i - 1] != arr[0]) {
				System.out.println(from + "  :  " + (i-1));
				from = -1;
			}

		}
		if (from != -1 && arr[arr.length - 1] != arr[0]) {
			System.out.println(from + "  :  " + (arr.length - 1));
		}

	}

	private static List<Integer> mimimumFlips(int[] arr, int no) {
		int complement = no == 0 ? 1 : 0;
		int countNo = 0;
		List<Integer> list = new ArrayList<>();
		int from = -1, to = -1;
		if (arr[0] == no) {
			from = 0;
		}
		for (int j = 0; j <= arr.length - 2; j++) {

			if (arr[j] == no && arr[j + 1] == complement) {
				to = j;
				list.add(from);
				list.add(to);
				from = -1;
				to = -1;

			}
			if (arr[j] == complement && arr[j + 1] == no) {
				from = j + 1;

			}

			if (arr[j] == no) {
				countNo++;
			}
		}
		if (from != -1 && to == -1 && arr[arr.length - 1] == no) {
			to = arr.length - 1;
			list.add(from);
			list.add(to);
		}
		if (countNo == arr.length) {
			list.add(0);
			list.add(arr.length - 1);
		}
		return list;
	}

}
