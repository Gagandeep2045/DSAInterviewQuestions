package geekofgeeks.queue;

public class StackImplUsingQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingQueue<Integer> stack = new StackUsingQueue<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		Object a = stack.pop();
		System.out.println("a: " + a);
		Object b = stack.pop();
		System.out.println("b: " + b);

	}

}

class StackUsingQueue<T> {

	QueueLinkedListApproach<T> mainQueue;
	QueueLinkedListApproach<T> auxilaryQueue;

	StackUsingQueue() {
		mainQueue = new QueueLinkedListApproach<>();
		auxilaryQueue = new QueueLinkedListApproach<>();
	}

	void push(T o) {
		while (!mainQueue.isEmpty()) {
			Node<T> o1 = mainQueue.dequeue();
			auxilaryQueue.enqueue(o1.data);
		}
		mainQueue.enqueue(o);
		while (!auxilaryQueue.isEmpty()) {
			Node<T> o2 = auxilaryQueue.dequeue();
			mainQueue.enqueue(o2.data);
		}

	}

	Object pop() {
		return mainQueue.dequeue();
	}

}

/*
 * 
 * https://practice.geeksforgeeks.org/tracks/DSASP-Queue/?batchId=154&tab=1
 * 
 * 
 * 
 * 
 * 
 * 
 */
