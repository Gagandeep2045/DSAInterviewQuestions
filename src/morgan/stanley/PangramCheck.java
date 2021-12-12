package morgan.stanley;

public class PangramCheck {

	public static void main(String args[]) {
		//String x1 = "The quick brown fox jumps over the lazy dog";
		String x1="The quick brown fox jumps over the dog";
		char a = 'a';
		char A = 'A';
		char z = 'z';
		char Z = 'Z';
		System.out.println((int) a);
		System.out.println((int) z);
		System.out.println((int) A);
		System.out.println((int) Z);
		int count[] = new int[256];
		for (int i = 0; i < x1.length(); i++) {
			count[Character.toLowerCase(x1.charAt(i))] += 1;
		}

		boolean isPangram=true;
		for (int i = 'a'; i <= 'z'; i++) {
			if (count[i] == 0) {
				isPangram = false;
			}
		}
		System.out.println(isPangram);
	}
}
