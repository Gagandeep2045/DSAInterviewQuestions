package geekofgeeks.array;

import java.util.Arrays;

public class InsertionIntoArray {

	
	static int a[]=new int[10]; 	
	
	public static void main(String args[])
	{
		a[0]=12;
		a[1]=-1;
		a[2]=34;
		a[3]=45;
		a[4]=48;
		insertIntoArray(11, 5,  a.length, a,3);
		for(int i=0;i<=a.length-1;i++)
			System.out.println(a[i]);
	}
	
	static void insertIntoArray(int element, int capacity, int length, int a[],int position)
	{
		
		for(int i=capacity; i>=position;i--)
		{
			a[i]=a[i-1];
		}
		a[position-1]=element;
	}
}
