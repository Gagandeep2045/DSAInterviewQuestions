package geekofgeeks.ds.bitmagic;

public class LogBase2Demo {

	
	public static void main(String args[])
	{
		int a= log2(8);
		System.out.println(a);
		
	}
	
	public static int log2(int n)
	{int k;
		for( k=1; n>>k!=1; k++);
		return k;
	}
	
}
