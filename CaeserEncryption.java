/*

FIND THE ENCRYPTION FROM GIVEN INPUT USING KEY

INPUT = "abc"
key = 2

OUTPUT = "cde"

*/

class CaeserEncryption 
{
	public static void main(String[] args) 
	{
		String result = caesarCypherEncryptor("abz", 2);
		
		System.out.println(result);
	}

	public static String caesarCypherEncryptor(String str, int key) {
		int noStep = key % 26;
		String result = "";
		for(int i = 0; i< str.length(); i++) {
			int finalVal = (str.charAt(i)-97+noStep) %26;
			result = result + (char)(97+finalVal);
		}
    return result;
  }
}
