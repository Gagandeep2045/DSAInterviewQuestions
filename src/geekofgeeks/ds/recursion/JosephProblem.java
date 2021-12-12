package geekofgeeks.ds.recursion;
public class JosephProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = josephProblem(6, 2);
		System.out.println(i);
	}

	// This will return at which index starting from 0 one needs to be to win the sword
	// n -> No of people in circle and k is counting from person holding
	// sword(inclusive of person holding sword) or moving distance =k-1
	private static int josephProblem(int n, int k) {
		// TODO Auto-generated method stub
		if (n == 1)
			return 0; //If only one person than that person winner at index 0 as counting from zero
		return (josephProblem(n - 1, k) + k) % n;

	}
}
