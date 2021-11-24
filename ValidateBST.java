class ValidateBST 
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

		boolean isValid = validateBST(bst, Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.println(isValid);
	}

	public static boolean validateBST(BST bst, int min, int max) {
		 
		 if(bst.value < min || bst.value >= max) {
			 return false;
		 }

		 if(bst.left != null && !validateBST(bst.left, min, bst.value)) {
			 return false;
		 }
		 if(bst.right != null && !validateBST(bst.right, bst.value, max)) {
			 return false;
		 }
		return true;
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
