package practice_coding_challenge;

public class Practice_A00_coding_fundamental {

	public static void main(String[] args) {
		// ParameterizedType method
		int val1 = 82;
		int val2 = 82;

		if (val1 > val2) {
			System.out.println(val1 + " is greater than " + val2);
		} else {
			System.out.println(val1 + " is not greater than " + val2);
		}

		System.out.println("--------------------Regular For Loop----o---------o--");
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

		System.out.println("---------------- Real time coding Refresher-------------------------");
		// how can you got even number from 0 to 10?
		// Below observe curly braces and sysouts how to write properly.
		for (int i = 0; i <= 10; i += 1) {
			if (i % 2 == 0) {
				System.out.println(i + " is an Even Number");
			} else if (i % 2 == 1) {
				System.out.println(i + " is an ODD Number");
			} else {
				System.out.println("System failed to execute");
			}

		}

		System.out.println("-----o-------For Loop in Array--o----------------------");
		String[] allPresident = { "Joe Biden", "Donald Trump", "Barack Obama", "George Bush Jr", "Bill Clinton" };
		for (int i = 0; i < allPresident.length; i++) {
			System.out.println(i);
			System.out.println(allPresident[i]);
		}

	}

}
