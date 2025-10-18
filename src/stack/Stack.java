package stack;

import java.util.Scanner;

public class Stack {
	Scanner keyboard = new Scanner(System.in);

	int[] integerStack = new int[5];

	int top = -1;

	public void push() {
		if (top >= integerStack.length - 1) {
			System.out.println("The Stack is already full");
		} else {
			top++;
			System.out.println("Insert the data: ");
			integerStack[top] = keyboard.nextInt();
		}
	}

	public void pop() {
		if (top == -1) {
			System.out.println("The Stack is empty");
		} else {
			integerStack[top] = 0;
			top--;
			System.out.println("Pop successfully executed");
		}
	}

	public void show() {
		for (int i = 4; i > -1; i--) {
			System.out.println("[" + integerStack[i] + "]");
		}
	}
}
