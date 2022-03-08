package geekofgeeks.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
		//PriorityQueue<Integer> pq = new PriorityQueue<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		//Priority Queue internally uses minheap . IF comparator with reverse order passed in constructor
		//then uses maxheap
		pq.offer(12);
		pq.offer(5);
		pq.offer(0);
		pq.offer(30);
		pq.offer(-1);
		System.out.println(pq);
		Integer i=pq.poll();
		System.out.println(i);

	}

}
