package morgan.stanley;

public class ReverseStringWithoutAlteringOrderOfSpecialCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc%deg&$p";
		char a[]=s.toCharArray();
		for(int i=s.length()-1;i>-1;i--)
		{
			if( Character.isAlphabetic(s.charAt(i)));
		}
	}

}
