class KthLargestBST 
{
	public static void main(String[] args) 
	{
		BST bst = new BST(15);
		bst.left = new BST(5);
		bst.right = new BST(20);
		bst.left.left = new BST(2);
		bst.left.right = new BST(5);
		bst.right.left = new BST(17);
		bst.right.right = new BST(22);
		bst.left.left.left = new BST(1);
		bst.left.left.right = new BST(3);

		TreeInfo tInfo = new TreeInfo(0, -1);
		findKthMaxVal(bst, 3, tInfo);
		System.out.println(tInfo.latestVal);
	}

	public static void findKthMaxVal(BST bst, int max, TreeInfo tree) {
		if(bst == null || tree.idx >= max) return;

		findKthMaxVal(bst.right, max, tree);
		if(tree.idx < max) {
		tree.latestVal = bst.value;
		tree.idx += 1;
		findKthMaxVal(bst.left, max, tree);
		}
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

	public static class TreeInfo
	{
		int latestVal;
		int idx;

		public TreeInfo(int idx, int latestVal) {
			this.idx = idx;
			this.latestVal = latestVal;
		}
	}
}
