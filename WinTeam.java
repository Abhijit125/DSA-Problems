/*

input1 = {{"C#", "Python"},
			{"Java", "Python"},
			{"C#","Java"}}
input2 = {0,0,1} // 0 MEANS HOME TEAM WON(C# WON), 1 OTHER TEAM WON(PYTHON WON)

Output = java // JAVA WON CAUSE JAVA GOT 2 POINTS

*/

import java.util.*;
class WinTeam 
{
	public static void main(String[] args) 
	{
		String[][] ar = {{"C#", "Python"},
			{"Java", "Python"},
			{"C#","Java"}};
		int[] input = {0,0,1};

		findWinTeam(ar, input);
	}

	public static void findWinTeam(String[][] ar, int[] input) {
		String maxName = "";
		int c = 0;
		Map<String, Integer> map = new HashMap<>();
		
		for(int i = 0; i< ar.length; i++) {
			map.put(ar[i][input[i]], map.getOrDefault(ar[i][input[i]],0)+1);
			if(map.get(ar[i][input[i]]) > c) {
				c = map.get(ar[i][input[i]]);
				maxName = ar[i][input[i]];
			}
		}
		System.out.println(maxName);
	}	
}
