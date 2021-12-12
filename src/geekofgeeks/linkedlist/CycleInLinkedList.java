package geekofgeeks.linkedlist;

import geekofgeeks.linkedlist.LinkedList.Node;

public class CycleInLinkedList {

	public static void main(String[] args) {
		LinkedList l1 = getLinkedList();
		LinkedList l2 = getLinkedList();
		boolean hasCycleInLinkedList = hasCycleInLinkedList_FloydAlgo(l1); //// Will not modify the links in list list
		System.out.println("Floy'd Algo Method2: " + hasCycleInLinkedList);
		hasCycleInLinkedList = hasCycleInLinkedList_method1(l2); // Will modify the links in list list
		System.out.println("Method1: " + hasCycleInLinkedList);
	}

	private static LinkedList getLinkedList() {
		LinkedList l = new LinkedList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.tail.next = NthNodeFromEnd.nthNodeFromEnd(l, 4);
		return l;
	}

	public static void printLinkedList(LinkedList l) {
		System.out.println("Printing linked List :Start");
		for (Node n = l.head; n != null; n = n.next) {
			System.out.println(n.data);
		}
		System.out.println("Printing linked List :End");
	}

	private static boolean hasCycleInLinkedList_method1(LinkedList l) {

		LinkedList.Node afterVisitingNode = new LinkedList.Node(-122222);
		LinkedList.Node n = l.head;
		boolean hasCycleInLinkedList = false;
		while (n != null) {
			Node next = n.next;
			if (next == afterVisitingNode) {
				hasCycleInLinkedList = true;
				break;
			} else {
				n.next = afterVisitingNode;
			}
			n = next;
		}
		return hasCycleInLinkedList;
	}

	private static boolean hasCycleInLinkedList_FloydAlgo(LinkedList l) {
		Node slowSpeed1 = l.head;
		Node fastSpeed2 = l.head;
		boolean hasCycle = false;
		while (fastSpeed2 != null && fastSpeed2.next != null && fastSpeed2.next.next != null) {
			slowSpeed1 = slowSpeed1.next;
			fastSpeed2 = fastSpeed2.next.next;
			if (slowSpeed1 == fastSpeed2) {
				hasCycle = true;
				break;
			}
		}
		int length = lengthOfLinkedList(hasCycle, slowSpeed1);// slowSpeed1 and fastSpeed2 both point to same node
																// inside loop in
																// case of cycle
		System.out.println("Length is: " + length);
		removeCycle(fastSpeed2, hasCycle, l);// slowSpeed1 and fastSpeed2 both point to same node inside loop in case of
												// cycle
		return hasCycle;
	}

	private static void removeCycle(Node nodeInsideCycle, boolean hasCycle, LinkedList l) {
		if (hasCycle) {
			Node node = l.head;
			while (node != null && nodeInsideCycle != null && node.next != nodeInsideCycle.next) {
				node = node.next;
				nodeInsideCycle = nodeInsideCycle.next;
			}
			nodeInsideCycle.next = null;
			printLinkedList(l);
		}
	}

	private static int lengthOfLinkedList(boolean hasCycle, Node slowSpeed1) {
		int length = 0;
		if (hasCycle) {
			Node nodeInsideCycle = slowSpeed1;
			do {
				length++;
				nodeInsideCycle = nodeInsideCycle.next;
			} while (nodeInsideCycle != slowSpeed1);
		}
		return length;
	}

}
