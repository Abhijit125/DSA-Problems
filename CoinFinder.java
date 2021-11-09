/*
Find The Missing Coin which can't be find by using give COins of array
input = [1,3]
output = 2 // WE can't get 2 coins using the input array.

*/


import java.util.*;
class CoinFinder
{
	public static void main(String[] args) 
	{
		int[] ar = {1,2,3,5,6,4};

		System.out.println(findSubCoin(ar));
	}

	public static int findSubCoin(int[] ar) {
		int subCoin = 0;
		Arrays.sort(ar);
		for(int coin : ar) {
			if(coin > subCoin+1) {
			return subCoin+1;
			}
			subCoin += coin;
		}
		return subCoin+1;
	}
}
