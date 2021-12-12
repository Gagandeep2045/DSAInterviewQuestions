package geekofgeeks.array;

public class PatternInStringCheck {

	public static void main(String args[])
	{
		String str="aabccaacd";
		String pattern="aca";
		int patternFoundIndex=-1;
		
		for(int i=0;i<=str.length()-pattern.length();i++)
		{
		 boolean patternFound=anagramSolution_NonOptimal(str.substring(i,i+pattern.length()),pattern);
		if(patternFound)
		{
			patternFoundIndex=i;
			break;
		}
		}
		System.out.println("Pattern found at index : "+patternFoundIndex);
		//--------------------------
		//Optimal Solution begins here
		patternFoundIndex=-1;
		int[] arr=populatePatternArray(pattern);
		for(int i=0;i<=str.length()-pattern.length();i++)
		{
		 boolean patternFound=anagramSolution_Optimal(str.substring(i,i+pattern.length()),arr,i);
		if(patternFound)
		{
			patternFoundIndex=i;
			break;
		}
		}
		System.out.println("Pattern found at index : "+patternFoundIndex);
		

		
	}
	
	 static boolean anagramSolution_NonOptimal(String str, String pattern)
	{
		int chars[] = new int[256];
		for(int i=0;i<=str.length()-1;i++)
		{
			chars[str.charAt(i)]+=1;
			chars[pattern.charAt(i)]-=1;
		}
		
		for(int i=0;i<=chars.length-1;i++)
		{
			if(chars[i]!=0)
				return false;
		}
		return true;
	}
	 
	 
	 
	 static int [] populatePatternArray( String pattern)
	 {
		 
	int [] arr = new int[256];	 
	for(int i=0;i<=pattern.length()-1;i++)
	{
		arr[pattern.charAt(i)]+=1;
	}
	return arr;
	 }
	 
	 static boolean anagramSolution_Optimal(String str , int[] arr,int index)
	 {//Using Rolling Hash Technique
		if (index == 0) {
			for (int i = 0; i < str.length(); i++) {
				arr[str.charAt(i)] -= 1;
			}
		} else {
			
			arr[str.charAt(str.length()-1)]-=1; //add last character of substring
		}
		 boolean isAnagram=true;
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]!=0)
				 {isAnagram=false;
				 break;
				 }
		 }
		 
		 
		 arr[str.charAt(0)]+=1;//remove first char of str for next iteration
		 
		 return isAnagram;
	 }
	
	 
	 
	 
}


