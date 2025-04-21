package different_type_of_class_practice;

import java.util.Scanner;

public class Scanner_practice_03 {
	public static void main(String[] args) {
		System.out.println("Please Type your First and Last Name: ");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter you First Name: ");
		String fName = scanner.nextLine();
		System.out.println("Enter your last Name:");
		String lName = scanner.nextLine();
		String fullName = fName + " " + lName;
		System.out.println("Hey! " + fullName + ", Now You know how the Scanner class works!");
		scanner.close();
	}

}
