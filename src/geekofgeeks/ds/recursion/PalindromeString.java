package geekofgeeks.ds.recursion;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean s = isPalendrome("abbaba");
		System.out.println(s);
	}

	public static boolean isPalendrome(String s) {
		if (s.length() == 0 || s.length() == 1)
			return true;
		if (s.charAt(0) != s.charAt(s.length() - 1))
			return false;
		return isPalendrome(s.substring(1, s.length() - 1));

		

	}
//above is tail recursive solution of palindrome of string
}
