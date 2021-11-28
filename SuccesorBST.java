class SuccesorBST 
{
	public static void main(String[] args) 
	{
		BinaryTree bt = new BinaryTree(1);
		bt.left = new BinaryTree(2);
		bt.left.parent = new BinaryTree(1);
		bt.right = new BinaryTree(3);
		bt.right.parent = new BinaryTree(1);
		bt.left.left = new BinaryTree(4);
		bt.left.left.parent = new BinaryTree(2);
		bt.left.right = new BinaryTree(5);
		bt.left.right.parent = new BinaryTree(2);
		bt.left.left.left = new BinaryTree(6);
		bt.left.left.left.parent = new BinaryTree(4);

		int findInput = 5;

		System.out.println(findSuccessor(null, bt).value);

	}

	public static BinaryTree findSuccessor(BinaryTree tree, BinaryTree node) {
    if(node.right != null) return getLeftmostChild(node.right);
    return getRightmostParent(node);
  }
	
	public static BinaryTree getLeftmostChild(BinaryTree node) {
		BinaryTree currentNode = node;
		while (currentNode.left != null) {
			currentNode = currentNode.left;
		}
		return currentNode;
	}
	
	public static BinaryTree getRightmostParent(BinaryTree node) {
		BinaryTree currentNode = node;
		while (currentNode.parent != null && currentNode.parent.right == currentNode) {
			currentNode = currentNode.parent;
		}
		return currentNode.parent;
	}

	public static class BinaryTree
	{
		int value;
		BinaryTree left;
		BinaryTree right;
		BinaryTree parent;
		public BinaryTree(int value) {
			this.value = value;
		}
	}

}
