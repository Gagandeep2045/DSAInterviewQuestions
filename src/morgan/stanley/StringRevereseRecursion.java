package morgan.stanley;

public class StringRevereseRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = "abcd";
		char a[] = x.toCharArray();
		//reverseString(a, 0);
		reveerseString_24_01_2022(a,0,a.length-1);
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
	
	private static void reveerseString_24_01_2022(char arr [] , int i , int j)
	{
		if(i>=j)
			return;
		char temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		reveerseString_24_01_2022(arr,i+1,j-1);
	}

}
