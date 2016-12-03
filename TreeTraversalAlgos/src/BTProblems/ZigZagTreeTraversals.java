package BTProblems;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

import BinaryTreeTraversals.BinaryNode;
/*
 * Three techniques.. 2 Stack Technique or Single DeQueue Technique Or Modified 
 * Form of Level Order Traversal * 
 * 
 */
public class ZigZagTreeTraversals {

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
		doInTwoStack(bt);
		doInSingleQueue(bt);
		doModifiedLevelTraversal(bt);
		
	}

	private static void doModifiedLevelTraversal(BinaryNode bt2) {
		Stack<BinaryNode> stackInit = new Stack<>();
		Stack<BinaryNode> stackFinal = new Stack<>();
		stackInit.push(bt2);
		BinaryNode curr;
		boolean isDone = false;
		while (!isDone) {
			while (!stackInit.isEmpty()) {
				curr = stackInit.pop();
				System.out.println(curr.getData());
				if (curr != null && curr.getLeftNode() != null)
					stackFinal.push(curr.getLeftNode());
				if (curr != null && curr.getRightNode() != null)
					stackFinal.push(curr.getRightNode());
			}
			while (!stackFinal.isEmpty()) {
				curr = stackFinal.pop();
				System.out.println(curr.getData());
				if (curr != null && curr.getRightNode() != null)
					stackInit.push(curr.getRightNode());
				if (curr != null && curr.getLeftNode() != null)
					stackInit.push(curr.getLeftNode());
			}
			isDone = stackInit.isEmpty() && stackFinal.isEmpty() ? true : false;

		}

	}

	private static void doInSingleQueue(BinaryNode bt2) {
		Deque<BinaryNode> deque = new LinkedList<BinaryNode>();
		deque.push(bt2);
		deque.push(null);
		BinaryNode curr;
		boolean isDone = false;
		while (!isDone) {
			while (deque.peekFirst() != null) {
				curr = deque.pollFirst();
				System.out.println(curr.getData());
				if (curr != null && curr.getRightNode() != null)
					deque.offerLast(curr.getRightNode());
				if (curr != null && curr.getLeftNode() != null)
					deque.offerLast(curr.getLeftNode());
			}
			while (deque.peekLast() != null) {
				curr = deque.pollLast();
				System.out.println(curr.getData());
				if (curr != null && curr.getLeftNode() != null)
					deque.offerLast(curr.getLeftNode());
				if (curr != null && curr.getRightNode() != null)
					deque.offerLast(curr.getRightNode());
			}
			isDone = deque.peekFirst() == null && deque.peekLast() == null ? true:false;

		}
		
	}

	private static void doInTwoStack(BinaryNode bt2) {
		// TODO Auto-generated method stub
		
	}
}
