
public class ReverseKNodes {

	public static Node headNode = null;
	static {
		Node node8 = new Node(8, null, null);
		Node node7 = new Node(7, null, node8);
		Node node6 = new Node(6, null, node7);
		Node node5 = new Node(5, null, node6);
		Node node4 = new Node(4, null, node5);
		Node node3 = new Node(3, null, node4);
		Node node2 = new Node(2, null, node3);
		Node node1 = new Node(1, null, node2);
		node1.setHeadNode(node1);
		headNode = node1;
	}

	public static void main(String[] args) {
		MemberClass.printNode(headNode);
		headNode = doRecurse(headNode, 3);
		MemberClass.printNode(headNode);

	}

	private static Node doRecurse(Node headNode2, int order) {
		if (headNode2 == null)
			return null;
		Node prevNode = null;
		Node currNode = headNode2;
		int i = 0;
		while (currNode != null && i < order) {
			Node tempNode = currNode.getNext();
			currNode.setNext(prevNode);
			prevNode = currNode;
			currNode = tempNode;
			i++;
		}
		if (currNode != null) {
			headNode2.setNext(doRecurse(currNode, order));
		}
		headNode2 = prevNode;
		return headNode2;
	}

}
