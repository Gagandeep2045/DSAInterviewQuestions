package geekofgeeks.linkedlist;

import geekofgeeks.linkedlist.LinkedList.Node;

public class DeleteNodeWithOnlyNodePointerGiven {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.printLinkedList();
		Node n = NthNodeFromEnd.nthNodeFromEnd(l, 5);
		deleteNode(n);// Using this approach of copying we can never delete node which is last node of
						// linkedlist . So we take assumption node to be deleted is never last node of linked
		l.printLinkedList();
	}

	private static void deleteNode(Node nodeToBeDeleted) {
		nodeToBeDeleted.data = nodeToBeDeleted.next.data;
		nodeToBeDeleted.next = nodeToBeDeleted.next.next;
	}

}
