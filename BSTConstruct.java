class BSTConstruct 
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
		
//		insertBST(bst, 10);
//		printBST(bst);
//		removeEleBST(bst, 10);
//		printBST(bst);
		boolean isContain = containsEleBST(bst, 11);
		System.out.println(isContain);
	}

	public static void insertBST(BST bst, int target) {
		if(bst.value > target) {
			if(bst.left == null) {
				bst.left = new BST(target);
			} else {
				insertBST(bst.left, target);
			}
		} else {
			if(bst.right == null) {
				bst.right = new BST(target);
			} else {
				insertBST(bst.right, target);
			}
		}
	}

	//REMOVE OPERATION
	public static void removeEleBST(BST bst, int target) {
		if (bst == null) return;

		if(bst.value > target) {
			removeEleBST(bst.left, target);
		} else if(bst.value < target) {
			removeEleBST(bst.right, target);
		} else {
			if(bst.right == null) {
				bst = null;
			} else {
				BST current = bst;
				current.value = removeElement(bst.right);
				System.out.println(current.value);

			}
		}
	}

	public static int removeElement(BST bst) {

		if(bst.left == null && bst.right == null) {
			int temp = bst.value;
			bst = null;
			return temp;
		}else if(bst.left == null && bst.right != null) {
			int temp = bst.value;
			bst.value = bst.right.value;
			bst.right = null;
			return temp;
		}
		return removeElement(bst.left);
	}

	public static class BST {
		int value;
		BST right;
		BST left;

		public BST(int value) {
			this.value = value;
		}
	}

	public static void printBST(BST bst) {
		if(bst == null) return;

		printBST(bst.left);
		System.out.print(bst.value+" ");
		printBST(bst.right);
	}


	//CHECK THE VALUE IS PRESENT IN BST OR NOT

	public static boolean containsEleBST(BST bst, int target) {
		if(bst == null) return false;
		if(bst.value == target) return true;

		if(bst.value > target) {
			containsEleBST(bst.left, target);
		} else {
			containsEleBST(bst.left, target);
		}
		return false;
	}
}
