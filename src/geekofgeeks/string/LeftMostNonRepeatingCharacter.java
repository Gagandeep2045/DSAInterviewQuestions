package geekofgeeks.string;

public class LeftMostNonRepeatingCharacter {

	public static void main(String[] args) {
		String s1 = "abcba";
		int i = leftMostNonRepeatingCharacter(s1);
		System.out.println(i);
	}

	public static int leftMostNonRepeatingCharacter(String s) {
		
		int firstOccurences[] = new int[256];

		for (int i = 0; i < firstOccurences.length; i++) {
			firstOccurences[i] = -1;
		}

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (firstOccurences[ch] == -1) {
				firstOccurences[ch] = i; //captures first occurence index
			}
			else {
				firstOccurences[ch]=-2; //marks second and subsequence occurences with index state -2
			}
		}
		int minimumIndex = Integer.MAX_VALUE;
		for (int i = 0; i < firstOccurences.length; i++) {
			if (firstOccurences[i] >= 0) { //filters only those charcters with exactly one occurence as those with
										//mutiple occurences have index state value as -2
				minimumIndex = Math.min(minimumIndex, firstOccurences[i]);
			}

		}

		return minimumIndex == Integer.MAX_VALUE ? -1 : minimumIndex;
	}

}
