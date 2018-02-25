/* Boundary traversal of tree */



public class BoundaryTraversal {
	public Node root;
	
	public void PrintLeaves(Node node){
		if(node.left == null && node.right == null){
			System.out.println(node.data);
		}
		if(node.left != null)
			PrintLeaves(node.left);
		if(node.right != null)
			PrintLeaves(node.right);
	}
	public void BoundaryLeftTraversal(Node node){
		if(node != null){
			if(node.left != null)
			{
				System.out.println(node.data);
				BoundaryLeftTraversal(node.left);
			}
			else if (node.right != null){
				System.out.println(node.data);
				BoundaryLeftTraversal(node.right);
			}
		}
	}
	public void BoundaryRightTraversal(Node node){
		if(node != null){
			if(node.right != null)
			{
				System.out.println(node.data);
				BoundaryRightTraversal(node.right);
			}
			else if (node.left != null){
				System.out.println(node.data);
				BoundaryRightTraversal(node.left);
			}
		}
	}
	
	public static void main(String[] args){
		BoundaryTraversal tree = new BoundaryTraversal();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		//tree.root.right.right = new Node(7);

		tree.root.left.left.left = new Node(8);
		tree.root.left.left.right = new Node(9);
		tree.root.left.right.left = new Node(10);
		tree.root.left.right.right = new Node(11);
		tree.root.right.left.left = new Node(12);
		tree.root.right.left.right = new Node(13);
		//tree.root.right.right.left = new Node(14);
		//tree.root.right.right.right = new Node(15);

		tree.root.left.left.left.left = new Node(16);
		tree.root.left.left.left.right = new Node(17);
		tree.root.left.left.right.left = new Node(18);
		tree.root.left.left.right.right = new Node(19);
		tree.root.left.right.left.left = new Node(20);
		tree.root.left.right.left.right = new Node(21);
		tree.root.left.right.right.left = new Node(22);
		tree.root.left.right.right.right = new Node(23);
		tree.root.right.left.left.left = new Node(24);
		tree.root.right.left.left.right = new Node(25);
		tree.root.right.left.right.left = new Node(26);
		tree.root.right.left.right.right = new Node(27);
		/*tree.root.right.right.left.left = new Node(28);
		tree.root.right.right.left.right = new Node(29);
		tree.root.right.right.right.left = new Node(30);
		tree.root.right.right.right.right = new Node(31);*/
		
		System.out.println(tree.root.data);
		//System.out.println("Left traversal");
		tree.BoundaryLeftTraversal(tree.root.left);
		//System.out.println("Leaves");
		tree.PrintLeaves(tree.root);
		//System.out.println("Right traversal");
		tree.BoundaryRightTraversal(tree.root.right);
	}
}
