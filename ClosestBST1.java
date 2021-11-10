/*

Input =        10
			4		15
		  2	  5	   13 22
Target = 11

Output = 10 // Closest Value is 10

*/

class ClosestBST1 
{
	public static void main(String[] args) 
	{
		BST1 bst = new BST1(10);
		bst.left = new BST1(4);
		bst.left.left = new BST1(2);
		bst.left.right = new BST1(5);
		bst.right = new BST1(15);
		bst.right.left = new BST1(13);
		bst.right.right = new BST1(22);

		int res = findClosestBST(bst, 6, bst.value);
		System.out.println(res);
	}

	static class BST1 
	{
		int value;
		BST1 left;
		BST1 right;
		public BST1(int value) {
			this.value = value;
		}
	}

	public static int findClosestBST(BST1 bst, int close, int find) {
	
	if(Math.abs(close - find) > Math.abs(close - bst.value)) {
		find = bst.value;
	}
	if(close < bst.value && bst.left != null) {
		return findClosestBST(bst.left, close, find);
	} else if(close > bst.value && bst.right != null) {
		return findClosestBST(bst.right, close, find);
	} else {
		return find;
	}
	}
}
