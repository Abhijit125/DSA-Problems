/*
input = {{1,2},{3,5},{4,7},{6,8},{9,10}}

Output = {{1,2},{3,8},{9,10}}//INTERVAL FROM 5 TO 7 COVERED IN {3, 8} AND SO ON
*/

import java.util.*;
class MergeOverlappingIntervals 
{
	public static void main(String[] args) 
	{
		int ar[][] = {{1,2},{3,5},{4,7},{6,8},{9,10}};

		for(int[] data : findMergeOverLapping(ar)) {
			System.out.println(Arrays.toString(data));
		}
	}
	
	public static int[][] findMergeOverLapping(int[][] intervals) {
		Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
		int[] temp = intervals[0];
		List<int[]> result = new ArrayList<>();
		result.add(temp);
		for(int[] data : intervals) {
			int currentEnd = temp[1];
			int nextStart = data[0];
			int nextEnd = data[1];
			
			if(currentEnd >= nextStart) {
				temp[1] = Math.max(currentEnd, nextEnd);
			} else {
				temp = data;
				result.add(temp);
			}
		}
		return result.toArray(new int[result.size()][]);
		}
}
