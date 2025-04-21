package practice_conditional_statemt;

import java.util.Scanner;



public class Practice_UseOfNestedIf02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter Value 1");
		int val1 = scanner.nextInt();
		System.out.println("Please enter Value 2");
		int val2 = scanner.nextInt();

		if (val1 % 2 == 0) {//Outer If
			if (val1 > val2) {// Inner If
				System.out.println(val1 + " is an EVEN numer and " + val1 + " is greater than " + val2);
			} else if (val1 < val2) {
				System.out.println(val1 + " is an EVEN numer and " + val1 + " is smaller than " + val2);
			} else if (val1 == val2) {
				System.out.println(val1 + " is an EVEN numer and " + val1 + " is equal to " + val2);
			} else if (val1 >= val2) {
				System.out.println(val1 + " is an EVEN numer and " + val1 + " is greater than or equal to " + val2);
			} else if (val1 <= val2) {
				System.out.println(val1 + " is an EVEN numer and " + val1 + " is smaller than or equal to " + val2);
			}

		} else if (val1 % 2 == 1) {//Outer else if
			if (val1 > val2) {// Inner If
				System.out.println(val1 + " is an ODD numer and " + val1 + " is greater than " + val2);
			} else if (val1 < val2) {
				System.out.println(val1 + " is an ODD numer and " + val1 + " is smaller than " + val2);
			} else if (val1 == val2) {
				System.out.println(val1 + " is an ODD numer and " + val1 + " is equal to " + val2);
			} else if (val1 >= val2) {
				System.out.println(val1 + " is an ODD numer and " + val1 + " is greater than or equal to " + val2);
			} else if (val1 <= val2) {
				System.out.println(val1 + " is an ODD numer and " + val1 + " is smaller than or equal to " + val2);
			}
// Outer Else
		} else { 
			System.out.println("The system failed to execute the outcome");
		}

	}

}
