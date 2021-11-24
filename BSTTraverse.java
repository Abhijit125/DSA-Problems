class BSTTraverse
{
	public static void main(String[] args) 
	{
		BST bst = new BST(10);
		bst.left = new BST(5);
		bst.right = new BST(15);
		bst.left.left = new BST(2);
		bst.left.right = new BST(5);														
		bst.left.left.left = new BST(1);
		bst.right.left = new BST(13);
		bst.right.right = new BST(22);
		bst.right.left.right = new BST(14);
		
	//	traverseInorder(bst);
	//	traversePreOrder(bst);
		traversePostOrder(bst);
	}

	//INORDER TRAVERSAL

	public static void traverseInorder(BST bst) {
		if(bst == null) return;
		
		traverseInorder(bst.left);
		System.out.println(bst.value);
		traverseInorder(bst.right);
	}

	//PREORDER TRAVERSAL

	public static void traversePreOrder(BST bst) {
		if(bst == null) return;

		System.out.println(bst.value);
		traversePreOrder(bst.left);
		traversePreOrder(bst.right);
	}

	//POSTORDER TRAVERSAL

	public static void traversePostOrder(BST bst) {
		if(bst == null) return;

		traversePostOrder(bst.left);
		traversePostOrder(bst.right);
		System.out.println(bst.value);
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
