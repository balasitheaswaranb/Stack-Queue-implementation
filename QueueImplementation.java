package com.Queue.Stack;

public class QueueImplementation<T> {

	private Node first;
	private Node last;
	private int length;

	private class Node {
		private T data;
		private Node next;

		public Node(T value) {
			this.data = value;
		}
	}

	public void enQueue(T value) {
		if (first == null) {
			last = new Node(value);
			first = last;
		} else {
			last.next = new Node(value);
			last = last.next;
		}
		length++;
	}

	public T deQueue() {
		if (first != null) {
			T value = first.data;
			first = first.next;
			length--;
			return value;
		}
		return null;
	}

	public int size() {
		return length;
	}

	public void displayQueue() {
		Node currentNode = first;
		while (currentNode != null) {
			System.out.print(" " + currentNode.data + " ");
			currentNode = currentNode.next;
		}
	}

	public boolean isEmpty() {
		return length == 0;
	}

	public T peek() {
		if (first == null) {
			return null;
		}
		return first.data;
	}

}
