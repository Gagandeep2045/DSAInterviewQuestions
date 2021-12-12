package geekofgeeks.array;

public class MaxEvenOddArrayLength {

	public static void main(String[] args) {
		 int arr[] = { 12, 1, 5, 4, 7, 22, 11, 32 };
		//int arr[] = { 5, 10, 20, 6, 3, 8 };

		int length = maxEvenOddArrayLength(arr);
		int length1 = maxEvenOddKardenAlgo(arr);
		System.out.println(length);
		System.out.println(length1);

	}

	private static int maxEvenOddArrayLength(int[] arr) {
		int sublength = 1, length = 1;

		for (int i = 0; i <= arr.length - 2; i++) {
			if ((isOdd(arr[i]) && isEven(arr[i + 1])) || (isEven(arr[i]) && isOdd(arr[i + 1]))) {
				sublength++;
			} else if ((isOdd(arr[i]) && isOdd(arr[i + 1])) || (isEven(arr[i]) && isEven(arr[i + 1]))) {
				length = Math.max(length, sublength);
				sublength = 1;
			}
		}
		return Math.max(length, sublength);
	}

	static boolean isOdd(int a) {
		return (a % 2) != 0;
	}

	static boolean isEven(int a) {
		return !isOdd(a);
	}

	static int maxEvenOddKardenAlgo(int arr[]) {
		int res = 1;
		int curr = 1;

		for (int i = 1; i < arr.length; i++) {
			if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) || (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0)) {
				curr++;

				res = Math.max(res, curr);
			} else
				curr = 1;
		}

		return res;
	}

}
