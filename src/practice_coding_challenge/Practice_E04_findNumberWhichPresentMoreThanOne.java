package practice_coding_challenge;

/*
 * Since the Set does not maintain any order, the duplicated numbers may appear in any sequence. 
 * The important thing is that each number is listed only once, 
 * even if it was duplicated multiple times in the original array.
 * The Set only stores unique values, so once 8 is added to the Set
 *  (when the first duplicate is found), any additional occurrences of 8 are ignored when trying to add them.
The array itself remains unchanged. 
All three occurrences of 8 are still in the array. 
The Set only keeps a record of unique duplicated numbers, meaning it will store just one 8, 
even if it was found three times.
So in summary:
The Set doesn't store multiple 8s; it just stores one.
The extra 8s are not deleted from the array, but they're simply ignored by the Set after the first duplicate is found.
 * 
 * 
 * 
 * 
 */
import java.util.HashSet;
import java.util.Set;

public class Practice_E04_findNumberWhichPresentMoreThanOne {
	public static void main(String[] args) {
		int[] number = { 8, 100, 77, 1, 5, 6, 1, 6, 8, 100, 55, 1, 7, 8, 5, 56, 100, 323, 2, 44, 12 };

		Set<Integer> duplicatedNumber = new HashSet<>();

		for (int i = 0; i < number.length; i++) { // 100
			for (int j = i + 1; j < number.length; j++) { // 77, 1, 5, 6, 1, 6, 8, 100, 55, 1, 7, 8, 5, 56, 100, 323, 2, 44, 12
				if (number[i] == number[j]) { // change is here [==]
					duplicatedNumber.add(number[i]);
				}
			}
		}
		System.out.println("Duplicated numbers are: " + duplicatedNumber);
		// if you see the console, you will feel set doesn't follow indexing
	}

}
