/*
WRITE A FUNCTION WHICH WILL FIND THE OUTPUT ARRAY TAKE INPUT ARRAY AND TARGET SUM

INPUT = [3,5,-4,8,11,1,-1,6]
TARGET = 10
OUTPUT = [11, -1] //SUM OF 2 NUMBER IS EQUAL TO 10

*/
import java.util.*;
class TwoNumSum
{
	public static void main(String[] args) 
	{
		int[] input = {3,5,-4,8,11,1,-1,6};
		int target = 10;

		int[] res = findArray(input, target);

		System.out.println(Arrays.toString(res));
		
	}

	public static int[] findArray(int[] ar, int target) {
		Set<Integer> dataSet = new HashSet<>();
		int[] res = new int[2];
		for(int a : ar) {
			if(dataSet.contains(a)) {
				res[0] = target - a;
				res[1] = a;
				break;
			} else {
				dataSet.add(target - a);
			}
		}
		return res;
	}
}
