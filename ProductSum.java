/*
FIND THE PRODUCT AND SUM OF GIVEN INPUT

INPUT = [5,2,[7, -1]]

OUTPUT = 19 // 5 + 2 + 2*(7 - 1)

*/

import java.util.*;
class ProductSum 
{
	public static void main(String[] args) 
	{
		List<Object> input = new ArrayList<>();
		input.add(5);
		input.add(2);
		input.add(new ArrayList<>(Arrays.asList(7,-1)));

		System.out.println(findProductSum(input, 1));
		
	}
	public static int findProductSum(List<Object> input, int c) {
		
		int sum = 0;
		for(Object data : input) {
			if(data instanceof ArrayList) {
				ArrayList<Object> list = (ArrayList<Object>)(data); 
				sum += findProductSum(list, c+1);
			} else {
				sum += (int)data;
			}
		}
		return sum*c;
	}
}
