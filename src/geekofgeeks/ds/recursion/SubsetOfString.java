package geekofgeeks.ds.recursion;

public class SubsetOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		subset("ABC", "", 0);

	}

	public static void subset(String main, String s, int index) {
		if (index == main.length())
		{System.out.println(s);
		//String with = s + main.charAt(index);
			return;
		}
		//System.out.println(s);
		String with = s + main.charAt(index);
		//System.out.println(with);
		subset(main, s, index + 1);
		subset(main, with, index + 1);

	}

}
