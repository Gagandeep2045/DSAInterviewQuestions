package geekofgeeks.tree;

public class HeightOfBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode root = new BinaryTreeNode(1);
		BinaryTreeNode rootNode = root;
		BinaryTreeNode left = new BinaryTreeNode(2);
		BinaryTreeNode right = new BinaryTreeNode(3);
		BasicTerminologyAndDefinitions.assignAsChildNode(root, left, right);
		root = right;
		left = new BinaryTreeNode(5);
		right = new BinaryTreeNode(4);
		BasicTerminologyAndDefinitions.assignAsChildNode(root, left, right);
		root = left;
		left = new BinaryTreeNode(6);
		right = null;
		BasicTerminologyAndDefinitions.assignAsChildNode(root, left, right);
		int height = height(rootNode);
		System.out.println(height);

	}

	static int height(BinaryTreeNode root) {
		if (root == null)
			return 0;
		int leftSubtreeHeight = height(root.left);
		int rightSubtreeHeight = height(root.right);
		if (leftSubtreeHeight < rightSubtreeHeight) {
			return rightSubtreeHeight + 1;
		} else {
			return leftSubtreeHeight + 1;
		}
	}

}

/*
 * 
 * Height = Maximum no of nodes from root node to any leaf node
 * Equivalent Problem -> Maximum no of edges from root node to any leaf node
 * Maximum no of edges from root node to any leaf node = Height - 1 .. (the no of edges on longest path in binary tree)
 * Time Complexity -> O(n) where n is no of nodes in binary tree. Each node is being traversed once and we are doing constant time operation i.e finding maximum
 * so no of nodes*O(1) = O(n)
 * Space Complexity -> O(height of tree + 1) = O(Height) = No of function calls in recursion call stack
 */
