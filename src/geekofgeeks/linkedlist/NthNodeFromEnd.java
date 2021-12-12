package geekofgeeks.linkedlist;

import geekofgeeks.linkedlist.LinkedList.Node;

public class NthNodeFromEnd {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		 l.add(5);
		Node n = nthNodeFromEnd(l, 2);
		System.out.println(n);
	}

	static LinkedList.Node nthNodeFromEnd(LinkedList l, int n) {
		Node start = l.head;
		Node offsetNode = l.head;
		int i = 1;
		for (i = 1; i <= n; i++) {
			offsetNode = offsetNode.next;

		}

		while (offsetNode != null) {
			start = start.next;
			offsetNode = offsetNode.next;
		}
		return start;
	}

}

/*
 * 
 * Let start node point to beginning of linked list and offset node point to
 * node at (n+1)th position from beginning of linked list
 * 
 * Let both these nodes take step 1
 * 
 * When start node will point to null , at that time offset node will point to
 * the node which is (nth position) from end of linked list
 * 
 * 
 * eg 1,2,3,4,5 2nd node from end of linked list i.e 4
 * 
 * offset at n+1 position from beginning ie (2+1)= 3rd position from beginning
 * 
 * start offset 1 3 2 4 3 5 4 null
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
