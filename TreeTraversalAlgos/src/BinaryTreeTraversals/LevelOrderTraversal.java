package BinaryTreeTraversals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class LevelOrderTraversal {
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
		dolvelOrderTraversal(bt);
		dolvelOrderTraversalByLine(bt);
	}

	public static void dolvelOrderTraversalByLine(BinaryNode bt2) {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		List<Integer> arrList = new ArrayList<Integer>();
		queue.add(bt2);
		queue.add(null);
		while(!queue.isEmpty()) {
		BinaryNode temp = queue.poll();
		if(temp != null) {
		arrList.add(temp.data);
		if(temp.getLeftNode() != null) queue.add(temp.getLeftNode());
		if(temp.getRightNode() != null) queue.add(temp.getRightNode());			
		} else {
			if(!queue.isEmpty()) {
				MemberClass.printArray(arrList);
				queue.add(null);
				arrList.clear();
			} else if(arrList != null && arrList.size() > 0 ) {
				MemberClass.printArray(arrList);
			}
			}
		}
		
		
	}

	public static void dolvelOrderTraversal(BinaryNode bt2) {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		List<Integer> arrList = new ArrayList<Integer>();
		queue.add(bt2);
		while(!queue.isEmpty()) {
		BinaryNode temp = queue.poll();
		arrList.add(temp.data);
		if(temp.getLeftNode() != null) queue.add(temp.getLeftNode());
		if(temp.getRightNode() != null) queue.add(temp.getRightNode());			
		}
		MemberClass.printArray(arrList);
	}
}
