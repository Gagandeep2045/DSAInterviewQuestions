package geekofgeeks.array;
/*package whatever //do not write package name here */

import java.util.*;
import java.util.stream.Collectors;
import java.lang.*;
import java.io.*;
import java.util.*;

class GFG {
	public static void main(String[] args) {
		// code
		Scanner scanner = new Scanner(System.in);
		int noOfTestCases = Integer.parseInt(scanner.nextLine());
		System.out.println(noOfTestCases);
		for (int i = 1; i <= noOfTestCases; i++) {

			int noOfElementsInArray= Integer.parseInt(scanner.nextLine());
			//String j=scanner.nextLine();
			//System.out.println(j);
			String[] elementsString= scanner.nextLine().split(" ");
			List<Integer> elementList=Arrays.stream(elementsString).map(a->Integer.parseInt(a)).collect(Collectors.<Integer>toList());
			int sum=1;
			for(Integer no:elementList)
			{
				sum*=no;
			}
			final int k=sum;
			elementList.stream().map(a->k/a).collect(Collectors.toList()).forEach(a->
			{System.out.print(a+" ");}
					);
			System.out.println();
		}
	}
}