/*

Input1 = "Hii Abhijit Here!"
Input2 = "iiHAbhijit  !Here"

Output = true // BOTH THE STRING IS EQUAL NUMBER OF COUNT

*/
import java.util.*;
class GenerateDocument
{
	public static void main(String[] args) 
	{
		String input1 = "Hii Abhijit Here!";
		String input2 = "iiHAbhijit  !Here";
		System.out.println(generateDocument(input1, input2));
	}

	public static boolean generateDocument(String characters, String document) {
    Map<Character,Integer> resultMap = new HashMap<>();
		for(int i = 0; i< characters.length(); i++) {
			char ch = characters.charAt(i);
			resultMap.put(ch, resultMap.getOrDefault(ch, 0)+1);
		}
		for(int i = 0; i< document.length(); i++) {
			char ch = document.charAt(i);
			System.out.println(ch);
			if(!resultMap.containsKey(ch) || resultMap.get(ch) == 0) {
				return false;
			}
			resultMap.put(ch, resultMap.get(ch)-1);
		}
		return true;
  }
}
