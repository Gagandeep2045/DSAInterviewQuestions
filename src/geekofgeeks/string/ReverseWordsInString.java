package geekofgeeks.string;

import java.util.ArrayList;
import java.util.List;

public class ReverseWordsInString {

	public static void main(String args[]) {
		String s = "gagan is gr8";
		String output1 = reverseWordsInString(s);
		System.out.println(output1);
		String output2 = reverseWordsInStringOptimalApproach(s);
		System.out.println(output2);
	}

	public static String reverseWordsInString(String s) {
		List<String> list = new ArrayList<>();
		for (int i = 0, start = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == ' ' || i == s.length() - 1) {
				if (i == s.length() - 1) {
					i++;
				}
				char chars[] = new char[i - start];
				for (int j = 0; j < chars.length; j++) {
					chars[j] = s.charAt(j + start);
				}
				String substring = new String(chars);
				list.add(substring);
				start = i + 1;
			}
		}
		StringBuffer finalString = new StringBuffer();
		for (int i = list.size() - 1; i >= 0; i--) {
			finalString.append(list.get(i)).append(" ");
		}
		return finalString.toString();
	}

	// Here we are using below approach
	// gagan is gr8
	// Step 1 -> reverse words --> nagag si 8rg
	// Step 2 -> reverse whole string-> gr8 is gagan
	public static String reverseWordsInStringOptimalApproach(String s) {
		char[] array = s.toCharArray();
		for (int i = 0, start = 0; i < array.length; i++) {
			char ch = array[i];
			if (ch == ' ' || (i == array.length - 1)) {
				if (i == array.length - 1) { // to reverse last word
					i++;
				}
				reverseCharArray(array, start, i - 1);
				start = i + 1;
			}
		}
		reverseCharArray(array, 0, array.length - 1);
		return new String(array);
	}

	public static void reverseCharArray(char[] array, int startIndex, int endIndex) {

		if (startIndex < endIndex) {
			char temp = array[startIndex];
			array[startIndex] = array[endIndex];
			array[endIndex] = temp;
			reverseCharArray(array, startIndex + 1, endIndex - 1);
		}
	}
}
