package geekofgeeks.heap;

import java.util.PriorityQueue;
import java.util.stream.Stream;

public class KSmallestNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 12, 99, 0, 67, 32, 199, 4 };
		int k = 4;
		int result[] = getKSmallestNumbersInArray(arr, k);
		Stream.iterate(0, i -> i + 1).limit(result.length).map(i -> result[i]).forEach(System.out::println);
	}

	private static void reverse(int[] result, int begin, int end) {
		// TODO Auto-generated method stub

		if (begin < end) {
			int temp = result[end];
			result[end] = result[begin];
			result[begin] = temp;
			reverse(result, begin + 1, end - 1);
		}
	}

	private static int[] getKSmallestNumbersInArray(int[] arr, int k) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
		for (int i = 0; i < k; i++) {
			pq.offer(arr[i]);
		}
		for (int i = k; i < arr.length; i++) {
			if (arr[i] < pq.peek()) {
				pq.poll();
				pq.offer(arr[i]);
			}
		}
		int result[] = new int[k];
		for (int i = 0; i < k; i++) {
			result[i] = pq.poll();
		}
		reverse(result, 0, result.length - 1);
		return result;
	}

}
