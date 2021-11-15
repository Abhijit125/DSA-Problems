/*

Input = red = [5,8,1,3,4], blue = [6,9,2,4,5]

Output = true // WE CAN ARRANGE THE INPUTS SUCH THAT THE BACK ARRAY IS GREATER SIZE TO START ARRAY

EXPLAINATION

			[5, 8, 1, 3, 4]
			 ^  ^  ^  ^  ^   {EACH AND EVERY ELEMENT OF 1ST ARRAY IS GREATER THAN 2ND ARRAY}
			[6, 9, 2, 4, 5]

*/

import java.util.*;
class HeightOfClass 
{
	public static void main(String[] args) 
	{
		int[] red = {5,8,1,3,4};
		int[] blue = {6,9,2,4,5};
		Arrays.sort(red);
		Arrays.sort(blue);
		boolean isPosible = (red[0] < blue[0]) ? isValidHeight(red, blue) : isValidHeight(blue, red);
		System.out.println(isPosible);
	}

	public static boolean isValidHeight(int[] ar1, int[] ar2) {
		
		for(int i = 0; i< ar1.length; i++) {
			if(ar1[i] > ar2[i]) {
				return false;
			}
		}
		return true;
	}
}
