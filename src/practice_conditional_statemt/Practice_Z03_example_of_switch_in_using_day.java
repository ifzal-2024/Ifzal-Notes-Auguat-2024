package practice_conditional_statemt;

import java.util.Scanner;
public class Practice_Z03_example_of_switch_in_using_day {
	public static void main(String[] args) {
		System.out.println("<-- Please print a day -->");
		Scanner scanner = new Scanner(System.in);
		int day = scanner.nextInt();
		String menu="";
		
		switch (day) {

		case 1:
			menu = "Rice and Fish";
			break;

		case 2:
			menu = "Biriyani";
			break;

		case 3:
			menu = "Rice and Chicken";
			break;

		case 4:
			menu = "Rice and Beef";
			break;

		case 5:
			menu = "Rice and Lamb";
			break;

		case 6:
			menu = "Pizza";
			break;

		case 7:
			menu = "Burger";
			break;

		default:
			menu = "N/A";
			break;
			
		}
		System.out.println("You Choose --> " + menu);

scanner.close();

	}
}

