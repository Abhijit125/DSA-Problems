/*
FIND THE LONGEST SUBVALUE WITH HIGHTEST PEAK

INPUT = [1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3]

OUTPUT = 6//HIGHEST PEAK SUBARRAY IS [0,10,6,5,-1,-3] OF LENGTH 6

*/

import java.util.*;
class LongestPeak 
{
	public static void main(String[] args) 
	{
		int ar[] = {1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};

		findLongestPeak(ar);
	}

	public static void findLongestPeak(int []ar) {
		int i = 1;
		int longestPeak = 0;
		while(i < ar.length-1) {
			boolean isPeak = (ar[i-1] < ar[i]) && (ar[i] > ar[i + 1]);
			if(!isPeak) {
				i++;
				continue;
			}
			int leftIdx = i - 2;
			while(leftIdx >= 0 && ar[leftIdx] <= ar[leftIdx + 1]) {
				leftIdx--;
			}

			int rightIdx = i + 2;
			while(rightIdx < ar.length && ar[rightIdx - 1] > ar[rightIdx]) {
				rightIdx++;
			}

			int currentPeak = rightIdx - leftIdx - 1;

			if(currentPeak > longestPeak) {
				longestPeak = currentPeak;
			}
			i = rightIdx;
		}
		System.out.println(longestPeak);
	}
}
