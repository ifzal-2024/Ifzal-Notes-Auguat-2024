package different_type_of_class_practice;

import java.util.Scanner;

public class Scanner_02_practice {

	public static void main(String[] args) {
		System.out.println("Please Enter your Shopping cost below: ");
		Scanner scanner = new Scanner(System.in);
		// if we want to put more than one int value in console, it is possible by below
		// way
		System.out.println("Please Enter your name");
		String name=scanner.nextLine();
		System.out.println("Please enter todays walmart shopping cost: ");
		int walmartCost = scanner.nextInt();
		System.out.println("please enter todays target shopping cost: ");
		int targetCost = scanner.nextInt();
		System.out.println("Please enter todays Costco shopping cost: ");
		int costcoCost = scanner.nextInt();

		int total = walmartCost + targetCost + costcoCost;

//Check Below How I took to display your console input and appear in the FInal SYso
// e.g walmart cost : + walmartCost
		System.out.println("Hello: "+ name+
				"\nYour todays  Shopping expense from Walmart is: " + walmartCost + "\nTarget is: " + targetCost
						+ " \nand Costco is: " + costcoCost + "\nThe Total of all Shopping combined cost is: " + total);

		scanner.close();

	}

}
