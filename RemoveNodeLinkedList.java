/*
Input = 1 -> 1 -> 2 -> 3 -> 4 -> 5

Output = 1 -> 2 -> 3 -> 4 -> 5 // SIMILAR VALUE IS DELETED FROM SORTED LINKEDLIST

*/


class RemoveNodeLinkedList 
{
	public static void main(String[] args) 
	{
		LinkList ls = new LinkList(1);
		ls.next = new LinkList(1);
		ls.next.next = new LinkList(2);
		ls.next.next.next = new LinkList(2);
		ls.next.next.next.next = new LinkList(3);
		removeList(ls);
	}


	public static void removeList(LinkList ls) {
		LinkList crntNode = ls;
		while (crntNode!= null)
		{
			LinkList nxtNode = crntNode.next;
			if(nxtNode != null && crntNode.value == nxtNode.value) {
				nxtNode = nxtNode.next;
			} 
			crntNode.next = nxtNode;
			crntNode = crntNode.next;
		}  
		while(ls != null) {
			System.out.println(ls.value);
			ls = ls.next;
		}
	}

	public static class LinkList {
		int value;
		LinkList next;
		public LinkList(int value) {
			this.value = value;
		}
	}
}
