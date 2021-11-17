/*

BINARY SEARCH FROM SORTED ARRAY

INPUT = [1,3,6,9,10,11,15]
TARGET = 6

OUTPUT = 2 // RETURN INDEX IF FOUND ELSE -1

*/

class BinarySearch
{
	public static void main(String[] args) 
	{
		int[] input= {1,3,6,9,10,11,15};
		int target = 15;

		findBinarySearch(input, target);
	}

	public static void findBinarySearch(int[] input, int target) {

		int start = 0;
		int end = input.length - 1;
		int idx = -1;
		while(start <= end) {
			int nextIdx = (start + end)/2;
			if(target < input[nextIdx]) {
				end = nextIdx - 1;
			} else if(target > input[nextIdx]) {
				start = nextIdx + 1;
			} else {
				idx = nextIdx;
				break;
			}
		}
		System.out.println(idx);
	}
}
