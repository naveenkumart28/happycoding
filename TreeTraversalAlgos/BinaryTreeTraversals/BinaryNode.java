package BinaryTreeTraversals;

public class BinaryNode {
	public BinaryNode(int data,BinaryNode left,BinaryNode right) {
		this.data = data;
		this.leftNode = left;
		this.rightNode = right;
	}
	public int data;
	public BinaryNode leftNode;
	public BinaryNode rightNode;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public BinaryNode getLeftNode() {
		return leftNode;
	}
	public void setLeftNode(BinaryNode leftNode) {
		this.leftNode = leftNode;
	}
	public BinaryNode getRightNode() {
		return rightNode;
	}
	public void setRightNode(BinaryNode rightNode) {
		this.rightNode = rightNode;
	}
	
}
