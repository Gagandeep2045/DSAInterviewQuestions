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
		Node n = nthNodeFromEnd(l, 4);
		Node n1 = nthNodeFromEnd_19_12_2021(l,4);
		System.out.println(n);
		System.out.println(n1);

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
	
	static LinkedList.Node nthNodeFromEnd_19_12_2021(LinkedList l, int n) //Refer to page 4 of register
	{
		Node start = l.head;
		Node offsetNode = l.head;
		int i = 1;
		//make offsetNode point to nth node from beginning of linked list if n=1 then offset=head and it should not iterate
		//below loop even once
		for (i = 1; i <= n-1; i++) {
			offsetNode = offsetNode.next;

		}
		//now when offsetNode points to tail when start node points to nth node from beginning of linked list given that
		// both start node and offsetNode are traversing at pace of 1 node each
		while (offsetNode != l.tail) {
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
