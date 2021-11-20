/*
FIND THE MIN DIFFERENCE FROM TWO ARRAY
INPUT1 = [-1, 5, 10, 20, 28, 3]
INPUT2 = [26, 134, 135, 15, 17]

OUTPUT = [28,26] // FIRST ARRAY OF 28 AND 2nd ARRAY Of 26 have the min value by substration

*/

import java.util.*;
class SmallDif 
{
	public static void main(String[] args) 
	{
		int[] ar1 = {-1, 5, 10, 20, 28, 3};
		int[] ar2 = {26, 134, 135, 15, 17};

		findSmallDif(ar1, ar2);
	}

	public static void findSmallDif(int[] ar1, int[] ar2) {
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		int diff = Integer.MAX_VALUE;
		int start1 = 0;
		int start2 = 0;	
		int res[] = new int[2];
		while(start1 < ar1.length && start2 < ar2.length) {
			int minDiff = Math.abs(ar1[start1] - ar2[start2]);
			if(ar1[start1] < ar2[start2]) {
				if(diff > minDiff) {
					diff = minDiff;
					res = new int[] {ar1[start1], ar2[start2]};
				}
				start1++;
			} else if(ar1[start1] > ar2[start2]) {
				if(diff > minDiff) {
					diff = minDiff;
					res = new int[] {ar1[start1], ar2[start2]};
				}
				start2++;
			} else {
				res = new int[] {ar1[start1], ar2[start2]};
			}
		}
		System.out.println(Arrays.toString(res));
	}
}
