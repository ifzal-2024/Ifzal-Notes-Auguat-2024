package practice_java_array;

import java.util.Arrays;

public class Practice_KnowingTheArray {
	public static void main(String[] args) {
		// Generally every value is assigned to a variable name, 
		// but in Array, a set of value present under one name
		String p0 = "Joe Biden";
		String p1 = "Donald Trump";
		String p2 = "Barac Obama";
		String p3 = "Bush Jr";
		String p4 = "Bill Clinton";
		System.out.println(p1);
		System.out.println("--------------------- Regular way above ---------------------");
		
		
		System.out.println("--------------------  Array Below-------------------------------");
		// What is an Array?
		// An array is a collection of items of same data type stored at contiguous memory locations.
		// same data type or a cluster of data present
		// How to write an Array? You must know
		// first data type, then [], 'square bracket' is called container, the 'president' (OBJECT) is the name of Array, 
		// [5] represent total 5 data is present
		// Array is static [fixed number of data], [interview question]
		
		String [] president = new String [5];
		president [0] = "Joe Biden";
		president [1] = "Donald Trump";
		president [2] = "Barac Obama";
		
		president [4] = "Bill Clinton";
		
		System.out.println(president.length);
		System.out.println(president[0]);
		System.out.println(president[1]);
		System.out.println(president[3]);
		System.out.println(president[4]);
		// System.out.println(president[5]); 
		// interview question: What is the exception you got if Array is out of range?
		// Ans: ArrayIndexOutOfBoundsException
		
		// important interview question 100%: length () method vs length property
		// or how can you get the size of a String and an Array?
		// 'length' preserve the size of an array, 'length' is not a method or field or variable,
		// rather length is  property or attribute.
		// length() is a method of String to know the size of a String
		
		// or we can write this way, called "literal representation" of an Array
		System.out.println("\n------------Array Literal Representation-------------");
		String [] presidents = new String [] {"Joe Biden", "Donald Trump", "Barack Obama", "George Bush Jr", "Bill Clinton"};
		System.out.println(presidents.length);
		System.out.println(presidents[1]);
		System.out.println(presidents[4]);
		
		// or	without  new String [] 
		// This is mostly used, 99%
		// here allPresident is called 'Array Name' or 'Array Object'
		System.out.println("\n--------- Without using []-------ShortHandMethod-------Used 99% of Time-----");
		String [] allPresident = {"Joe Biden", "Donald Trump", "Barak Obama", "George Bush Jr", "Bill Clinton", "George Bush Sr"};
		System.out.println(allPresident[2]);
		System.out.println(allPresident.length);
		
		System.out.println("\n---what happens when Print Array directly--below---");
		// How to print an Array?
		// What will happen if you directly print by Array name or array object? Ans: you will get the "Array ID"
		System.out.println(allPresident);
		
		// next line, important interview question: How can you print all the data's from an Array
		// Array vs Arrays, 
		// Array is a collection of items of same data type
		// Arrays is a class which is used to manipulate the Array
		System.out.println("\n--How to print an Array proper way----below--");
		
		// very very important -->  toString(object) method
		// no need to memorize below definition: Just memorize: they surrounded by [], inside data separated by coma
		//	Returns a string representation of the contents of the specified array. The string representation consists 
		// of a list of the array's elements, enclosed in square brackets ("[]"). Adjacent elements are separated by the
		// characters ", " (a comma followed by a space). Elements are converted to strings as by String.valueOf(int). 		
		System.out.println(Arrays.toString(allPresident));
		
		System.out.println("\n-------------------------Char data type Array---------------------");
		char [] gender = {'M', 'M', 'M', 'F', 'M'};
		System.out.println(Arrays.toString(gender));
		
		System.out.println("\n------------------ boolean data type Array -------------------------");
		boolean [] fullTimeStudent = {true, true, false, true, false};
		System.out.println(Arrays.toString(fullTimeStudent));
		
		System.out.println("\n----------------int data type Array ---------------------");
		// Just FYI, brain storming
		int [] b = new int [0]; // 0 elements, no elements there, also called null
		// System.out.println(b[0]); // ArrayIndexOutOfBoundsException
		System.out.println("To Print an Array when size is Null: " + Arrays.toString(b)); // You will find Empty Array
		System.out.println(b.length);
		
		System.out.println("\n- int data type array --int[]age={23,54,12,66,88,23,80,43} ---");
		// other Array example
		int [] age = {23, 54, 12, 66, 88, 23, 80, 43};
		System.out.println(age.length);
		System.out.println(age[3]);
		System.out.println(age[0]);
		// System.out.println(age[8]);  outofBoundary exception
		// System.out.println(age[-1]); outofBoundary exception
		// ArrayIndexOutOfBoundsException
		
		// You can skip below
		System.out.println("\n------------------------------------------------------------------------");
		// NOT IMPORTANT
		System.out.println("\nPrinting Array ID: " + age); // Array ID
		// NOT IMPORTANT
		System.out.println("\nPrinting hashCode of the Array, represented by data: " + Arrays.hashCode(age));
		// hashCode of the Array used for representation of array by data	
		// java.util.Arrays Class --> This class contains various methods for manipulating Array (such as sorting and searching).
		// NOT IMPORTANT
		System.out.println("\nPrinting the index position of the value form the ref: " + Arrays.binarySearch(age, 23)); // which index is 66?
		// here a is the name of the array, 66 is the value checking the index number
		// binary search to get the index position of the value from the ref
		System.out.println("\nPrinting the index position of the value form the ref: " + Arrays.binarySearch(age, 66));
		System.out.println("\nPrinting the index position of the value form the ref: " + Arrays.binarySearch(age, 21)); //TODO WHY -1?
		
	}

	
	
	
}
