
public class PalindromeLinkedList {
	public static Node headNode = null;
	static {
		Node node8 = new Node(1, null, null);
		Node node7 = new Node(2, null, node8);
		Node node6 = new Node(3, null, node7);
		Node node5 = new Node(4, null, node6);
		Node node4 = new Node(4, null, node5);
		Node node3 = new Node(3, null, node4);
		Node node2 = new Node(2, null, node3);
		Node node1 = new Node(1, null, node2);
		node1.setHeadNode(node1);
		headNode = node1;
	}

	public static void main(String[] args) {
		MemberClass.printNode (headNode);
		Node middleNode = getTheMiddleNode(headNode);
		System.out.println("Middle Node Data is " + middleNode.getData());
		Node newMiddleNode = reverseTheNode(middleNode);
		//MemberClass.printNode(newMiddleNode);
		MemberClass.printNode (headNode);
		boolean checkEquality = checkEquals(headNode, newMiddleNode.getNext());
		System.out.println("equality  is " + checkEquality);
		middleNode = reverseTheNode(newMiddleNode);
		MemberClass.printNode(headNode);

	}

	private static boolean checkEquals(Node headNode2, Node newMiddleNode) {
		boolean isEqual = true;
		if(headNode2 != null && newMiddleNode.getNext() == null) return (headNode2.data == newMiddleNode.data);
		while(headNode2 != null && newMiddleNode.getNext() != null && isEqual) {
			 isEqual = (headNode2.data == newMiddleNode.data) ? true:false;
			 headNode2=headNode2.getNext();
			 newMiddleNode=newMiddleNode.getNext();
		}
		
		return isEqual;
	}

	private static Node reverseTheNode(Node headNode2) {
        Node headNode = headNode2;
        Node prevNode = null;
        Node curr = headNode2.getNext();
        while(curr != null) {
        	Node tempNode = curr.getNext();
        	curr.setNext(prevNode);
        	prevNode=curr;
        	curr = tempNode;
        	
        }
        headNode.setNext(prevNode);
		return headNode;
	}

	private static Node getTheMiddleNode(Node headNode2) {
		Node torPo = headNode2;
		Node harPo = headNode2;
		Node penulNode = headNode2;
		boolean isOdd = true;
		while (harPo != null && harPo.getNext() != null) {
			harPo = harPo.getNext().getNext();
			penulNode =torPo;
			torPo = torPo.getNext();
		}		
		return penulNode;
	}

}
