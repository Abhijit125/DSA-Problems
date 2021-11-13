/*
FIND BRANCH SUM
INPUT =
			1
		2		3
	  4  5    6	  7

OUTPUT = [7,8,10,11] //SUM of 1st branch is 7 and so on..

*/
import java.util.*;
class BranchSum 
{
	public static void main(String[] args) 
	{
		List<Integer> ls = new ArrayList<>();
		BST bst = new BST(1);
		bst.left = new BST(2);
		bst.left.left = new BST(4);
		bst.left.right = new BST(5);
		bst.right = new BST(3);
		bst.right.left = new BST(6);
		bst.right.right = new BST(7);

		findSumBranch(bst, ls, 0);
		System.out.println(ls);
	}

	public static void findSumBranch(BST bst, List<Integer> ls, int sum) {
		if(bst == null ) {
			return;
		}
		sum = sum + bst.value;
		if (bst.left == null || bst.right == null)
		{
			ls.add(sum);
		}
		findSumBranch(bst.left, ls, sum);
		findSumBranch(bst.right, ls, sum);

	}

	public static class BST {
		int value;
		BST left;
		BST right;

		public BST(int value) {
			this.value = value;
		}
	}
}
