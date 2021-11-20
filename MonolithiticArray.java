/*

Input = {-1, -5, -10, -1100, -1100, -1101, -1102, -9001}

Output = true // THE GIVEN ARRAY IS MONOTONIC ARRAY ->(EITHER IN DECREASING ORDER OR IN INCREASING ORDER)

*/

class MonolithiticArray 
{
	public static void main(String[] args) 
	{
		int[] ar = {-1, -5, -10, -1100, -1100, -1101, -1102, -9001};
			
		System.out.println(isMonotonic(ar));
	}

	public static boolean isMonotonic(int[] array) {
    if(array.length <= 2) return true;
		
		int direction = array[1] - array[0];
		
		for( int i = 2; i< array.length; i++) {
			if(direction == 0) {
				direction = array[i] - array[i-1];
				continue;
				}
				
				if(breakDirection(direction, array[i-1], array[i])) {
					return false;
				}
			}
		return true;
		}
	public static boolean breakDirection(int direction, int previous, int current) {
		int difference = current - previous;
		if(direction > 0) return difference < 0;
		return difference > 0 ;
	}
}
