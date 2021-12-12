package morgan.stanley;

public class StringRevereseRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = "a";
		char a[] = x.toCharArray();
		reverseString(a, 0);
		System.out.println(new String(a));
	}

	private static void reverseString(char[] a, int i) {
		int r=a.length%2;
		if((r==0 && i==a.length/2) ||(r==1&&i==a.length/2))
			return;
		char c=a[i];
		a[i]=a[a.length-i-1];
		a[a.length-i-1]=c;
		reverseString(a,++i);
	}

}
