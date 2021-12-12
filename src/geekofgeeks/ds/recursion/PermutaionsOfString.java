package geekofgeeks.ds.recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutaionsOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		printPermutations("abc", "", list);
		list.sort((a,b)->a.compareTo(b));
		System.out.println(list);

	}

	private static void printPermutations(String mainString, String currentString,List<String> list) {

		if (mainString.length() == currentString.length()) {
			System.out.println(currentString);
			list.add(currentString);
			
		}

		for (int i = 0; i < mainString.length(); i++) {

			if (currentString.indexOf(mainString.charAt(i)) == -1)
				printPermutations(mainString, currentString + mainString.charAt(i),list);

		}

	}

}
