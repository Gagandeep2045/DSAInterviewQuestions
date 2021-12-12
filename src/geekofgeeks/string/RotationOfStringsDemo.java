package geekofgeeks.string;

public class RotationOfStringsDemo {

	public static void main(String[] args) {
		String s1 = "abcaa";
		String s2 = "caaab";
		s2 = "aaabc";
		boolean isRotation = isRotation(s1, s2);
		System.out.println(isRotation);
	}

	private static boolean isRotation(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		String s = s1 + s1;
		return s.contains(s2);
		// return contains(s, s2);
	}

	private static boolean contains(String parent, String testString) {

		boolean contains = false;
		for (int i = 0; i + testString.length() < parent.length(); i++) {
			if (parent.substring(i, i + testString.length()).equals(testString)) {
				contains = true;
				break;
			}
		}

		return contains;
	}

}
