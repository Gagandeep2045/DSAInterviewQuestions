package geekofgeeks.linkedlist;

import geekofgeeks.linkedlist.LinkedList.Node;

public class ReverseLinkedList {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
//		// l.add(5);
		reverseLinkedList(l);
		printLinkedList(l);

	}

	private static void printLinkedList(LinkedList l) {
		Node current = l.head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	private static void reverseLinkedList(LinkedList l) {
		Node current = l.head;
		Node previous = null;
		while (current != null) {
			Node after = current.next;
			current.next = previous;
			previous = current;
			current = after;
		}
		// Swap head and tail pointers
		Node head = l.head;
		l.head = l.tail;
		l.tail = head;
	}

}

/*
 
 When thinking of solution just think a middle element say nodei-1 , nodei & nodei+1 
 we have two pointers provided in input as
 previous -> node i-1
 current -> node i
 
 All nodes till node i-1 are all sorted i.e pointers have been reversed
 
 
 
 
 */
