/* Specific Level Order traversal for perfect binary tree */
import java.util.*;

class Node {
	int data;
	Node left,right;
	
	public Node(int data){
		this.data = data;
		left=right=null;
	}
}

public class SpecificLevelTree{
	public Node root;
	
	public List<Node> specificLevelOrderTraversal(Node node){
		List<Node> list = new ArrayList<Node>();
		if(node == null)
			return null;
		
		Queue<Node> queue = new LinkedList<Node>();
		list.add(node);
		if(node.left != null) queue.offer(node.left);
		if(node.right != null) queue.offer(node.right);
		
		while(!queue.isEmpty()){
			Node leftChild = queue.poll();
			Node rightChild = queue.poll();
			
			list.add(leftChild);
			list.add(rightChild);
			
			if(leftChild.left != null)
				queue.offer(leftChild.left);
			if(rightChild.right != null)
				queue.offer(rightChild.right);
			if(leftChild.right != null)
				queue.offer(leftChild.right);
			if(rightChild.left != null)
				queue.offer(rightChild.left);
		}
		return list;
	}
	public static void main(String[] args){
		SpecificLevelTree tree = new SpecificLevelTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);

		tree.root.left.left.left = new Node(8);
		tree.root.left.left.right = new Node(9);
		tree.root.left.right.left = new Node(10);
		tree.root.left.right.right = new Node(11);
		tree.root.right.left.left = new Node(12);
		tree.root.right.left.right = new Node(13);
		tree.root.right.right.left = new Node(14);
		tree.root.right.right.right = new Node(15);

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
		tree.root.right.right.left.left = new Node(28);
		tree.root.right.right.left.right = new Node(29);
		tree.root.right.right.right.left = new Node(30);
		tree.root.right.right.right.right = new Node(31);
		
		List<Node> list = tree.specificLevelOrderTraversal(tree.root);
		for(Node node : list){
			System.out.println(node.data);
		}
	}
}
