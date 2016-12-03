package BinaryTreeTraversals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraversal {
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
		doInOrderTraversal(bt);
	}

	public static void doInOrderTraversal(BinaryNode bt2) {
			Stack<BinaryNode> stack =  new Stack<BinaryNode>();
			List<Integer> arrList =  new ArrayList<Integer>();
			BinaryNode curr = bt2;
			stack.push(curr);
			boolean done = false;
			while (!done) {
				if(curr.getLeftNode() != null) {
					curr = curr.getLeftNode();
					stack.push(curr);
				} else {
					if(stack.isEmpty()) {
						done = true;
					} else {
						curr = stack.pop();
						arrList.add(curr.getData());
						if(curr.getRightNode() != null) {
							curr = curr.getRightNode();
							stack.push(curr);
						}						
					}
					
				}				
			}
			MemberClass.printArray(arrList);
			return;
	}
}
