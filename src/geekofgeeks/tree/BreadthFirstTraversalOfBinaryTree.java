package geekofgeeks.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstTraversalOfBinaryTree {

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
		List<BinaryTreeNode> list = new LinkedList<>();
		breadthFirstTravesal(rootNode,list);
		System.out.println(list);

	}

	private static void breadthFirstTravesal(BinaryTreeNode rootNode, List<BinaryTreeNode> list) {
		// TODO Auto-generated method stub
		Queue<BinaryTreeNode> queue = new LinkedList<>(); //LinkedList class in java implements Queue interface indirectly by directly implementing Dequeue interface
		// Queue (Interface ) <--- Extends ---- Dequeue (Interface) <----- Implements----LinkedList (Implementation Class)
		//Queue -> addition at rear end and deletion at front end
		//Dequeue -> Addition and deletion can take place at both ends
		queue.add(rootNode);
		while (!queue.isEmpty()) {
			BinaryTreeNode node = queue.poll();
			if (node != null) // queue is non empty
			{
				list.add(node);
			}
			if (node.left != null) {
				queue.offer(node.left);
			}
			if (node.right != null)
			{
				queue.offer(node.right);
			}
		}
	}

}

/*
 See complete diagrammatic explanation on page 10 of register
 Time Complexity -> O(n) as all nodes are traversed exactly once and only costly operation done on that node is enqueue/dequeue which is O(1) complexity
 Auxiliary Complexity -> O(n) as n will be size of queue if all nodes need to be added in queue
 Auxiliary Complexity can also be expressed as Theta(Width of binary Tree)
 
 If Binary tree is skewed as in below, then size of queue is always going to be 1 i.e Theta(1) since for every node dequeued, only one has to be enqueued
 1 
  \ 
   2
    \
     3
      \ 
       4
       
 If binary tree is completely balanced that is worst case of space complexity , then size of queue = width of binary tree (explanation given on page 14 of register
    
 
 
 */
