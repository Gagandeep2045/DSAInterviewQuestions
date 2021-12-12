package geekofgeeks.array;

public class LargestElementOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, 20,-1,10};
		int largestElementIndex = largestElement(arr);
		int secondLargetElementIndex = secondLargestElemet(arr);

		System.out.println("Largest: " + largestElementIndex);
		System.out.println("Second Largest: " + secondLargetElementIndex);

	}

	static int largestElement(int[] arr) {
		int maxIndex = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[maxIndex] < arr[i]) {
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	static int secondLargestElemet(int[] arr) {
		int highest = 0, sHighest = 0;
		if (arr[0] > arr[1]) {
			highest = 0;
			sHighest = 1;

		} else if (arr[0] < arr[1]) {
			highest = 1;
			sHighest = 0;
		}

		for (int i = 2; i <= arr.length - 1; i++) {
			if (arr[i] > arr[highest]) {
				sHighest = highest;
				highest = i;
			} else if (arr[i] > arr[sHighest]) {
				sHighest = i;
			} else if ((highest == sHighest) && arr[sHighest] > arr[i]) {
				sHighest = i;
			}
		}

		if (highest == sHighest)
			return -1;
		return sHighest;

	}

}
