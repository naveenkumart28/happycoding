package BinaryTreeTraversals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderTraversalTwoStacks {

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
		doPostOrderTraversal(bt);
	}

	private static void doPostOrderTraversal(BinaryNode bt2) {
		Stack<BinaryNode> prelimStack = new Stack<BinaryNode>();
		List<Integer> arrList =  new ArrayList<Integer>();
		prelimStack.push(bt2);
		BinaryNode curr = bt2;
		BinaryNode prev = null;
		while(! prelimStack.isEmpty()) {
			curr = prelimStack.peek();
			if(prev == null || prev.leftNode == curr || prev.rightNode == curr ) {
				if(curr.leftNode != null) prelimStack.push(curr.leftNode);
				else if(curr.rightNode != null) prelimStack.push(curr.rightNode);
			} else if (curr.leftNode == prev) {
				if(curr.rightNode != null) prelimStack.push(curr.rightNode);
			} else {				
				arrList.add(curr.data);
				prelimStack.pop();
			}
			
			prev = curr;
		}
		MemberClass.printArray(arrList);
		
	}


}
