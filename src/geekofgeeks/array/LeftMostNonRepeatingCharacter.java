package geekofgeeks.array;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LeftMostNonRepeatingCharacter {

	public static void main(String args[]) {
		String x = "geeksforgefeks";
		int index = leftMostNonRepeatingCharacterIndex_optimalSolution(x);
		System.out.println(index);
	}

	static int leftMostNonRepeatingCharacterIndex_mySolution(String string) {
		int chars[] = new int[256];

		// populate occurences of each character
		for (int i = 0; i < string.length(); i++) {

			chars[string.charAt(i)] += 1;

		} // O(stringLength)
		int index = -1;
		for (int i = 0; i < chars.length; i++) // O(Alphabet length)
		{
			if (chars[i] == 1) // those with one occurence only
			{
				if (index == -1) {
					index = string.indexOf((char) i); // populate in index of
														// that uni occuring
														// chaacter
				} else {
					index = Math.min(string.indexOf((char) i), index);
				}

			}

		}

		return index;
	}

	static int leftMostNonRepeatingCharacterIndex_optimalSolution(String string) {
		int[] charMap = new int[256];
//CharMap will store index of each charcter in string or 
//-1 -> not coming in string , >0(index)-> coming exctly once in string , -2-> coming more than once in string		
		for (int i = 0; i < charMap.length; i++) {
			charMap[i] = -1;
		}//O(Alphabet Size)

		for (int i = 0; i < string.length(); i++) {
			if (charMap[string.charAt(i)] == -1) {
				charMap[string.charAt(i)] = i;
			} else
				charMap[string.charAt(i)] = -2;
		} //O(String Length)
int leftMostIndex=-1;
		for(int i=0;i<charMap.length;i++) //O(Alphabet Sixe)
		{
			if(charMap[i]>0){
				if(leftMostIndex==-1)
					leftMostIndex=charMap[i];
				else
					leftMostIndex=Math.min(leftMostIndex, charMap[i]);
			}
		}
		return leftMostIndex;
	

	}
}
