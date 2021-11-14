/*
FIND THE DFS PATH OF GIVEN TREE
INPUT = 
											A
									B				D
								 E	   F		 G     H
								I J	  K L		M N   O  P

OUTPUT = [A,B,E,I,J,F,K,L,,D,G,M,N,H,O,P] //TRAVERSAL IN DEPTH FIRST SEARCH ORDER

*/

class DFS
{
	public static void main(String[] args) 
	{
		Tree t = new Tree("A");
		t.left = new Tree("B");
		t.right = new Tree("C");
		t.left.left = new Tree("D");
		t.left.right = new Tree("E");
		t.right.left = new Tree("F");
		t.right.right = new Tree("G");
		traverseDFS(t);
	}
	public static void traverseDFS(Tree t) {
		if(t == null) return;
		
		System.out.println(t.value);
		traverseDFS(t.left);
		traverseDFS(t.right);
	}

	static class Tree
	{
		String value;
		Tree left;
		Tree right;

		public Tree(String value) {
			this.value = value;
		}
	}
		
}
