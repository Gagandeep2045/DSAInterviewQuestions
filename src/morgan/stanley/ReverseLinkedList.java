package morgan.stanley;

import java.util.Arrays;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays.asList(1,2,3).stream().sore
		Node[] arr = new Node[5];
		LinkedList l = new LinkedList();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Node(i);
			l.addNode(arr[i]);
		}
		l.printNodes();
		l.reverse();
		System.out.println("--------");
		l.printNodes();
		

	}

	static class LinkedList {

		Node head;

		void reverse()
		{
			Node current=head;
			Node next=null;
			Node previous=null;
			while(current!=null)
			{
				next=current.next;
				current.next=previous;
				previous=current;
				current=next;
			}
			head=previous;
		}
		
		void addNode(Node n) {
			if (head == null) {
				head = n;
			} else {
				Node t = head;
				while (t.next != null) {
					t = t.next;
				}
				t.next = n;
			}
		}

		void printNodes() {
			Node n = head;
			while (n != null) {
				System.out.println(n.data);
				n = n.next;
			}
		}
	}

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;

		}
	}
}
