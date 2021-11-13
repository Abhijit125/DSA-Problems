/*

FIND THE SUM OF DEPTH OF BST
INPUT = 
				1
			2		3
		  4   5   6   7


OUTPUT = 10 // DEPTH OF NODE 2 is 1, DEPTH OF NODE 3 is 1 and so on SUM is 10

*/

class NodeDepth 
{
	public static void main(String[] args) 
	{
		BST bst = new BST(1);
		bst.left = new BST(2);
		bst.right = new BST(3);
		bst.left.left = new BST(4);
		bst.left.right = new BST(5);
		bst.right.left = new BST(6);
		bst.right.right = new BST(7);

		System.out.println(findDepthSum(bst, 0));
	}

	public static int findDepthSum(BST bst, int fSum) {
		if(bst == null) return 0;   
		return fSum + findDepthSum(bst.left, fSum+1) + findDepthSum(bst.right, fSum+1);
	}

	public static class BST
	{
		int value;
		BST left;
		BST right;
		public BST(int value) {
			this.value = value;
		}
	}
}
