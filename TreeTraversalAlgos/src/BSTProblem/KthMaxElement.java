package BSTProblem;

import BinaryTreeTraversals.BinaryNode;

public class KthMaxElement {
	public static BinaryNode bt = null;
	static {
		BinaryNode bt9 = new BinaryNode(7, null, null);
		BinaryNode bt8 = new BinaryNode(4, null, null);
		BinaryNode bt7 = new BinaryNode(9, null, null);
		BinaryNode bt6 = new BinaryNode(6, null, bt9);
		BinaryNode bt5 = new BinaryNode(3, null, bt8);
		BinaryNode bt4 = new BinaryNode(1, null, null);

		BinaryNode bt3 = new BinaryNode(8, bt6, bt7);
		BinaryNode bt2 = new BinaryNode(2, bt4, bt5);
		BinaryNode bt1 = new BinaryNode(5, bt2, bt3);
		bt = bt1;

	}
	public static void main(String args[]) { 		
		BinaryTreeTraversals.InOrderTraversal.doInOrderTraversal(bt);
		int data = findKMax(bt,9);
		System.out.println("Max element is " + data);
	}
	private static int findKMax(BinaryNode bt2, int i) {
		if(i == 0) return 0;
		int leftDepth = findSize(bt2.leftNode);		
		int rightDepth = findSize(bt2.rightNode);
		int max = 0;
		if(i>leftDepth+rightDepth+1) return max;		
		if(i == rightDepth+1) return bt2.data;
		if(i <= rightDepth) max = findKMax(bt2.rightNode,i);
		else  max= findKMax(bt2.leftNode,i-(rightDepth+1));
		return max; 		
	}
	private static int findSize(BinaryNode node) {
		if(node == null)
		return 0;
		else return 1+findSize(node.leftNode)+findSize(node.rightNode);
	}

}
