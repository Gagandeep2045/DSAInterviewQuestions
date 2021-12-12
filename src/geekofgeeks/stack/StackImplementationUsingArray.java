package geekofgeeks.stack;

public class StackImplementationUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack(5);
		s.push("A");
		s.push("B");
		s.push("C");
		s.push("D");
		String f = s.peek();
		String e = s.pop();
		System.out.println(e + "  : " + f);
		s.push("E");
		s.push("F");
	}

}

class Stack {

	String[] arr;

	int top;

	public boolean isEmpty() {
		return top == -1;
	}

	public int getSize() {
		return top + 1;
	}

	public Stack(int capacity) {
		arr = new String[capacity];
		top = -1;
	}

	public void push(String s) {
		if (top == arr.length - 1) {
			throw new StackFilledException(); //Overflow
		}
		top = top + 1;
		arr[top] = s;
	}

	public String pop() {
		if (top == -1) {
			throw new StackEmptyException(); // Underflow
		}
		String element = arr[top];
		top--;
		return element;
	}

	public String peek() {
		if (top == -1)
			throw new StackEmptyException();
		return arr[top];
	}

}

class StackFilledException extends RuntimeException {
}

class StackEmptyException extends RuntimeException {

}