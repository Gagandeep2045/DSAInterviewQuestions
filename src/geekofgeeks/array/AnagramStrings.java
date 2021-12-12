package geekofgeeks.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramStrings {

	public static void main(String args[])
	{
	String x1="geaks";
	String x2="ekegs";
	boolean isAnagram=isAnagram_BetterSolution(x1,x2);
	System.out.println(isAnagram);	
	}
	
	static boolean isAnagram_mySolution(String x1,String x2)
	{
		char []xx1=x1.toCharArray();
		char []xx2=x2.toCharArray();
		Arrays.sort(xx1);
		Arrays.sort(xx2);
		return Arrays.equals(xx1, xx2);
	}
	
	static boolean isAnagram_BetterSolution(String x1,String x2)
	{
		if(x1.length()!=x2.length())
			return false;
		
		int []charOccurences = new int[256];
		
		for(int i=0;i<x1.length();i++)
		{
			charOccurences[x1.charAt(i)]+=1;
			charOccurences[x2.charAt(i)]-=1;

		}
		
		for(int i=0;i<charOccurences.length;i++)
			if(charOccurences[i]!=0)
				return false;
		return true;
	}
	
}
