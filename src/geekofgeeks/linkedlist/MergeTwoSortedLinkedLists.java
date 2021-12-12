package geekofgeeks.linkedlist;

import geekofgeeks.linkedlist.LinkedList.Node;

public class MergeTwoSortedLinkedLists {

	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		list1.add(1);
		list1.add(6);
		list1.add(10);
		list1.add(15);
		LinkedList list2 = new LinkedList();
		list2.add(7);
		list2.add(12);
		list2.add(14);
		list2.add(18);
		list2.add(20);
		LinkedList l = mergeSortedLinkedLists(list1, list2); // will structurally alter pointers
		l.printLinkedList();
		LinkedList list11 = new LinkedList();
		list11.add(1);
		list11.add(6);
		list11.add(10);
		list11.add(15);
		LinkedList list22 = new LinkedList();
		list22.add(7);
		list22.add(12);
		list22.add(14);
		list22.add(18);
		list22.add(20);
		Node head = mergeSortedLinkedLists_GeeksForGeekSolution(list11, list22);
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}

	}

	private static Node mergeSortedLinkedLists_GeeksForGeekSolution(LinkedList list1, LinkedList list2) {

		Node tail = null; // tail of merged linked list
		Node a = list1.head;
		Node b = list2.head;
		Node head = null; // head of merged linked list
		if (a == null)
			return b;
		if (b == null)
			return a;
		if (a.data < b.data) {
			head = a;
			a = a.next;
		} else {
			head = b;
			b = b.next;
		}
		tail = head;
		while (a != null && b != null) {
			if (a.data < b.data) {
				tail.next = a;
				a = a.next;
			} else {
				tail.next = b;
				b = b.next;
			}
			tail = tail.next;
		}
		if (a == null && b != null) {
			tail.next = b;
		}
		if (b == null && a != null) {
			tail.next = a;
		}
		return head;
	}

	/*
	 * private static Node mergeSortedLinkedLists_OptimalSolution(LinkedList list1,
	 * LinkedList list2) { Node head = null; Node ptr = null;
	 * ----------------------------------------------Not Working Node ptr1 =
	 * list1.head; Node ptr2 = list2.head; while (ptr1 != null && ptr2 != null) { if
	 * (ptr1.data > ptr2.data) { if (head == null) { head = ptr2; ptr = head; } else
	 * { ptr.next = ptr2; ptr = ptr2;
	 * 
	 * } ptr2 = ptr2.next; } else { if (head == null) { head = ptr1; ptr = head; }
	 * else { ptr.next = ptr1; ptr = ptr1; } ptr1 = ptr1.next; } }
	 * 
	 * while (ptr1 != null) { ptr.next = ptr1; ptr = ptr1; ptr1 = ptr1.next; } while
	 * (ptr2 != null) { ptr.next = ptr2; ptr = ptr2; ptr2 = ptr2.next; } return
	 * head;
	 * 
	 * }
	 */

	private static LinkedList mergeSortedLinkedLists(LinkedList list1, LinkedList list2) {
		LinkedList l = new LinkedList();
		Node ptr1 = list1.head;
		Node ptr2 = list2.head;
		while (ptr1 != null && ptr2 != null) {
			if (ptr1.data > ptr2.data) {
				l.add(ptr2);
				ptr2 = ptr2.next;
			} else {
				l.add(ptr1);
				ptr1 = ptr1.next;
			}
		}
		while (ptr1 != null) {
			l.add(ptr1);
			ptr1 = ptr1.next;
		}
		while (ptr2 != null) {
			l.add(ptr2);
			ptr2 = ptr2.next;
		}
		return l;
	}

}
