package geekofgeeks.tree;

import java.util.ArrayList;
import java.util.List;

public class PrintNodesAtKDistance {

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
		List nodeAtKDistanceOrLevel = new ArrayList();
		int k = 2;
		int currentLevel = 0;
		getNodesAtKDistance_MySolution(rootNode, k, nodeAtKDistanceOrLevel, currentLevel);
		System.out.println(nodeAtKDistanceOrLevel);
		List nodeAtKDistanceOrLevel_geeksSolutions = new ArrayList();
		getNodesAtKDistance_geeksSolution(rootNode, k, nodeAtKDistanceOrLevel_geeksSolutions);
		System.out.println(nodeAtKDistanceOrLevel_geeksSolutions);

	}

	private static void getNodesAtKDistance_MySolution(BinaryTreeNode rootNode, int k, List nodeAtKDistanceOrLevel,
			int currentLevel) {
		// Here in this solution we are incrementing level count , hence we need k & currentLevel variables both
		// TODO Auto-generated method stub
		if (rootNode == null)
			return;
		if (currentLevel == k) {
			nodeAtKDistanceOrLevel.add(rootNode);
			return;
		}
		getNodesAtKDistance_MySolution(rootNode.left, k, nodeAtKDistanceOrLevel, currentLevel + 1);
		getNodesAtKDistance_MySolution(rootNode.right, k, nodeAtKDistanceOrLevel, currentLevel + 1);

	}

	private static void getNodesAtKDistance_geeksSolution(BinaryTreeNode rootNode, int k, List nodeAtkDistanceOrLevel) {
		// Here in this solution we are decrementing level count
		if (rootNode == null)
			return;
		if (k == 0) {
			nodeAtkDistanceOrLevel.add(rootNode);
			return;
		}
		getNodesAtKDistance_geeksSolution(rootNode.left, k - 1, nodeAtkDistanceOrLevel);
		getNodesAtKDistance_geeksSolution(rootNode.right, k - 1, nodeAtkDistanceOrLevel);

	}
}

/*
Check diagramatic explanation of solution in register page 7,8,9


*/