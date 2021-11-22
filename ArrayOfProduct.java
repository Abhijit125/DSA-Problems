/*
Input = {5,1,4,2}

Output = [8,40,10,20]//product of idx 0 = 8, product of idx 1 = 40 and so on

*/

class ArrayOfProduct
{
	public static void main(String[] args) 
	{
		int ar[] = {5,1,4,2};
		findArrayOfProduct(ar);
	}

	public static void findArrayOfProduct(int[] ar) {
		int product = 1;
		for(int data : ar) {
			product *= data;
		}

		for(int data : ar) {
			System.out.println(product / data);
		}
	}
}
