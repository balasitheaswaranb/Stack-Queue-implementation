package com.Queue.Stack;

import java.util.*;

public class MainQueue {

	public static void main(String[] args) {
		QueueImplementation<Object> queue = new QueueImplementation<>();
		Scanner input = new Scanner(System.in);
		boolean start = true;
		while (start) {
			System.out.println("1. Enqueue value\n2. Dequeue value\n3. peek value\n4. size\n5. display\n0. exit");
			System.out.println("Enter your choice:");
			int opt = input.nextInt();
			while (opt < 0 || opt > 5) {
				System.out.println("Enter valid number 1 to 5 :");
				opt = input.nextInt();
			}

			switch (opt) {
			case 1:
				System.out.println("Enter your value:");
				Object N = input.next();
				queue.enQueue(N);
				break;
			case 2:
				System.out.println("The dequeue value is :" + queue.deQueue());

				break;
			case 3:
				System.out.println("The peek value is : " + queue.peek());
				break;
			case 4:
				System.out.println("Stack Length : " + queue.size());
				break;
			case 5:
				System.out.print("Displaying the values : ");
				queue.displayQueue();
				System.out.println();
				break;
			case 0:
				start = false;
				break;

			}

		}
		input.close();
	}

}
