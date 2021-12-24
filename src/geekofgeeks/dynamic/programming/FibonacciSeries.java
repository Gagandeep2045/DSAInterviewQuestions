package geekofgeeks.dynamic.programming;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int positionInFibonacci=8; //indexing from 0
		int value1 = fibonacciAtPosition(positionInFibonacci);
		System.out.println(value1);
		int value2 = fibonacciAtPosition_recursive(positionInFibonacci);
		System.out.println(value2);
		Integer[] arr= new Integer[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=-1;
		}
		int value3 = fibonacciAtPosition_dynamicProgramming(positionInFibonacci,arr );
		System.out.println(value3);

	}

	private static int fibonacciAtPosition_dynamicProgramming(int n, Integer[] memo) {

		
		if (memo[n] == -1) //If it has already been calculated and stored i.e (memo[n]!=-1) x then return stored value else calculate it and store
		{
			if (n < 2) {
				memo[n] = n;
			} else {
				memo[n] = fibonacciAtPosition_dynamicProgramming(n - 1, memo)
						+ fibonacciAtPosition_dynamicProgramming(n - 2, memo);
			}
		}

		return memo[n];
		
		//Complexity is O(n)
	}

	private static int fibonacciAtPosition_recursive(int n) {

		if (n < 2) {
			return n;
		}

		return fibonacciAtPosition_recursive(n - 1) + fibonacciAtPosition_recursive(n - 2);
		
		//Complexity is 2^n as it is not storing the already calculated value lets say fibonacciAtPosition_recursive(2)
		// fibo(3)= fibo(2)+fibo(1) - here fibo(2) get evaluated but however it is not stored anywhere for future need/reference
		// Since it is not stored for future need hence while evaluating fibo(4) = fibo(3)+fibo(2) we will have to calculate fibo(2) again

	}

	private static int fibonacciAtPosition(int n) // where indexing starts from 0
	{
		// TODO Auto-generated method stub
		if (n < 2)
			return n;

		int first = 0;
		int second = 1;
		int fibonacciElementAtI = -1;
		for (int i = 2; i <= n; i++) {
			fibonacciElementAtI = first + second;
			first = second;
			second = fibonacciElementAtI;

		}

		return fibonacciElementAtI;

		// Above has complexity O(n)
	}

}

//https://practice.geeksforgeeks.org/tracks/DSASP-DP/?batchId=154&tab=1
//Dynamic Programming (Memoization)

//No of dimensions in memo array memo[] is equal to no of parameters you change  