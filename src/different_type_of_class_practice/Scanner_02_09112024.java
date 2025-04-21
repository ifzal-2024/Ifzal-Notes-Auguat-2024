package different_type_of_class_practice;

import java.util.Scanner;

public class Scanner_02_09112024 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter walmrt expense: ");
		int walmart = scanner.nextInt();

		System.out.println("Please enter target expense");
		int target = scanner.nextInt();

		System.out.println("Please enter Costco expense");
		int costco = scanner.nextInt();

		int total = walmart + costco + target;

		System.out.println("The shopping cost from walmart: " + walmart + "\nThe shoppinh cost from Target: " + target
				+ "\nShopping cost from Costco: " + costco + "\nAnd the total of the total Shopping cost today is "
				+ total);
		scanner.close();

	}

}
