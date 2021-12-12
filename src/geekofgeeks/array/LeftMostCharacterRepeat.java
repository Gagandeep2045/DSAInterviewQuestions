package geekofgeeks.array;

public class LeftMostCharacterRepeat {

	public static void main(String args[]) {
		String x = "sehpippe";
		int i = indexOfLeftMostRepeatedCharacter_OptimalSolution(x);
		System.out.println(i);

	}

	static int indexOfLeftMostRepeatedCharacter_mySolution(String x) {

		for (int i = 0; i < x.length(); i++) {
			for (int j = i + 1; j < x.length(); j++) {
				if (x.charAt(i) == x.charAt(j)) {
					return i;
				}
			}
		}
		return -1;
	}

	static int indexOfLeftMostRepeatedCharacter_OptimalSolution(String x) {
//Complexity -> O(n)
		//Auxilary Capacity-> O(256)
		int[] charIndex = new int[256];

		for (int i = 0; i < 256; i++) {
			charIndex[i] = -1;
		}

		for (int i = 0; i < x.length(); i++) {
			if (charIndex[x.charAt(i)] == -1) {
				charIndex[x.charAt(i)] = i;
			} else {
				return charIndex[x.charAt(i)];
			}
		}
		return -1;
	
	}
}
