/*

INPUT =					1

				2				3

			4		5		6		7

OUTPUT = true

EXPLAINATION = HEIGHT OF EACH AND EVERY NODE WILL BE IN (-1,0,1). THE DIFFERENCE BETWEEN THE NODE IS IN (-1,0,1) 

*/


class BalancedBT 
{
	public static void main(String[] args) 
	{
		BT bt = new BT(1);
		bt.left = new BT(2);
		bt.right = new BT(3);
		bt.left.left = new BT(4);
		bt.left.right = new BT(5);
		bt.left.right.left = new BT(6);
		bt.left.right.right = new BT(7);
		bt.right.right = new BT(8);
		
		System.out.println(isBalancedBT(bt).isBalanced);
	}

	public static TreeInfo isBalancedBT(BT bt) {
		if(bt == null) return new TreeInfo(true, -1);
		
		TreeInfo leftBT = isBalancedBT(bt.left);
		TreeInfo rightBT = isBalancedBT(bt.right);
		
		boolean balance = (leftBT.isBalanced) && (rightBT.isBalanced) && (leftBT.value - rightBT.value <= 1);

		int height = Math.max(leftBT.value, rightBT.value) + 1;

		return new TreeInfo(balance, height);
		
	}

	public static class TreeInfo
	{
		boolean isBalanced;
		int value;

		public TreeInfo(boolean isBalanced, int value) {
			this.isBalanced = isBalanced;
			this.value = value;
		}
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
