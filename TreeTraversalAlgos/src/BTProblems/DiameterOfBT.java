package BTProblems;
/* Diameter is the Max Possible distance between two Nodes in a tree
 * It may or May not pass through the root
 * 
 * In this case, Diameter is bt8 to bt9, which is (8->5->2->1->3->6->9) , 7
 * 
 */
import BinaryTreeTraversals.BinaryNode;
import BinaryTreeTraversals.LevelOrderTraversal;

public class DiameterOfBT {
	public static BinaryNode root = null;
	static {
		BinaryNode bt8 = new BinaryNode(8, null, null);
		BinaryNode bt9 = new BinaryNode(9, null, null);
		BinaryNode bt7 = new BinaryNode(7, null, null);
		BinaryNode bt6 = new BinaryNode(6, null, bt9);
		BinaryNode bt5 = new BinaryNode(5, bt8, null);
		BinaryNode bt4 = new BinaryNode(4, null, null);

		BinaryNode bt3 = new BinaryNode(3, bt6, bt7);
		BinaryNode bt2 = new BinaryNode(2, bt4, bt5);
		root= new BinaryNode(1, bt2, bt3);
	}
	
 

	public static void main(String[] args) {
		
		Height height = (new DiameterOfBT()).new Height();
		int diameter = findDiameterOfBT(root,height);
		System.out.println("Diameter is  "+ diameter);
		LevelOrderTraversal.dolvelOrderTraversalByLine(root);
	}
	
	
	private static int findDiameterOfBT(BinaryNode root2, Height h) {
		if(root2 == null) {
			h.height = 0;
			return 0;
		}
		Height lh = (new DiameterOfBT()).new Height(); 
		lh.height++;
		Height rh = (new DiameterOfBT()).new Height(); 
		rh.height++;
		int left = findDiameterOfBT(root2.leftNode,lh);
		int right = findDiameterOfBT(root2.rightNode,rh);
		h.height = Math.max(lh.height, rh.height) +1;
		return (Math.max((Math.max(left, right)),lh.height+rh.height+1));
		
	}
	
	class Height {
		int height;		
	}

}
