
public class Node {
	public Node headNode;
	public Node next;
	public int data;
    public Node(int data, Node headNode, Node next) {
    	this.data = data;
    	this.headNode = headNode;
    	this.next = next;
    }
	public Node getHeadNode() {
		return headNode;
	}

	public void setHeadNode(Node headNode) {
		this.headNode = headNode;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

}
