package geekofgeeks.tree;

public class BasicTerminologyAndDefinitions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTreeNode<Integer> rootNode = new BinaryTreeNode<>(1);
		BinaryTreeNode<Integer> level1Left = new BinaryTreeNode<>(2);
		BinaryTreeNode<Integer> level1Right = new BinaryTreeNode<>(3);
		assignAsChildNode(rootNode, level1Left, level1Right);
		BinaryTreeNode<Integer> level2Left1 = new BinaryTreeNode<>(4);
		BinaryTreeNode<Integer> level2Left2 = new BinaryTreeNode<>(5);
		assignAsChildNode(level1Left, level2Left1, level2Left2);
		BinaryTreeNode<Integer> level2Right1 = new BinaryTreeNode<>(6);
		BinaryTreeNode<Integer> level2Right2 = new BinaryTreeNode<>(7);
		assignAsChildNode(level1Right, level2Right1, level2Right2);

	}

	public static BinaryTreeNode getBinaryTree() {
		BinaryTreeNode<Integer> rootNode = new BinaryTreeNode<>(1);
		BinaryTreeNode<Integer> level1Left = new BinaryTreeNode<>(2);
		BinaryTreeNode<Integer> level1Right = new BinaryTreeNode<>(3);
		assignAsChildNode(rootNode, level1Left, level1Right);
		BinaryTreeNode<Integer> level2Left1 = new BinaryTreeNode<>(4);
		BinaryTreeNode<Integer> level2Left2 = new BinaryTreeNode<>(5);
		assignAsChildNode(level1Left, level2Left1, level2Left2);
		BinaryTreeNode<Integer> level2Right1 = new BinaryTreeNode<>(6);
		BinaryTreeNode<Integer> level2Right2 = new BinaryTreeNode<>(7);
		assignAsChildNode(level1Right, level2Right1, level2Right2);
		return rootNode;
	}
	
	static void assignAsChildNode(BinaryTreeNode rootNode, BinaryTreeNode leftChildNode, BinaryTreeNode rightChildNode) {
		rootNode.left = leftChildNode;
		rootNode.right = rightChildNode;
	}

}

class BinaryTreeNode<T> {
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;

	T data;

	BinaryTreeNode(T data) {
		this.data = data;
	}
	
	public String toString() {
		return "[  " + data + "   ]";
	}

}

/*
 * 
 * Degree -> No of child nodes of a given root node of a tree(No of children it has)
 * Nodes with degree 0 -> leaf nodes - hv no children 
 * Internal Nodes -> degree <> 0 
 * We use tree data structure for hierarchy
 * Binary Tree -> every node has atmost 2 children (i.e 0 (leaf) , 1 or 2)
 * Descendants of tree -> All node below root node of tree
 * 
 */