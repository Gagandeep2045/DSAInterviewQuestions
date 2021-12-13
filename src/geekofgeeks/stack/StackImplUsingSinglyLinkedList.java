package geekofgeeks.stack;

public class StackImplUsingSinglyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackImpl s = new StackImpl();
		s.push(12);
		s.push(13);
		s.push(45);
		int data = s.peek();
		System.out.println("a:" + data);
		int element = s.pop();
		System.out.println("b: " + element);
		int count = s.size();
		System.out.println("c: " + count);
		s.push(788);
		int count1 = s.size();
		System.out.println("d: " + count1);
		int data1 = s.peek();
		System.out.println("e:" + data1);

	}

}

class Node {
	int data;
	Node nextNode;

	Node(int data) {
		this.data = data;
	}

}

class LinkedList {

	Node head;
	Node tail;
	int count;

	void linkFirst(Node nodeToBeAdded) {
		count++;
		if (head == null) {
			head = nodeToBeAdded;
			tail = nodeToBeAdded;
			return;
		}

		Node existingheadNode = this.head;
		nodeToBeAdded.nextNode = existingheadNode;
		this.head = nodeToBeAdded;

	}

	Node unlinkFirst() {
		count--;
		Node existingHeadNode = this.head;
		Node newHeadNode = existingHeadNode.nextNode;
		this.head = newHeadNode;
		return existingHeadNode;
	}

	Node getHeadNode() {
		return head;
	}

	boolean isEmpty() {
		return head == null;
	}

	int size() {
		return count;
	}

}

class StackImpl {
	LinkedList list;

	public StackImpl() {
		list = new LinkedList();

	}

	void push(int data) {
		Node e = new Node(data);
		list.linkFirst(e);
	}

	int pop() {
		Node e = list.unlinkFirst();
		return e.data;
	}

	boolean isEmpty() {
		return list.isEmpty();
	}

	int size() {
		return list.size();
	}

	int peek() {
		Node head = list.getHeadNode();
		return head.data;
	}

}

/*

Time complxity for both push and pop is O(1) as it is constant time opeartion.
Here we are adding new node to the head , not to the tail

If we add new node to the tail, then time complexity will be O(1) for push but O(n) for pop as we have 
to iterate to get the node just before tail node which will become new tail node post popping.
Please mind we don't have pointer to node just before tail node as we are using singly linked list

Had we used doubly linked list, then complexity of O(1) could have been achieved for both push and pop on tail node as we have
pointer to second last node of linked list

https://practice.geeksforgeeks.org/tracks/DSASP-Stack/?batchId=154&tab=1

*/