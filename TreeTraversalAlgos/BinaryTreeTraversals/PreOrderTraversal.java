package BinaryTreeTraversals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversal {

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
		doPreOrderTraversal(bt);
	}

	private static void doPreOrderTraversal(BinaryNode bt2) {
			Stack<BinaryNode> stack =  new Stack<BinaryNode>();
			List<Integer> arrList =  new ArrayList<Integer>();
			BinaryNode curr = bt2;
			stack.push(curr);			
			while (!stack.isEmpty()) {
				curr = stack.pop();
				arrList.add(curr.getData());
				if(curr.getRightNode() != null) {
					stack.push(curr.getRightNode());
				} if(curr.getLeftNode() != null) {
					stack.push(curr.getLeftNode());
				} 	
				
			}
			MemberClass.printArray(arrList);
			return;
	}

}
