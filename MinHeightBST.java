/*

Input = {1,2,5,7,10,13,14,15,22}

Output =							10
						
							2				14
						
						1		5		13		15
								
								7				22


//CONSTRUCT BST WITH MIN HEIGHT

*/

class MinHeightBST 
{
	public static void main(String[] args) 
	{
		int[] input = {1,2,5,7,10,13,14,15,22};
		print(constructBST(input, null, 0, input.length - 1));
		
	}
	
	public static BST constructBST(int[] ar, BST bst, int startIdx, int endIdx) {
		if(endIdx < startIdx) return null;
		int mid = (startIdx + endIdx) / 2;
		if(bst == null) {
			bst = new BST(ar[mid]);
		} else {
			if(bst.value > ar[mid]) {
				BST newNode = new BST(ar[mid]);
				bst.left = newNode;
				bst = bst.left;
			} else  {
				BST newNode = new BST(ar[mid]);
				bst.right = newNode;
				bst = bst.right;
			}
		}
		constructBST(ar, bst, startIdx, mid - 1);
		constructBST(ar, bst, mid + 1, endIdx);
		return bst;
	}

	public static void print(BST bst) {
		if(bst == null) return;
		
		print(bst.left);
		System.out.println(bst.value);
		print(bst.right);
	}

	public static class BST
	{
		BST left;
		BST right;
		int value;

		public BST(int value) {
			this.value = value;
		}
	}
}
