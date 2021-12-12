package geekofgeeks.array;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { -1, 0, 2, 4, 78, 89 }; // assuming array is in ascending order
		int index = binarySearch(arr, 0);
		System.out.println(index);
	}

	static int binarySearch(int arr[], int se) {
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] > se) {
				high = mid - 1;
			} else if (arr[mid] < se) {
				low = mid + 1;
			} else
				return mid;

		}

		return -1;

	}

}
