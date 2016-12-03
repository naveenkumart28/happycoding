
/*Class to find the Middle Element of
the LinkedList And also NthElement from Last in Linked List */
public class MiddleLinkedList {

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

	public static void main(String args[]) {
		int middledata = findMiddleElement(headNode);
		int Kthdata = findKthElement(headNode, 1);
		System.out.println("Middle Element is==> " + middledata);
		System.out.println("Kth Element from Last is ==> " + Kthdata);
	}

	private static int findKthElement(Node headNode2, int k) {
		Node osp = headNode2;
		Node tsp = headNode2;

		for (int i = 1; i < k; i++) {
			if (tsp.getNext() != null) {
				tsp = tsp.getNext();
			}
		}
		while (tsp.getNext() != null) {
			tsp = tsp.getNext();
			osp = osp.getNext();
		}
		return osp.data;
	}

	private static int findMiddleElement(Node headNode2) {
		Node osp = headNode2;
		Node tsp = headNode2;
		int i = 1;
		boolean toContinue = true;
		while (tsp.getNext() != null && toContinue) {

			for (i = 1; i <= 2; i++) {
				if (tsp.getNext() != null) {
					tsp = tsp.getNext();
				} else {
					toContinue = false;
					break;
				}
			}
			osp = (osp.getNext() != null && toContinue) ? osp.getNext() : osp;
		}
		/*
		 * if (toContinue) { System.out.println("List is odd " + osp.getData());
		 * } else { System.out.println("List is Even  Left data is " +
		 * osp.getData()); if (osp.getNext() != null)
		 * System.out.println("List is Even  right data is " +
		 * osp.getNext().getData()); }
		 */

		return osp.getData();
	}

}
