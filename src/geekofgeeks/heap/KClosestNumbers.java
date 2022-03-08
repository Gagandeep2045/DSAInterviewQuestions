package geekofgeeks.heap;

import java.util.PriorityQueue;
import java.util.stream.Stream;

public class KClosestNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int[] arr = { 10, 15, 7, 3, 4 }; int closestTo = 8; int k = 2;
		 */

		/*
		 * int[] arr = { 100, 80, 10, 5, 70 }; int closestTo = 2; int k = 3;
		 */

		int[] arr = { 20, 40, 5, 100, 150 };
		int closestTo = 100;
		int k = 3;

		int[] closestElementsMySoltion = getClosestTo(arr, closestTo, k);
		int[] closestElementsOptimalGeeksSoln = getClosestTo_GeeksForGeeks_OptimalSolution(arr, closestTo, k);
		Stream.iterate(0, i -> i + 1).limit(k).map(i -> closestElementsMySoltion[i]).forEach(System.out::println);
		System.out.println("-----------------------------------------------------------------");
		Stream.iterate(0, i -> i + 1).limit(k).map(i -> closestElementsOptimalGeeksSoln[i])
				.forEach(System.out::println);

	}

	private static int[] getClosestTo(int arr[], int closestTo, int k) {// MInHeap
		// TODO Auto-generated method stub
		// This method will have higher space complexity as now we will have a Minheap
		// of size
		// arr.length
		PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.value - b.value);
		for (int i = 0; i < arr.length; i++) {
			int value = Math.abs(arr[i] - closestTo);
			Node n = new Node(i, value);
			pq.offer(n);
		}
		int[] result = new int[k];
		for (int i = 0; i < result.length; i++) {
			int index = pq.poll().index;
			result[i] = arr[index];
		}

		return result;
	}

	private static int[] getClosestTo_GeeksForGeeks_OptimalSolution(int arr[], int closestTo, int k) { // MaxHeap
		// This method will reduce space complexity as now we will always have a MaxHeap
		// of size k at any point in time

		// TODO Auto-generated method stub
		PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> b.value - a.value);
		for (int i = 0; i < k; i++) {
			int value = Math.abs(arr[i] - closestTo);
			Node n = new Node(i, value);
			pq.offer(n);
		}
		// Above loop creates a min heap with K no of nodes

		for (int i = k; i < arr.length; i++) { // iterate over remaining index k to n-1 elements in arr
			int diff = Math.abs(arr[i] - closestTo);
			if (diff < pq.peek().value) {
				pq.poll(); // If diff is less remove top most i.e minimum element(root element) is minheap
				pq.offer(new Node(i, diff)); // and update new element with less difference
			}
		}

		int[] result = new int[k];

		for (int i = 0; i < k; i++) {
			int index = pq.poll().index;
			result[i] = arr[index];
		}

		return result;
	}

	static class Node {
		int index;
		int value;

		Node(int index, int value) {
			this.index = index;
			this.value = value;
		}
	}

}
