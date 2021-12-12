package morgan.stanley;

public class DuplicateCharactersInString {

	public static void main(String args[]) {
		String x = "abceaagrqed";
		int a[] = new int[256];
		for (int i = 0; i < x.length(); i++) {
			a[x.charAt(i)] += 1;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 1) {
				System.out.println((char) i);

			}
		}

	}
}
