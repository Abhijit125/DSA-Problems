/*
FIND MINIMUM WAItING TIME 
INPUT = [3,1,2,1,6]

OUTPUT = 14// WAITING TIME OF IDX0 is 0, IDX1 is 3(0+3), IDX2 IS 4(3+1) and so on..
*/
import java.util.*;
class MinWaitingTime 
{
	public static void main(String[] args) 
	{
		int[] input = {3,1,2,1,6};
		Arrays.sort(input);
		System.out.println(findMinWaitTime(input));
	}

	public static int findMinWaitTime(int[] input) {
		int res = 0;
		int c = 0;
		int size = input.length;
		for(int time : input) {
			res += time * (size - (++c));
		}
		return res;
	}
}
