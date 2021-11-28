/*

Input =						1

					2				3

				4		5

			6				7

		8						9

OUTPUT = 6

EXPLAINATION = HERE THE MAX HEIGHT NODES is 8->6->4->2->5->7->9 is 6

*/

class BinaryTreeDiameter 
{
	public static void main(String[] args) 
	{
		BT bt= new BT(1);
		bt.left = new BT(2);
		bt.right = new BT(3);
		bt.left.left = new BT(4);
		bt.left.left.left = new BT(5);
		bt.left.left.left.left = new BT(6);
		bt.left.right = new BT(7);
		bt.left.right.right = new BT(8);
		bt.left.right.right.right = new BT(9);

		System.out.println(findMaxHeight(bt).diameter);
	}

	public static TreeInfo findMaxHeight(BT bt) {

		if(bt == null) return new TreeInfo(0, 0);
		
		TreeInfo leftTreeInfo = findMaxHeight(bt.left);
		TreeInfo rightTreeInfo = findMaxHeight(bt.right);

		int longDiameter = leftTreeInfo.height + rightTreeInfo.height;
		int maxDiameterSoFar = Math.max(leftTreeInfo.diameter, rightTreeInfo.diameter);
		int currentDiameter = Math.max(longDiameter, maxDiameterSoFar);
		int nextHeight = 1 + Math.max(leftTreeInfo.height, rightTreeInfo.height);

		return new TreeInfo(currentDiameter, nextHeight);

	}

	
	public static class TreeInfo
	{
		int diameter;
		int height;

		public TreeInfo(int diameter, int height) {
			this.diameter = diameter;
			this.height = height;
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
