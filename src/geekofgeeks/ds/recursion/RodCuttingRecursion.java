package geekofgeeks.ds.recursion;

public class RodCuttingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = rodCutting(5, 5, 1, 2, 0);
		//cutsCount=0 as cutsCount is 1 minus no of invocations of rodCutting()
		System.out.println(a);
	}

	static int rodCutting(int length, int a, int b, int c, int cutsCount) {
		if (length < 0)
			return -1;
		if (length == 0)
			return 0; //Instructor Solution
		//return cutsCount; //My solution 

		int returnA = rodCutting(length - a, a, b, c, cutsCount + 1);
		int returnB = rodCutting(length - b, a, b, c, cutsCount + 1);
		int returnC = rodCutting(length - c, a, b, c, cutsCount + 1);

		//if (returnA == -1 && returnB == -1 && returnC == -1)
			//return -1;

		int maxReturnValue = Math.max(returnC, Math.max(returnA, returnB));
		return 1+maxReturnValue; //Instructor solution
		//return maxReturnValue; //My solution

	}
}
