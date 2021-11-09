/*
FIND SORTED ARRAY FROM THE GIVEN ARRAY BY SQUARIG IT

INPUT = [-2,-1,3,8]

OUTPUT = [1, 4, 9, 64]

*/
import java.util.*;
class SortedArray 
{
	public static void main(String[] args) 
	{
		int[] ar = {-2, -1, 3, 8};

		findSqure(ar);
	}

	public static void findSqure(int[] ar) {
		
		int[] result = new int[ar.length];
		
		int i = 0;
		int j = ar.length - 1;
		int k = j;

		while(i <= j) {
			int start = ar[i] * ar[i];
			int end = ar[j] * ar[j];
			if (start < end)
			{
				result[k--] = end;
				j--;
			} else {
				result[k--] = start;
				i++;
			}
		}
		System.out.println(Arrays.toString(result));
	}
}

/* TIME COMPLEXITY IS o(n) and SPACE COMPLEXITY IS O(n)