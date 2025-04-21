package practice_control_statement;

public class Practice_for_Loop {
	public static void main(String[] args) {
		// System.out.println("-----------For Loop 01 ---------");

		for (int i = 0; i < 5; i = i + 1) {
		 System.out.println(i);
		}

		// System.out.println("--------For Loop Incremented by 2-------");
		for (int i = 1; i <= 10; i += 2) {

		}

		System.out.println("---------------- Real time coding -------------------------");
		// how can you got even number from 0 to 10?
		for (int i = 0; i <= 10; i += 1) {
			if (i % 2 == 0) {
				System.out.println(i + " is an Even Number");
			} else if (i % 2 == 1) {
				System.out.println(i + " is an ODD Number");
			} else {
				System.out.println("System failed to execute");
			}

		}
		// Regular outcome: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
		// after using if block:

		System.out.println("----------------While Loop------------");

		int i = 0;
		while (i <= 5) {
			System.out.println(i);
			i++;
		}

		System.out.println("\n---------- do while loop 02, condition is false ----------\n");
		int k = 4;
		do {
			System.out.println(k);
			k += 2;
		} while (k < 4);

		System.out.println("\n---------- while loop 05 ----------\n");
		int n = 3;
		int m = 16;
		while (m > 5) {
			System.out.print(m * n + ", "); // we use print here, not println
			m -= 3;

			System.out.println("\n---------- do while loop 02, condition is false ----------\n");
			int p = 2;
			do {
				System.out.println(p);
				p += 2;
			} while (p > 4);
			
			

		}

	}

}
