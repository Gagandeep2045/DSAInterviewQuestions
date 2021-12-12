package geekofgeeks.array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LeadersOfArray {

	public static void main(String[] args) {
		int arr[] = { 7, 10, 4, 3, 6, 5, 2 };
		List<Integer> leaders = leadersOfArray(arr);
		System.out.println(leaders);
	}

	private static List<Integer> leadersOfArray(int[] arr) {
		List<Integer> leaders = new ArrayList<>();
		int leader = arr[arr.length - 1];
		leaders.add(leader);// last element will always be a leader
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] > leader) {
				leader = arr[i];
				leaders.add(leader);
			}
		}
//leader will always have highest value from rhs to lhs till that element
		return leaders; // will always return leaders from right to left
	}

	static void printArray(int[] arr) {
		ArrayList a = new ArrayList();
		Stream.iterate(0, i -> i + 1).limit(arr.length).forEach(i -> a.add(arr[i]));
		System.out.println(a);
	}

}
