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
 * Three approaches available
 * a) Making enqueue costly operation i.e O(n) and dequeue inexpensive operation O(1)
 *  -> We used this approach here -> Complexity is O(n) as you dequeue all elements 
 *  from main queue and enqueue it to auxiliary array.Then push the element to be added into main queue and then dequeue auxillary queue
 * and push elements back to main underlying queue from auxilliary queue
 * b) Make dequeue costly i.e O(n) and enqueue inexpensive i.e O(1)
 * 
 */
