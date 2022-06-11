package com.Queue.Stack;

import java.util.*;

public class MainStack {

	public static void main(String[] args) {
		StackImplementation<Object> stack = new StackImplementation<>();
		Scanner input = new Scanner(System.in);
		boolean start = true;
		while (start) {
			System.out.println("1. push value\n2. pop value\n3. peek value\n4. size\n5. display\n0. exit");
			System.out.println("Enter your choice : ");
			int opt = input.nextInt();
			while (opt < 0 || opt > 5) {
				System.out.println("Enter valid number 1 to 5 : ");
				opt = input.nextInt();
			}

			switch (opt) {
			case 1:
				System.out.println("Enter your value:");
				Object N = input.next();
				stack.push(N);
				System.out.println(N + " Added in Stack");
				break;
			case 2:
				System.out.println("The pop value : " + stack.pop());

				break;
			case 3:
				System.out.println("The peek value is : " + stack.peek());
				break;
			case 4:
				System.out.println("Stack Length : " + stack.size());
				break;
			case 5:
				System.out.print("Displaying the values : ");
				stack.displayStack();
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
