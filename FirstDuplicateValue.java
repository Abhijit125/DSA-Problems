/*

INPUT = [2,1,5,3,3,2,4]

OUTPUT = 3// NUMBER 3 WHICH COMES FIRST DUPLICATE VALUE


*/


import java.util.*;
class FirstDuplicateValue
{
	public static void main(String[] args) 
	{
		List<Integer> ls = new ArrayList<>(Arrays.asList(2,1,5,3,3,2,4));

		findDuplicateValue(ls);
	}

	public static void findDuplicateValue(List<Integer> ls) {
		
		int max = Integer.MIN_VALUE;
		int maxKey = 0;

		Set<Integer> set = new HashSet<>();
		
		for(int data : ls) {
			if(set.contains(data)) {
				maxKey = data;
				break;
			} else {
				set.add(data);
			}
		}
		System.out.println(maxKey);
	}
}
