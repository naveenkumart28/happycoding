/**
 * 
 */

/**
 * Merge Two Sorted LinkedLists into One List
 *
 */
public class MergeTwoSortedLinkedList {
	public static Node headNode1 = null;
	public static Node headNode2 = null;
	static {
		Node node8 = new Node(8, null, null);
		Node node7 = new Node(7, null, node8);
		Node node6 = new Node(6, null, node7);
		Node node5 = new Node(5, null, node6);
		Node node4 = new Node(4, null, null);
		Node node3 = new Node(3, null, node4);
		Node node2 = new Node(2, null, node5);
		Node node1 = new Node(1, null, node3);
		node1.setHeadNode(node1);
		node2.setHeadNode(node2);
		headNode1 = node1;
		headNode2 = node2;
	}

	public static void main(String[] args) {
		MemberClass.printNode(headNode1);
		MemberClass.printNode(headNode2);
		mergeTwoLists(headNode1, headNode2);
		MemberClass.printNode(headNode1);		
	}

	private static void mergeTwoLists(Node headNode1, Node headNode2) {
		if (headNode1.getData() > headNode2.getData()) {
			Node tempNode = headNode1;
			headNode1 = headNode2;
			headNode2 = tempNode;
		}
		 Node currNode = headNode1;
		 headNode1 = headNode1.getNext();
		
		while (headNode1  != null && headNode2 != null) {
			if (headNode1.getData() < headNode2.getData()) {
				currNode.setNext(headNode1);
				currNode=headNode1;
				headNode1 = headNode1.getNext();
				
			} else {
				currNode.setNext(headNode2);
				currNode=headNode2;
				headNode2 = headNode2.getNext();
				
			}
		}
		while (headNode1  != null) {
			currNode.setNext(headNode1);
			currNode=headNode1;
			headNode1 = headNode1.getNext();		
		} while (headNode2 != null) {
			currNode.setNext(headNode2);
			currNode=headNode2;
			headNode2 = headNode2.getNext();
			
		} 

	}

}
