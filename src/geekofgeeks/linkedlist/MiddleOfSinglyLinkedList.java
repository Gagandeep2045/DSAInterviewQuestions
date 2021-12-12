package geekofgeeks.linkedlist;

public class MiddleOfSinglyLinkedList {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		// l.add(5);
		LinkedList.Node node = l.getMiddle();
		System.out.println(node);
	}

}

class LinkedList {

	Node head;
	Node tail;

	void add(int data) {
		Node n = new Node(data);
		if (tail == null) {
			head = n;
			tail = n;
		} else {
			tail.next = n;
			tail = n;
		}

	}

	void add(Node n) {
		if (head == null) {
			head = n;
			tail = n;
		} else {
			tail.next = n;
			tail = n;
		}
	}

	void printLinkedList() {
		System.out.println("Printing Linked List: Start");
		for (Node n = head; n != null; n = n.next) {
			System.out.println(n.data);
		}
		System.out.println("Printing Linked List: End");
	}

	Node getMiddle() {
		Node slow = head;
		Node fast = head;
		while (head != null) {
			if (fast.next != null && fast.next.next != null) {
				fast = fast.next.next;
			} else {
				break;
			}
			slow = slow.next;
		}
		return slow;
	}

	static class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;

		}

		public String toString() {
			return data + "";
		}
	}
}
