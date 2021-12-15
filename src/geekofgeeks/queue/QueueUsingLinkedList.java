package geekofgeeks.queue;

public class QueueUsingLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueLinkedListApproach q = new QueueLinkedListApproach();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		printFrontAndRear(q, "one");
		Node c1 = q.dequeue();
		System.out.println("c1 " + c1);
		Node c2 = q.dequeue();
		System.out.println("c2 " + c2);
		Node c3 = q.dequeue();
		System.out.println("c3 " + c3);
		printFrontAndRear(q, "two");
		q.enqueue(7);
		printFrontAndRear(q, "three");
		q.enqueue(8);
		printFrontAndRear(q, "four");
		Node c4 = q.dequeue();
		System.out.println("c4 " + c4);
		printFrontAndRear(q, "five");

	}

	static void printFrontAndRear(QueueLinkedListApproach q, String marker) {
		Node a = q.getFront();
		Node b = q.getRear();
		System.out.println("Marker: " + marker + " Front: " + a + " Rear: " + b);
	}

}

class QueueLinkedListApproach {

	private Node front; // head
	private Node rear; // tail

	void enqueue(Object obj) {
		Node e = new Node(obj);
		if (front == null && rear == null) // no element in queue in the very beginning
		{
			front = e;
			rear = e;
		} else {

			rear.next = e;
			rear = e;

		}
	}

	Node dequeue() {
		Node e = front;
		if (front != null) {
			if (front == rear) // only one element left in the queue which needs to be dequeued
			{
				front = null;
				rear = null;
			} else
				front = front.next;

		}

		return e;
	}

	Node getFront() {
		return front;
	}

	Node getRear() {
		return rear;
	}

}

class Node {
	Object data;
	Node next;

	public Node(Object data) {
		this.data = data;
	}

	public String toString() {
		return "[ Data: " + data + " ]";
	}

}

/*
 * Two approaches
 * https://practice.geeksforgeeks.org/tracks/DSASP-Queue/?batchId=154&tab=1
 * a)head=rear (addition) tail=front(deletion) enqueue/addition-> O(1)
 * dequeue/deletion -> O(n) bcoz after deleting tail node, we don't have pointer
 * to second last node so we have to traverse from beginning of linked list(as
 * we have singly linked list) to get second last node which will become
 * front/tail node post deletion
 *
 * 
 * b) head=front(deletion) , tail=rear(addition) enqueue/addition- O(1) dequeue
 * - O(1) as head has pointer to next node
 */