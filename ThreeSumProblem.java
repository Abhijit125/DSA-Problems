/*

Input = [12,3,1,2,-6,5,-8,6]
target = 0

Output = [[-8, 2, 6],[-8,3,5],[-6,1,5]] //SUM OF ALL COMBINATION IS 0

*/
import java.util.*;
class ThreeSumProblem 
{
	public static void main(String[] args) 
	{
		int ar[] = {12,3,1,2,-6,5,-8,6};
		int target = 0;
		
		List<Integer[]> ls = threeNumberSum(ar, target);
		
		ls.forEach(i -> System.out.println(Arrays.toString(i))); 
		
	}

	public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
    Arrays.sort(array);
		List<Integer[]> result = new ArrayList<>();
		for(int i = 0; i < array.length; i++) {
			int startIdx = i+1;
			int endIdx = array.length-1; 
			while(startIdx < endIdx) {
				if(array[i]+array[startIdx]+array[endIdx] == targetSum) {
					result.add(new Integer[]{array[i],array[startIdx], array[endIdx]});
					startIdx++;
					endIdx--;
				} else if(array[i]+array[startIdx]+array[endIdx] > targetSum) {
					endIdx--;
				} else {
					startIdx++;
				}
			}
		}
    return result;
  }
}
