class ReConstructBST 
{
	public static void main(String[] args) 
	{
		int[] preOrderAr = {10,4,2,1,5,17,19,18};
		BST bst = constructBST(preOrderAr);
		System.out.println(bst.left.value);
	}
	
	public static BST constructBST(int[] ar) {
		TreeInfo treeInfo = new TreeInfo(0);
		return bstConstruction(ar, treeInfo, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}		
	
	public static BST bstConstruction(int[] ar, TreeInfo treeInfo, int min, int max) {

		if(treeInfo.rootIdx == ar.length) return null;
		
		int rootValue = ar[treeInfo.rootIdx];
		if(rootValue < min || rootValue >= max) {
			return null;
		}
		treeInfo.rootIdx += 1;
		BST leftSubTree = bstConstruction(ar, treeInfo, min, rootValue);
		BST rightSubTree = bstConstruction(ar, treeInfo, rootValue, max);
		
		BST bst = new BST(rootValue);
		bst.left = leftSubTree;
		bst.right = rightSubTree;
		return bst;
	}


			
	public static class TreeInfo
	{
		int rootIdx;
		public TreeInfo(int rootIdx) {
			this.rootIdx = rootIdx;
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
}
