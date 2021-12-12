package geekofgeeks.ds.recursion;

public class JosephProblemCircularLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Node {

	int data;
	Node next;

	Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	void setNext(Node n) {
		this.next = n;
	}

	Node getNext() {
		return this.next;
	}
}

class CircularLinkedList{
	
	Node startNode;
	
	Node endNode;
	
	void removeNode(Node n)
	{
		
	}
}