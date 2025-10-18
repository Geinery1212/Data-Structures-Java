package stack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack obj = new Stack();
		Scanner scan = new Scanner(System.in);

		int option = 0;
		do {
			System.out.println("Select an option");
			System.out.println("1 - push");
			System.out.println("2 - pop");
			System.out.println("3 - show");
			System.out.println("4 - exit");
			System.out.println("Insert an option: ");
			option = scan.nextInt();
			switch (option) {
			case 1:
				obj.push();
				break;
			case 2:
				obj.pop();
				break;

			case 3:
				obj.show();
				break;
			case 4:
				break;
			default:
				System.out.println("This option is not valid");

			}
		} while (option != 4);
	}

}
