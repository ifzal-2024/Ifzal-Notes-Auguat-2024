package practice_coding_challenge;

import java.util.Arrays;

public class Practice_D03_smallestAndLargestNumber {
	public static void smallestLargestNum() {
		int[] num = { 6, 2, 1, 3, 45, 56, 66, 200 };
		int smallest = num[0];
		int largest = num[0];
		for (int i = 1; i < num.length; i++) {
			if (num[i] < smallest) {
				smallest = num[i];
			} else if (num[i] > largest) {
				largest = num[i];

			}
		}
		System.out.println(Arrays.toString(num));
		System.out.println("smallest: " + smallest);
		System.out.println("largest: " + largest);

	}

	public static void main(String[] args) {
		smallestLargestNum();
	}

}
