/*

FIND NTH FIBO NUMBER

input = 5

OUTPUT = 3 //5TH FIBO NUMBER IS 3

*/

class NFibo 
{
	public static void main(String[] args) 
	{
		int input = 8;
		findFibo(input);
	}

	public static void findFibo(int input) {
		int pre = 0;
		int nxt = 1;
		int result = 0;
		for(int i = 2; i< input; i++) {
			nxt = pre + nxt;
			pre = nxt - pre;
		}
		System.out.println(nxt);
	}
}
