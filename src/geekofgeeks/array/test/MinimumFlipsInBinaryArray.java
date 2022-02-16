package geekofgeeks.array.test;

public class MinimumFlipsInBinaryArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr []= {1,1,1,0,0,0,1,0};
		int minimumFlips = getMinimumFlips(arr);
		System.out.println(minimumFlips);
	}

	private static int getMinimumFlips(int[] arr) {

		int firstElementGroupValue = arr[0];
		int secondElementGroupValue = (arr[0]==0?1:0);
		int count = 0;
		for(int i=1 ; i<arr.length;i++)
		{
			if(arr[i-1]==firstElementGroupValue && arr[i]==secondElementGroupValue)
			{
				count++;
			}
		}
		
		return count;
	}

}

/*  Case 1 First Value Group Value == Last Index Value
 * eg a)1110001110100011  --> 111 , 000 , 111 , 0 , 1 , 000 , 11 
 * No of second value(i.e 0) groups = 3
 * No of first value (i.e 1 ) groups = 4
 * First Value Group = 1
 * Second Value Group =0
 * In This case min no of flips = no of second value groups = no of first value groups -1 = 3 
 * Or equivalently --> no of first value groups -1 i.e no of 1's groups -1
 *  i.e 4-1 =3
 * 
 * eg b) 000111001100 -> 000 , 111 , 00 , 11, 00 
 * No of first value (i.e 0) groups = 3 
 *  No of second value (i.e 1) groups = 2
 * First VAlue Group = 0
 *Second Value Group =1 
 * In this case min no of flips = no of second value groups = no of first value groups -1 = 2
 * 
 * Case 2 First Value Group Value ! = Last Index Value

 *eg a)110000110 -> 11 , 0000 , 11 , 0
 *No of first value groups = 2
 *No of second value groups = 2
 *First value group = 1
 *Second value group =0
 *In this case min no of flips = no of second value groups = no of first value groups = 2
*
 *===================================================================
 *We can generalize min no of flips will always be equal to no of second level groups --- MMMMIMP
 *
 */



