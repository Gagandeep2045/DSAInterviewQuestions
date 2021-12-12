package geekofgeeks.array;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class RollingHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rollingHash_MySolution("bacdaabaa", "aab");
		rollingHash_InstructorSolution("bacdaabaa", "aab");
	}

	// p-> length of pattern string , s -> length od main string
	public static void rollingHash_MySolution(String mainString, String pattern) {
		long startTime = System.nanoTime();
		boolean patternFound = false;
		int patternHash = 0;
		for (int i = 0; i < pattern.length(); i++)
			patternHash += pattern.charAt(i) - 'a' + 1;
		System.out.println(patternHash); // theta(p)

		for (int i = 0; i <= mainString.length() - pattern.length(); i++)//theta(s-p+1)
		{ 
			int stringHash = 0;
			for (int j = i; j < i + pattern.length(); j++) // theta(p)
			{
				stringHash += mainString.charAt(j) - 'a' + 1;
			}

			if (patternHash == stringHash) {
				System.out.println(mainString.substring(i, i + pattern.length()));
				patternFound = true;
			}
		}

		if (!patternFound)
			System.out.println(-1);
		long endTime = System.nanoTime();
		long diff = endTime - startTime;
		System.out.println(diff);
//total-> theta(p)+ theta(p)*theta(s-p+1) => theta(sp)
	}

	public static void rollingHash_InstructorSolution(String mainString, String pattern) {
		long startTime = System.nanoTime();

		if (pattern.length() > mainString.length()) {
			System.out.println(-1);
			return;
		}

		boolean found = false;
		int hashPattern = 0;
		int hashMainString = 0;
		int startIndex = 0;
		for (int i = startIndex; i <= pattern.length() - 1; i++) {
			hashPattern += pattern.charAt(i) - 'a' + 1;
			hashMainString += mainString.charAt(i) - 'a' + 1; // theta p
		}
		int windowIndex = startIndex;
		do {
			if (hashPattern == hashMainString) {
				System.out.println(startIndex + " " + mainString.substring(startIndex, startIndex + pattern.length()));
				found = true;

			}
			startIndex += 1;
			if (startIndex == mainString.length() - pattern.length() + 1)
				break;
			hashMainString = hashMainString - (mainString.charAt(startIndex - 1) - 'a' + 1)
					+ (mainString.charAt(startIndex + pattern.length() - 1) - 'a' + 1);

		} while (true); // theta(s-p+1) monitored by startIndex of window

		if (!found) {
			System.out.println(-1);
		}
		long endTime = System.nanoTime();
		long diff = endTime - startTime;
		System.out.println(diff);
		//So total theta(s-p+1+p) = theta(s)
	}

}
