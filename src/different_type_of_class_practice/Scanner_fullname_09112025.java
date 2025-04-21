package different_type_of_class_practice;

import java.util.Scanner;

public class Scanner_fullname_09112025 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter your First Name: ");
		String fName = scanner.nextLine();

		System.out.println("Please enter your Last Name: ");
		String lName = scanner.nextLine();

		String fullName = fName + " " + lName;
		
		System.out.println("Hey: "+ fullName + ", Now you know how Scanner Class works");
		scanner.close();

	}

}
