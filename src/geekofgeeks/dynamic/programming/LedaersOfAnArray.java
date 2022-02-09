package geekofgeeks.dynamic.programming;

import java.util.stream.Stream;

public class LedaersOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 35, 4, 12, 10, 8, 6, 7 };
		int leadersAtIndex[] = new int[arr.length];
		populateLeadersAtIndex(arr, leadersAtIndex, arr.length - 1);
		Stream.iterate(0, a -> a + 1).limit(arr.length).map(i -> leadersAtIndex[i]).distinct().map(i -> arr[i])
				.forEach(System.out::println);

	}

	private static void populateLeadersAtIndex(int[] arr, int[] leadersAtIndex, int index) {

		if (index < 0)
			return;

		if (index == arr.length - 1) {
			leadersAtIndex[index] = index;
			populateLeadersAtIndex(arr, leadersAtIndex, --index);

		} else {
			int previousLeadersIndex = leadersAtIndex[index + 1];
			int previousLeadersValue = arr[previousLeadersIndex];
			if (previousLeadersValue < arr[index]) {
				leadersAtIndex[index] = index;
			} else {
				leadersAtIndex[index] = previousLeadersIndex;
			}
			populateLeadersAtIndex(arr, leadersAtIndex, --index);

		}

	}

}
