package BTProblems;

import BinaryTreeTraversals.BinaryNode;
import BinaryTreeTraversals.LevelOrderTraversal;

/* Width Is Maximum Number of Elements in a Particular Level
 * 
 * 
 */
public class WidthOfBT {
	public static BinaryNode root = null;
	static {
		BinaryNode bt8 = new BinaryNode(8, null, null);
		BinaryNode bt9 = new BinaryNode(9, null, null);
		BinaryNode bt7 = new BinaryNode(7, null, bt9);
		BinaryNode bt6 = new BinaryNode(6, null, null);
		BinaryNode bt5 = new BinaryNode(5, bt8, null);
		BinaryNode bt4 = new BinaryNode(4, null, null);

		BinaryNode bt3 = new BinaryNode(3, bt6, bt7);
		BinaryNode bt2 = new BinaryNode(2, bt4, bt5);
		root= new BinaryNode(1, bt2, bt3);
	}
	public static void main(String[] args) {
		int height = findHeightOfBT(root);
		System.out.println("Height is  "+ height);
		int temp=0;
		for(int i=0;i<height;i++) {
			int width = findWidthOfBT(root,i);
			temp = (temp >width) ? temp:width;
		}
		System.out.println("Width Of tree is "+temp);
		
	}
	private static int findWidthOfBT(BinaryNode root2, int i) {
		if(root2 == null) return 0;
		else if(i==0) return 1;
		else return findWidthOfBT(root2.leftNode,i-1)+findWidthOfBT(root2.rightNode,i-1);
	}
	private static int findHeightOfBT(BinaryNode root2) {
		if(root2 == null) return 0;
		int left = findHeightOfBT(root2.leftNode);
		int right = findHeightOfBT(root2.rightNode);
		return Math.max(left, right)+1;
	}

}
