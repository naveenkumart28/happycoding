
public class MemberClass {

	public static void printNode(Node headNode) {
		System.out.print(" Node Starts with   "+headNode.getData() + "-->");
		while(headNode.getNext() !=null) {
			headNode = headNode.getNext();
			System.out.print(headNode.getData() + "-->");
		}
		System.out.println("  ");
		
	}
}
