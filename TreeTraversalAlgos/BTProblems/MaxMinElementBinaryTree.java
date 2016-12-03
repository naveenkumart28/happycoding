package BTProblems;

import BinaryTreeTraversals.BinaryNode;

public class MaxMinElementBinaryTree {
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
		int data = findMaxElement(bt);
		System.out.println("Max Element is "+data);
		int data1 = findMinElement(bt);
		System.out.println("Min Element is "+data1);
	}

	private static int findMinElement(BinaryNode root) {
		if(root == null) return Integer.MAX_VALUE;
		int leftMin = findMinElement(root.leftNode);
		int rightMin = findMinElement(root.rightNode);
		int tempmin = Integer.MAX_VALUE;
		tempmin = leftMin < rightMin ? rightMin : leftMin;
		tempmin = tempmin < root.data ? tempmin:root.data;		
		return tempmin;
	}

	private static  int  findMaxElement(BinaryNode root) {
		if(root == null) return 0;
		int leftMax = findMaxElement(root.leftNode);
		int rightMax = findMaxElement(root.rightNode);
		int tempmax = Integer.MIN_VALUE;
		tempmax = leftMax > rightMax ? leftMax : rightMax;
		tempmax = tempmax > root.data ? tempmax:root.data;		
		return tempmax;
		
		
	}
}
