package geekofgeeks.linkedlist;

import geekofgeeks.linkedlist.LinkedList.Node;

public class SegregateEvenAndOddNodes {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		 l.add(122);
		//l.add(33);
		// l.add(12);
		//l.add(5);
		//l.add(9);
		// l.add(0);
		 l.add(66);
		l.printLinkedList();
		segregateOddEven(l);
		l.printLinkedList();
	}

	private static void segregateOddEven(LinkedList l) {
		LinkedList evenNodes = new LinkedList();
		Node previous = null;
		for (Node n = l.head; n != null; n = n.next) {
			if (n.data % 2 == 0) {
				evenNodes.add(n);
				deleteNode(previous, n, l);
			} else {
				previous = n;
			}
		}
		if (evenNodes.head != null) {//atleast one even node
			evenNodes.tail.next = l.head;
			l.head = evenNodes.head;
		}
	}

	private static void deleteNode(Node previous, Node n, LinkedList l) {
		if (previous == null) { //n is first node of linked list
			l.head = n.next;
		} else {
			previous.next = n.next; 
		}
		if (n == l.tail) { //n is last node of niked list
			l.tail = previous;
		}
	}

}
