package geekofgeeks.string;

import java.util.stream.Stream;

public class LeftMostRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int index = leftMostRepeatingCharacterIndex1("bcdccdddd");
		//int index = leftMostRepeatingCharacterIndex_BetterSoln("abccb");
		 int index = leftMostRepeatingCharacterIndex_BetterSoln("abcd");

		System.out.println(index);
	}

//Complexity-> O(2n) = O(n) where n is length of string
	// Space Complexity-> O(No of Characters)
	static int leftMostRepeatingCharacterIndex(String s) {
		int count[] = new int[256];
		for (char c : s.toCharArray()) {
			count[c] += 1;
		}
		int i = 0;
		for (; i < s.length(); i++) {
			if (count[s.charAt(i)] > 1) {
				break;
			}
		}
		if (i == s.length())
			i = -1;
		return i;
	}

	// TimeComplexity-> O(n+charLength) where n is length of string and charLength
	// is no of characters
	// Space Complexity-> O(charLength) where charLength is no of characters
	static int leftMostRepeatingCharacterIndex_BetterSoln(String s) {// Written Manual Notes (Pg 1,2,3)
		int fisrtOccurenceOfEveryCharacterFromLeft[] = new int[256];
		Stream.iterate(0, i -> i + 1).limit(fisrtOccurenceOfEveryCharacterFromLeft.length)
				.forEach(i -> fisrtOccurenceOfEveryCharacterFromLeft[i] = -1);
		int leftMostRepeatingCharacterIndex = Integer.MAX_VALUE;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (fisrtOccurenceOfEveryCharacterFromLeft[c] == -1) {
				fisrtOccurenceOfEveryCharacterFromLeft[c] = i;
			} else {
				leftMostRepeatingCharacterIndex = Math.min(leftMostRepeatingCharacterIndex,
						fisrtOccurenceOfEveryCharacterFromLeft[c]);

			}
		}
		return leftMostRepeatingCharacterIndex == Integer.MAX_VALUE ? -1 : leftMostRepeatingCharacterIndex;
	}

}
