package practice_conditional_statemt;



public class Practice_Z02_example_of_switch_in_using_day {

	public static void main(String[] args) {
		String day = "Monday";
		int age = 12;

		switch (day) {

		case "Monday":
			System.out.println("Today Menu is Noodles");
			break;

		case "Tuesday":
			if (age < 12) {
				System.out.println("Lunch Menu is Pizza");
			} else if (age >= 12) {
				System.out.println("Lunch Menu is Pasta");
			}
			break;

		default:
			System.out.println("Please Put a Valid Day");
			break;
		}

	}

}
