package geekofgeeks.array;

public class MaximumConsectutiveOnesBinaryArray {

	public static void main(String[] args) {
		//int arr[] = { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0 };
		// int arr[] = { 0,0,0};
		int arr[] = { 1, 1, 1 };
		int count = mySolution(arr);
		int count1 = optimalSolution(arr);
		int count2 = optimalSolution2(arr);
		System.out.println("count: " + count + " count1:" + count1 + "count2:" + count2);
	}

	static int mySolution(int arr[]) {
		int count = 0, start = -1;// start contains starting index of block containing only 1's
		for (int i = 0; i < arr.length; i++) {
			if (start == -1 && arr[i] == 1) {
				start = i;
			}

			if (arr[i] == 0 && start != -1) {
				count = (count < i - start ? i - start : count);
				start = -1;

			}

			if (i == arr.length - 1 && start != -1 && arr[i] == 1) {
				count = (count < i - start + 1 ? i - start + 1 : count);
			}

		}
		return count;
	}

	static int optimalSolution(int arr[]) {
		int i = 0;
		int count = 0;
		while (i < arr.length) {
			int j = 0;
			while (i < arr.length && arr[i] == 1) {
				j++;
				i++;

			}

			if (count < j) {
				count = j;
			}
			i++;

		}
		return count;
	}

	static int optimalSolution2(int arr[]) {
		int count = 0;
		int countSubstring = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] == 1) {
				countSubstring++;
			} else {
				count = Math.max(countSubstring, count);
				countSubstring = 0;
			}

		}
		return Math.max(countSubstring, count);
	}

}
