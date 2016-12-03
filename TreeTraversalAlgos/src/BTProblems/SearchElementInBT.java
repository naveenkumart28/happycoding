package BTProblems;

import BinaryTreeTraversals.BinaryNode;

public class SearchElementInBT {
	public static BinaryNode bt = null;
	static {
		BinaryNode bt7 = new BinaryNode(7, null, null);
		BinaryNode bt6 = new BinaryNode(6, null, null);
		BinaryNode bt5 = new BinaryNode(5, null, null);
		BinaryNode bt4 = new BinaryNode(4, null, null);

		BinaryNode bt3 = new BinaryNode(3, bt6, bt7);
		BinaryNode bt2 = new BinaryNode(2, bt4, bt5);
		BinaryNode bt1 = new BinaryNode(1, bt2, bt3);
		bt = bt1;

	}
	
	public static void main(String args[]) {
		boolean element = findElement(bt,10); 
		System.out.println(element);
	}

	private static boolean findElement(BinaryNode root, int i) {
		if(root == null) return false;
		if(root.getData() == i) return true;
		return (findElement(root.getLeftNode(),i) ||  findElement(root.getRightNode(), i));
	}

}
