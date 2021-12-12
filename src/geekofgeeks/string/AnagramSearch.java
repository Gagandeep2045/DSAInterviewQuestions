package geekofgeeks.string;

public class AnagramSearch {

	public static void main(String[] args) {
		String text = "geeksofgeeks";
		String pattern1 = "sokes";
		String pattern2 = "sokses";
		boolean isPattern1Anagram = isAnagram(text, pattern1);
		boolean isPattern2Anagram = isAnagram(text, pattern2);
		System.out.println(isPattern1Anagram);
		System.out.println(isPattern2Anagram);
	}

	public static boolean isAnagram(String text, String pattern) {
		char arr[] = new char[256];
		for (int i = 0; i < pattern.length(); i++) {
			char ch = pattern.charAt(i);
			arr[ch] += 1;
		}

		for (int i = 0; i < text.length(); i++) {

			char ch = text.charAt(i);
			if (arr[ch] != 0) {
				arr[ch] -= 1;
			}
		}
		boolean permutationOfPatternExistsInText = true;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				permutationOfPatternExistsInText = false;
				break;
			}
		}
		return permutationOfPatternExistsInText;
	}
}
