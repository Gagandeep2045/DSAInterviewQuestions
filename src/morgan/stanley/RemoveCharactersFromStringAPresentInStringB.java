package morgan.stanley;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveCharactersFromStringAPresentInStringB {

	public static void main(String args[]) {
		String a = "GaganShaym";
		String b = "RamanIsGr8";
		mySolution(a, b);
		optimalSolution(a, b);

	}

	private static void optimalSolution(String a, String b) {
	
		int [] countOfB=new int[256];
		for(int i=0;i<b.length();i++)
		{
			countOfB[b.charAt(i)]+=1;
		}
		
		char finalStringA[]=new char[a.length()];
		int noOfCharsInFinalString=0;
		for(int i=0;i<a.length();i++)
		{
			if(countOfB[a.charAt(i)]==0)
			{
				finalStringA[noOfCharsInFinalString]=a.charAt(i);
				noOfCharsInFinalString++;
			}		
		}
		
		a=new String(Arrays.copyOf(finalStringA,noOfCharsInFinalString ));
		System.out.println(a); // O(a.length()+b.length())
		
	}

	public static void mySolution(String a, String b) {

		char[] a_array = a.toCharArray(); // array representaion of string a
		int[] a1 = new int[256];
		int[] b1 = new int[256];
		for (int i = 0; i < a.length(); i++) {
			a1[a.charAt(i)] += 1;
		}

		for (int i = 0; i < b.length(); i++) {
			b1[b.charAt(i)] += 1;
		}

		List<Character> commonCharacters = new ArrayList<>(Math.min(a.length(), b.length())); // common
		// characters
		// b/w
		// a
		// and
		// b
		for (int i = 0; i < a1.length; i++) {
			if (a1[i] != 0 && b1[i] != 0) {
				commonCharacters.add((char) i);

			}
		}

		StringBuilder s = new StringBuilder();
		for (int i = 0; i < a_array.length; i++) {
			if (commonCharacters.contains(a_array[i]))
				continue;
			s.append(a_array[i]);
		}
		String removedCommonCharactersFromA = s.toString();
		System.out.println(removedCommonCharactersFromA);
	}
}
