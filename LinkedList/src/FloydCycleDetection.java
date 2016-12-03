/**
 * 
 */

/**
 * @author nkthanga Nov 6, 2016
 *
 */
public class FloydCycleDetection {
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
		node8.setNext(node6);
		headNode = node1;
	}

	public static void main(String[] args) {
      boolean isExists = detectCycleExists(headNode);
      int data = (isExists) ? returnStartCycleData(headNode) :0;
      System.out.println("Loop Starting Data is  " + data);
	}

	private static int returnStartCycleData(Node headNode2) {
		Node tortNode = headNode2;
		Node hareNode = headNode2;
		boolean isExists = false;
		while(tortNode.getNext() != null) {
			tortNode = tortNode.getNext().getNext();
			hareNode = (hareNode.getNext() !=null)?hareNode.getNext():hareNode;
			if(System.identityHashCode(tortNode) == System.identityHashCode(hareNode)) {
				isExists = true;
				break;
			}
		}
		if(isExists) {
			tortNode = headNode2;
			while(hareNode.getNext() !=null) {
			tortNode =tortNode.getNext();
			hareNode = (hareNode.getNext() !=null)?hareNode.getNext():hareNode;
			if(System.identityHashCode(tortNode) == System.identityHashCode(hareNode)) {
				return tortNode.getData();
			}
			}
			return 0;
		}
		return 0;
	}

	private static boolean detectCycleExists(Node headNode2) {
		Node tortNode = headNode2;
		Node hareNode = headNode2;
		while(tortNode.getNext() != null) {
			tortNode = tortNode.getNext().getNext();
			hareNode = (hareNode.getNext() !=null)?hareNode.getNext():hareNode;
			if(System.identityHashCode(tortNode) == System.identityHashCode(hareNode)) {
				return true;
			}
		}
		return false;
	}
}
