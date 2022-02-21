package geekofgeeks.dynamic.programming;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "AXYQY";
		String s2 = "BXQA";
		char[] a1 = s1.toCharArray();
		char[] a2 = s2.toCharArray();
		int auxillaryArray[][] = new int[a1.length][a2.length];
		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a2.length; j++) {
				auxillaryArray[i][j] = -1;
			}
		}
		// new int [no of rows][no of columns]
		int longestCommonSubsequenceLength = longestCommonSubsequence(a1, a2, a1.length - 1, a2.length - 1,
				auxillaryArray);
		System.out.println(longestCommonSubsequenceLength);
		/*//Verify values in memoization array*/
		  for (int i = 0; i < a1.length; i++) { for (int j = 0; j < a2.length; j++) {
		 System.out.println("i " + i + " j " + j + " a[i][j] " +
		  auxillaryArray[i][j]); } }
		 

	}

	private static int longestCommonSubsequence(char[] a1, char[] a2, int i, int j, int[][] auxillaryArray) {
		// TODO Auto-generated method stub

		if (i < 0 || j < 0)
			return 0;

		if (auxillaryArray[i][j] != -1) {
			return auxillaryArray[i][j]; // If you have already computed this value, dont compute it again
		}

		int length = -1;
		if (a1[i] == a2[j]) {
			length = 1 + longestCommonSubsequence(a1, a2, i - 1, j - 1, auxillaryArray);
		} else {
			int longestCommonSubsequenceLength1 = longestCommonSubsequence(a1, a2, i, j - 1, auxillaryArray);
			int longestCommonSubsequenceLength2 = longestCommonSubsequence(a1, a2, i - 1, j, auxillaryArray);			
			length = Math.max(longestCommonSubsequenceLength1, longestCommonSubsequenceLength2);
		}

		auxillaryArray[i][j] = length;

		return length;
	}

}

//Solution -> Refer Page 18 of register
//Time Complexity - > O(length of string a * length of string b)
//i.e time required to fill 2 d array m*n
