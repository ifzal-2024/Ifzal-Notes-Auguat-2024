package practice_coding_challenge;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Prctice_D08_secondLargestNumber {

	// discussed in E05
		public static void main(String[] args) {
			// This is not accepted by interviewer ( so try to avoid it)
			int[] number = { 12, 10, 100, 5, 6, 2, 892, 77, 55, 7, 8, 5, 56, 323, 2, 1456, 44, 12, 1456, 6, 4, 5, 5 };
			// Arrays class is used to manipulate the Array
			System.out.println("Unsorted Array ::> " + Arrays.toString(number)); // no need
			// sort method of Arrays class, is used to see the index of the Array in
			// ascending order
			Arrays.sort(number);
			System.out.println("Sorted Array ::> " + Arrays.toString(number));
			System.out.println("Smallest element is ::> " + number[0]);
			System.out.println("Largest element is ::> " + number[number.length - 1]);
			System.out.println("Second Largest element is ::> " + number[number.length - 2]);
			
			System.out.println("-----------Using TreeSet--------------");
			TreeSet <Integer>set1 = new TreeSet<>();
			set1.add(2);
			set1.add(10);
			set1.add(15);
			set1.add(20);
			set1.add(44);
			set1.add(56);
			set1.add(78);
			set1.add(82);
			set1.add(98);
			set1.add(24);
			set1.add(1456);
			set1.add(1456);
			
			System.out.println(set1);
			System.out.println("Smallest element: " + set1.first());
			
			System.out.println("Largest element: "+ set1.last());
		
			 System.out.println("Second Largest Number: " + set1.lower(set1.last()));
			 
			 System.out.println("Modulas to find out ordering ");
			 System.out.println(1%16);
			 System.out.println(2%16);
			 System.out.println(3%16);
			 System.out.println(10%16);
			 System.out.println(15%16);
			 /*
			  * 
        // Smallest number (first element)
        int smallest = set1.first();

        // Largest number (last element)
        int largest = set1.last();

        // 2nd largest number
        int secondLargest = set1.lower(set1.last());

        // Print the results
        System.out.println("Smallest Number: " + smallest);
        System.out.println("Largest Number: " + largest);
        System.out.println("Second Largest Number: " + secondLargest);
			  * 
			  * 
			  * 
			  * 
			  * 
			  * 
			  */
			
			
		}

}
