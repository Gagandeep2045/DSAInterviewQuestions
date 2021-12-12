package geekofgeeks.string;

public class AnagramString {

	public static void main(String args[]) {
		boolean isAnagram = isAnagram("aaabbcd", "dbabcaa"); // Anagram means string is permutaion or not
		System.out.println("Is Anagram: " + isAnagram);
	}

	public static boolean isAnagram(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		int charCount[] = new int[256];
		for (int i = 0; i < s1.length(); i++) {
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);
			charCount[c1] += 1;
			charCount[c2] -= 1;

		}
		boolean isAnagram = true;
		for (int i = 0; i < charCount.length; i++) {
			if (charCount[i] != 0) {
				isAnagram = false;
				break;
			}
		}
		return isAnagram;
	}
}
