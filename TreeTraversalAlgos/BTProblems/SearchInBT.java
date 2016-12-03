package BTProblems;

import BinaryTreeTraversals.BinaryNode;

public class SearchInBT {
	public static BinaryNode root = null;
	static {
		BinaryNode bt7 = new BinaryNode(7, null, null);
		BinaryNode bt6 = new BinaryNode(6, null, null);
		BinaryNode bt5 = new BinaryNode(5, null, null);
		BinaryNode bt4 = new BinaryNode(4, null, null);

		BinaryNode bt3 = new BinaryNode(3, bt6, bt7);
		BinaryNode bt2 = new BinaryNode(2, bt4, bt5);
		root= new BinaryNode(1, bt2, bt3);
	}

	public static void main(String[] args) {
		int initSize=0;
		int finalSize = findSizeBT(root,initSize);
		System.out.println(finalSize);

	}

	private static int findSizeBT(BinaryNode root2, int size) {
		if(root2 == null) return size;
		size =1+findSizeBT(root2.getLeftNode(),size);
		size =findSizeBT(root2.getRightNode(),size);
		return size;
	}

}
