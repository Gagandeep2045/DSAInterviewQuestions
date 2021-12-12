package geekofgeeks.ds.recursion;

public class RodCuttingBruteForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxCount = rodCutting(4, 2, 6, 5);
		System.out.println(maxCount);
	}

	public static int rodCutting(int a, int b, int c, int n) {
		int maxCount = 0;

		int maxA = n / a;
		int maxB = n / b;
		int maxC = n / c;

		for (int i = 0; i <= maxA; i++)
			for (int j = 0; j <= maxB; j++)
				for (int k = 0; k <= maxC; k++) {
					if ((a * i + b * j + c * k == n) && maxCount < i + j + k) {
						maxCount = i + j + k;
					}

				}
		if (maxCount == 0)
			maxCount = -1;
		return maxCount;
	}

}
