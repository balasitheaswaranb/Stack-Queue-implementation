package com.Queue.Stack;

public class StackImplementation<T> {

	private Node top;
	private int length;

	private class Node {

		private T data;
		private Node next;

		public Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

	public void push(T N) {
		Node tempNode = new Node(N);
		tempNode.next = top;
		top = tempNode;
		length++;

	}

	public T pop() {
		if (top != null) {
			T result = top.data;
			top = top.next;
			length--;
			return result;
		}
		return null;
	}

	public T peek() {
		if (top == null) {
			return null;
		} else {
			return top.data;
		}
	}

	public int size() {
		return length;
	}

	public boolean isEmpty() {
		if (length == 0) {
			return true;
		}
		return false;
	}

	public void displayStack() {

		Node current = top;

		while (current != null) {
			System.out.print(current.data + " ");

			current = current.next;
		}

	}

}
