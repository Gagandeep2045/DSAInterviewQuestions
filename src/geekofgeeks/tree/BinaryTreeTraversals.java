package geekofgeeks.tree;

import java.util.LinkedList;

public class BinaryTreeTraversals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode rootNode = BasicTerminologyAndDefinitions.getBinaryTree();
		LinkedList l_preOrder = new LinkedList();
		travesePreOrder(rootNode, l_preOrder);
		System.out.println(l_preOrder);
		LinkedList in_Order = new LinkedList();
		traveseInOrder(rootNode,in_Order);
		System.out.println(in_Order);
		LinkedList post_Order = new LinkedList();
		travesePostOrder(rootNode,post_Order);
		System.out.println(post_Order);

	}

	private static void travesePreOrder(BinaryTreeNode rootNode, LinkedList l) {

		if (rootNode == null)
			return;
		l.add(rootNode);
		travesePreOrder(rootNode.left, l);
		travesePreOrder(rootNode.right, l);
	}

	private static void traveseInOrder(BinaryTreeNode rootNode, LinkedList l) {

		if (rootNode == null)
			return;
		traveseInOrder(rootNode.left, l);
		l.add(rootNode);
		traveseInOrder(rootNode.right, l);
	}

	private static void travesePostOrder(BinaryTreeNode rootNode, LinkedList l) {

		if (rootNode == null)
			return;
		travesePostOrder(rootNode.left, l);
		travesePostOrder(rootNode.right, l);
		l.add(rootNode);

	}
}

/*
https://practice.geeksforgeeks.org/tracks/DSASP-Tree/?batchId=154&tab=1
1) Breadth First(or level order) 
 
 
2)Depth first -> 
2a)Preorder -> root , left , right -> Time Complexity O(n) - https://practice.geeksforgeeks.org/tracks/DSASP-Tree/?batchId=154&tab=1 Space Complexity -> O(h)
2b)Inorder -> left , root , right -> Time Complexity O(n) - https://practice.geeksforgeeks.org/tracks/DSASP-Tree/?batchId=154&tab=1 Space Complexity -> O(h)
2c)Postorder -> left , right , root -> Time Complexity O(n) - https://practice.geeksforgeeks.org/tracks/DSASP-Tree/?batchId=154&tab=1 Space Complexity -> O(h)

h- height of Binary Tree

Time Complexity -> For every node , we are doing constant amount of work, so Time Complexity proportional to number of nodes i.e O(n)
Space Complexity -> Recursion call stack will have nodes = no of nodes from root to leaf nodes = Height of Binary Tree
*/