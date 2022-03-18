package geekofgeeks.ds.dequeue;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeueInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<Integer> q = new LinkedList<>();
		q.offerFirst(12); //add at front end
		q.offerLast(23); // add at rear end
		q.offerLast(90);
		q.offerFirst(33);
		q.offerFirst(11);
		int elementLast = q.pollLast(); // delete at rear end
		System.out.println("ElementLast :" + elementLast);
		int elementLast2 = q.pollLast(); // delete at rear end
		System.out.println("ElementLast :" + elementLast2);

		Iterator<Integer> e1 = q.iterator(); // from front to rear
		while (e1.hasNext()) {
			Integer i = e1.next();
			System.out.println(i);
		}
		System.out.println("---------------------------------------------");
		Iterator<Integer> e2 = q.descendingIterator(); // from rear to front
		while (e2.hasNext()) {
			Integer i = e2.next();
			System.out.println(i);
		}
	}

}

/*Deueue - Doubly ended queue
 * Dequeue allows addition both at front and rear end .,,,,....Dequeue allows deletion
 * both at front and rear end
 * 
 * Both enqueue and dequeue operation's time complexity is O(1) Dequeue can be
 * implemented both using a  linked list (doubly linked list) or array ( circular
 * array)
 * 
 * Dequeue can be used both as stack or queue Dequeue is used to implement undo
 * function i.e lets say only last 5 last operations undo is possible
 * 
 */
