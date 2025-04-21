package practice_java_array;

import java.util.Arrays;

public class Practice_OtherMethodsFromArray {
	public static void main(String[] args) {
		int[] a = { 5, 15, 50, 0, 0, 56 };
		// Array is fixed size (Array is static)
		// ***When we create an array in Java, its size is fixed and cannot be changed
		// after its Initialized.
		// This gives the array a “Static nature” in term of its size. ( static means
		// cannot be changed)

		System.out.println("Before update, the value of a[0] is: " + a[0]);
		System.out.println("To find the list of an Array: " + Arrays.toString(a));
		System.out.println("The length: " + a.length);

		System.out.println("\n------Assigning New Value----1st Update---------------");
		// *****The contents of the array are dynamic, meaning you can change the values
		// stored at each index,
		// but the number of elements(the array size) is static.
		// *** New: How to update an existing Array?
		// Or: How to update an existing index of an Array?
		// When you update --> You are assigning a new value at that index, so it will
		// replace the old value with New Value.
		// Updating won't affect other elements indexing.
		a[0] = 33;
		System.out.println("After update, the value of a[0] is: " + a[0]);
		System.out.println("After Update to find the list of an Array: " + Arrays.toString(a));
		System.out.println("The length: " + a.length);

		System.out.println("\n----------------------2nd Update----------------------");
		// How many times we can update: As many time as we want
		a[0] = 75;
		System.out.println("After second update, the value of a[0] is: " + a[0]);
		System.out.println("After Update to find the list of Array a : " + Arrays.toString(a));
		System.out.println("The length: " + a.length);

		System.out.println("\n---------------Update any Index-------------------------------------");
		// you can update any index
		a[0] = 25;
		a[1] = 39;
		a[4] = 76;
		// a[8] = 99; // no compilation error, but run time error. Nothing outside
		// at index a[8]
		// java.lang.ArrayIndexOutOfBoundsException
		System.out.println("After update, the value of a[0] is: " + a[0]); // final output:?
		System.out.println("After update, the value of a[0] is: " + a[1]); // final output:?
		System.out.println("After update, the value of a[0] is: " + a[4]); // final output:?
		System.out.println("To find the list of an Array a: " + Arrays.toString(a));
		System.out.println("The length of array a: " + a.length);

		System.out.println("\n----- Increasing the length of an Array by Copying another array -----");
		System.out.println("--------int[]b=Arrays.copyOf(a,10)-----------------------");
		// Array is fixed in size (Array is static) -- talking about an array
		// ****how can we increase the length of an Array by keeping the previous Array?
		// [Important]:
		// Arrays.copyOf(original array, new length)
		// here, in line 47, new Array name is b, copying Array a, with a new size 10
		int[] b = Arrays.copyOf(a, 10);
		// Is the length changed?
		// line 40 is for line 50 comparison (length for a vs length for b)
		System.out.println("\nThe length of the new array b is: " + b.length);
		System.out.println("To find the list of an Array b: " + Arrays.toString(b));

		System.out.println("\n--------------- Updating value of index of Array b -----------------");
		b[2] = 27;

		b[5] = 99;
		b[6] = 60;
		b[7] = 65;
		b[8] = 68;
		// why output for b[0]: 25? Ans: because we did not change value of b[0]
		System.out.println("Single index value for new Array: " + b[0]);
		//Below output: how it happen? 27 // because updated the value 
		System.out.println("Single index value for new Array b[2]: " + b[2]);
		System.out.println("Single index value for new Array b[5]: " + b[5]);// output: 99
		System.out.println("Single index value for new Array b[7]: " + b[7]);// output: 65
		System.out.println("Single index value for new Array: " + b[9]);// output: ? 0
		System.out.println(" After update of index value List of Array b: " + Arrays.toString(b));

		System.out.println("\n------------int[]c= Arrays.copyOf(b,12)--------------");
		// increasing the size of Array can be done several times
		// Array name is c
		int[] c = Arrays.copyOf(b, 12); // Array vS Arrays, Arrays is a class is used to manipulate the Array
		System.out.println("The length of the new array is: " + c.length);
		System.out.println("Single index value for new Array: " + c[0]);// why output is: 25?
		System.out.println("Single index value for new Array: " + c[11]);// output: ? 0
		System.out.println("The list of the array's elements of Array c: " + Arrays.toString(c));

		// New --> if you need a selected part from the previous/existing Array [above
		// one is more important]
		System.out.println("\n---Copying Specific Range ----int[]d--Arrays.copyOfRange(c,2,10)------");
		int[] d = Arrays.copyOfRange(c, 2, 10);
		// if you need to decrease an Array or a specific size from the old Array to
		// copy the specific range of the old array
		// from which index to what index (range)// here 2 is starting index and 10 is
		// till that index, so last index is 9th as [end index-1] formula is used
		// 10 th index will be --> (end index-1)= 10-1= 9
		// In reality wehn it prints 10 th index will be infact 9th index.
		// Parameters:
		// 1) original: the array from which a range is to be copied
		// 2) from: the initial index of the range to be copied, inclusive
		// 3) to: the final index of the range to be copied, exclusive.(This index may
		// lie outside the array. 10-1)

		System.out.println("\nThe length of the array d: " + d.length);
		System.out.println("After update, The list of the array's [d] elements:" + Arrays.toString(d));

		// Important and high level
		System.out.println("\n----------equals() to compare 2 arrays--------------");
		/*
		 * Arrays.equals(arr1, arr3);--->returns true if the two specified arrays of
		 * booleans are equal to one another. Two arrays are equal if they contain the
		 * same elements in the same order. Good to know: Two array references are
		 * considered equal if both are null.
		 */

		System.out.println("------------- equals to compre 2 arrays m and n----");
		// It returns true if both arrays are of the same length
		// and all corresponding pairs of elements in the two arrays are equal(same),
		// otherwise it returns false.
		int[] m = { 1, 2, 3 };
		int[] n = { 1, 2, 3 };
		System.out.println("Is Array m and n  equal? Ans: " + Arrays.equals(m, n));
		
		System.out.println("\n---comparing array a and d ---");
		System.out.println("Arra a: " + Arrays.toString(a));
		System.out.println("Array d: " + Arrays.toString(d));

		// How to compare two Array? here a and d.
		System.out.println("Is Array a and d is equal? Ans: " + Arrays.equals(a, d));

		System.out.println("\n--- Arrays.equal() when comparing String type----");
		// Arrays.equals() is case-sensitive when comparing arrays of objects like
		// String[].
		// This is because it uses the .equals() method of the objects to check for
		// equality,
		// and String.equals() is case-sensitive.
		String[] o = { "Hello", "World" };
		String[] p = { "hello", "world" };
		System.out.println("Is Array o and p  equal? Ans: " + Arrays.equals(o, p));
		
		String[] q = { "Hello", "World" };
		String[] r = { "Hello", "World" };
		System.out.println("Is Array q and r  equal? Ans: " + Arrays.equals(q, r));

		System.out.println("------- compare ax and ay array ---------------");
		// Another example which is String type
		String[] ax = new String[] { "First", "Second", "Third", "Fourth", "Fifth" };
		System.out.println("The list of the array's [ax] elements: " + Arrays.toString(ax));
		// Literal representation of an String type Array, line 107 is the best
		// representation of an Array

		String[] ay = { "First", "Second", "Third", "Fourth", "Fifth" };
		System.out.println("The list of the array's [ay] elements: " + Arrays.toString(ay));
		System.out.println("Is Array ax and ay is equal? Ans: " + Arrays.equals(ax, ay));

	
		System.out.println("\n------------Arrays.fill()-------------");
		// Not important
		System.out.println("Arra a: " + Arrays.toString(a));
		Arrays.fill(a, 300); // --->to fill the all the value as same, so all value will be changed to 300
								// here
		System.out.println("After update, the value of Array a is: " + Arrays.toString(a));
		System.out.println("Array m: "+ Arrays.toString(m));
		Arrays.fill(m, 1979);
		System.out.println("After update, the value of Array m is: " + Arrays.toString(m));

	}

}
