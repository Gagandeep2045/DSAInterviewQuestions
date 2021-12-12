package geekofgeeks.ds.bitmagic;

public class SwapOddEvenBits {

	public static void main(String args[]) {

		int result = swapBits(78);
		System.out.println(result);
	}

	/*
	 * This is a function problem.You only need to complete the function given
	 * below
	 */
	// User function Template for Java

	// Function to swap odd and even bits
	public static int swapBits(int n) {
	    //n=78;
	    // Your code
	    int temp=n;
	    int i=0;
	    for(;(temp>>i)!=0 ;i++);
	    if((i&1)==1)
	    i=i+1;
	   // System.out.println(i);
	    for(int k=1;k<=i/2;k++)
	    {
	        int temp1=3<<(2*(k-1));
	        int andedValue=temp1 & n;
	        if( !isTrue( temp1  , andedValue))
	        n= temp1 ^ n;
	        
	    }
	    return n;
	}
	
	public static boolean isTrue(int n,int k)
	{
	    return k==n ||  k==0;
	}

}
