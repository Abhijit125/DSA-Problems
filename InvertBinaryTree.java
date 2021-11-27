/*

INPUT =				1
		
			2				3

		4		5		6		7

	8		9


OUTPUT =				1

				3				2

			6		7		5		4

								9		8

EXPLAINATION = EACH AND EVERY NODE IS INVERTED AS ACCORDING

*/

class InvertBinaryTree
{
	public static void main(String[] args) {
		BT bt = new BT(1);
		bt.left = new BT(2);
		bt.right = new BT(3);
		bt.left.left = new BT(4);
		bt.left.right = new BT(5);
		bt.left.left.left = new BT(8);
		bt.left.left.right = new BT(9);
		bt.right.left = new BT(6);
		bt.right.right = new BT(7);

		invertTree(bt);

		System.out.println(bt.left.left.value);
	}

	public static BT invertTree(BT bt) {
		if(bt == null) return null;

		swapLeftRight(bt);
		invertTree(bt.left);
		invertTree(bt.right);
		return bt;
	}

	public static void swapLeftRight(BT bt) {
		if (bt == null)
		{
			return;
		}
		BT left = bt.left;
		bt.left = bt.right;
		bt.right = left;
	}

	public static class BT
	{
		int value;
		BT left;
		BT right;

		public BT(int value) {
			this.value = value;
		}  
	}
}