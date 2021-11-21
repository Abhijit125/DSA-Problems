/*

Input  = {{1,2,3,4},
		{5,6,7,8},
		{9,10,11,12},
	  {13,14,15,16}};

OUTPUT = [1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10] //SPIRAL TRAVERSAL

*/

import java.util.*;
class SpiralTraverse 
{
	public static void main(String[] args) 
	{
		int ar[][] = {{1,2,3,4},
					 {5,6,7,8},
					{9,10,11,12},
				  {13,14,15,16}};

		List<Integer> ls = new ArrayList<>();
		
		int startRow = 0;
		int endRow = ar.length - 1;
		int startCol = 0;
		int endCol = ar[0].length - 1;
		while(startRow < endRow && startCol < endCol) {
			
		//FIRST ROW
		for(int i = startCol; i<= endCol; i++) {
			ls.add(ar[startRow][i]);
		}
		startRow++;
		
		//LAST COL
		for(int j = startRow; j <= endRow; j++) {
			ls.add(ar[j][endCol]);
		}
		endCol--;
		
		for(int i = endCol; i >= startCol; i--) {
			ls.add(ar[endRow][i]);
		}
		endRow--;

		for(int j = endRow; j >= startRow; j--) {
			ls.add(ar[j][startCol]);
		}
		startCol++;
		}

		System.out.println(ls);
	}
}
