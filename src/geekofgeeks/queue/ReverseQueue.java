package geekofgeeks.queue;

public class ReverseQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueLinkedListApproach<Integer> q = new QueueLinkedListApproach<>();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		QueueUsingLinkedList.printFrontAndRear(q, "Before Revering");
		// reverseQueue_Iterative(q);
		reverseQueue_Recursive(q);
		QueueUsingLinkedList.printFrontAndRear(q, "After Revering");

	}

	private static void reverseQueue_Iterative(QueueLinkedListApproach<Integer> q) {
		StackUsingQueue<Integer> stack = new StackUsingQueue<>();
		while (!q.isEmpty()) {
			stack.push(q.dequeue().data);
		}
		while (!stack.isEmpty()) {
			q.enqueue(stack.pop().data);
		}
	}

	private static void reverseQueue_Recursive(QueueLinkedListApproach<Integer> q) {
		if (q.isEmpty())
			return;
		Node<Integer> node = q.dequeue();
		reverseQueue_Recursive(q);
		q.enqueue(node.data);

	}

}

/*
 * 
 * https://practice.geeksforgeeks.org/tracks/DSASP-Queue/?batchId=154&tab=1
 * 
 * 
 */
