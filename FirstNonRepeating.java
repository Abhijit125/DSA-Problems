/*

FIRST NON REPEATING CHARACTERS

INPUT = "hii abhijit here"

OUTPUT = a // FIRST NON REPEATING CHARACTER

*/

import java.util.*;
class FirstNonRepeating 
{
	public static void main(String[] args) 
	{
		String name = "hii Abhijit here";
		name = name.toLowerCase();
		name = name.replace(" ","");
		System.out.println(findNonRepeatig(name));
		
	}

	public static char findNonRepeatig(String name) {
		int ar[] = new int[26];
		char res = ' ';
		for(int i = 0; i< name.length(); i++) {
			char ch = name.charAt(i);
			int idx = ch - 97;
			ar[idx] = ar[idx] + 1;
		}
		for(int i = 0; i< name.length(); i++) {
			char ch = name.charAt(i);
			int idx = ch - 97;
			if(ar[idx] == 1) {
				res = (char)(idx+97);
				break;
			}
		}
		return res;
	}

}
