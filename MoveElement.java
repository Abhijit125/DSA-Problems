/*

Input = [2,1,3,4,2,2,2,7]
target = 2

Output = [7,1,3,4,2,2,2,2]// WHEN TARGET NUMBER FOUND MAKE THE POSITION AT END
*/

import java.util.*;
class MoveElement 
{
	public static void main(String[] args) 
	{
		List<Integer> ar = new ArrayList<>(Arrays.asList(2,1,3,4,2,2,2,7));
		int target = 2;
		System.out.println(moveElementToEnd(ar, target));
	}
	
	public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
		int i = 0;
		int j = array.size() - 1;
		while (i < j) {
			while(i < j && array.get(j) == toMove) j--;
			if(array.get(i) == toMove) swap(i , j, array);
			i++;
		}
    return array;
  }
	public static void swap(int i, int j, List<Integer> array) {
		int temp = array.get(j);
		array.set(j, array.get(i));
		array.set(i, temp);
	}
}
