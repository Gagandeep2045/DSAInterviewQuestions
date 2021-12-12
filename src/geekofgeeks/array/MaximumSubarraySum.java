package geekofgeeks.array;

public class MaximumSubarraySum {

	public static void main(String[] args) {
		//int a[] = { 1, 4, 6 };
		 //int a[] = { -1, -4,- 6 };
		int a[] = { 2, 3, -8, 7, -1, 2, 3 };
		//int a[] = { 5, 8, 3 };
		int maxSubarraySum = bruteForce(a);
		int maxSubarraySum_Kadane = kadaneAlgo(a);
		System.out.println(maxSubarraySum);
		System.out.println(maxSubarraySum_Kadane);
	}

	static int bruteForce(int a[]) {
		int sum = a[0];
		int subgroupSum = a[0]; // All subgroups that originate from a[i]
		for (int i = 0; i < a.length; i++) {
			subgroupSum = a[i];
			for (int j = i + 1; j <= a.length - 1; j++) {
				subgroupSum += a[j];
				sum = Math.max(sum, subgroupSum);

			}
		}
		return Math.max(sum, subgroupSum);
	}

	static int kadaneAlgo(int a[]) {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if ((a[i - 1] + a[i]) > a[i]) {
				a[i] = a[i] + a[i - 1];
			}
			max = Math.max(max, a[i]);
		}
		return max;

	}
}
