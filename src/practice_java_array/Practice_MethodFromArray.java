package practice_java_array;

import java.util.Arrays;

public class Practice_MethodFromArray {
	public static void main(String[] args) {
		int[] a = { 15, 34, 59, 5, 28, 12 };
		// Que: how can you find the first member from the above array?
		System.out.println("First index value: " + a[0]);
		// Que: how can you find the last member from an array?
		// a.length = 6-->  a[6-1]-->  a[5] = 12
		System.out.println("Last index value: " + a[a.length-1]);
		// Que: how can you find the second last member from an array? Interview question
		System.out.println("Second Last index value: " + a[a.length-2]);
		// Que: how can you find the third last member from an array?
		System.out.println("3rd Last index value: " + a[a.length-3]);
		
		System.out.println("\n----------------------- Use of sort() ---------------------------------");
		System.out.println("Before sort of the Array: " + Arrays.toString(a));
		Arrays.sort(a); // ****interview question***
		// Descending means from top (big) to Bottom(small)
		// Acending --> Climbing up from small to big
		// sort() method sorts the specified array of bytes into ascending [smaller to bigger] numerical order.
		System.out.println("After sort of the Array: " + Arrays.toString(a));
		
		System.out.println("\n----------How to find Smallest and biggest value---------");
		// How to find the smallest and largest number from an Array?
		// Answer: First sort the Array by Arrays.sort(a);, then a[0]=smallest, a[a.length-1]=largest
		// The interviewer don't like this answer
		Arrays.sort(a);
		System.out.println("Smallest value of Array is: " + a[0]);
		System.out.println("Largest value of Array is: " + a[a.length - 1]);
		
		
		System.out.println("\n--------------For Loop------------");
		// A regular for loop, no relation with Array, String or ArrayList or something
		for(int i=0; i<5; i++) {
			System.out.println(i);
		}
		
		// How can you run a for loop in an Array?
		// ****Printing Value of all index, one by one****
		int [] b = { 15, 34, 59, 5, 28, 12 };
		// here b is the Array Object [or Array name]
		System.out.println("\n------------- Accessing the elements of the specified array by using the for loop -------------");
		for(int i = 0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		
		System.out.println("\n------------- Decremental block is used when get value from last -------------");
		//This loop iterates over the array b from the last element to the first and prints each element in reverse order. 
		//	It starts at b.length - 1 and goes down to 0.

		for(int i = b.length-1; i>=0; i-- ) {
			System.out.println(b[i]);
		}
		
		// It is also possible to use while loop, do while loop
		// ******but for loop and for each loop is mostly used****
		
		// new and you must know
		// for each loop/ enhanced for loop / advanced for loop
		// In Java, the for-each loop is used to iterate [travel] through elements of Array and collections (like ArrayList).
		// Can't be used without Array or ArrayList or LinkedList etc
		System.out.println("\n------------- Accessing the elements of the specified array by using for each loop -------------");
		// here, "i" is the name of the for each loop, and "b" is the name of the array
		// Rule: first data type, then name of the for each loop, then : , then name of the array need to iterate
		for (int i :b) {
			System.out.println(i);
		}
	
	}

	

}
