package practice_array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Practice_MethodsArrayList_01 {
	public static void main(String[] args) {
		// how we store data ?
		// in variable
		// In normal way, we just save 1 value at a time.
		System.out.println("-----------Storing one value at  time-----------\n");
		int id1 = 101;
		int id2 = 102;
		// printing variable value
		System.out.println(id1);
		System.out.println(id2);
		

		// in Array we can store unlimited values
		int[] ids = new int[5]; // index 0, 1, 2, 3, 4
		ids[0] = 101;
		ids[1] = 107;
		ids[2] = 108;
		ids[3] = 100;
		ids[4] = 106;
 System.out.println("\n--------------------- Array---------------");
		// size of the array in array
		System.out.println(ids.length);
		// print index value from array
		System.out.println(ids[3]);
		System.out.println(ids[ids.length - 1]); // last index

		System.out.println(ids); // provide Array ID
		System.out.println(Arrays.toString(ids));

		System.out.println("\n --------------ArrayList-----------------\n");
		// List is the Interface. ArrayList is the Class implementing List
		// ArrayList helps Instantiating the List Interface.
		// This below line object 'list' will provide methods of List Interface--> java.util.List;
		// not mandatory  to write below line.Because we will not be using below line
		//will be  used in Next Class.
		List list = new ArrayList();

		// In AarrayList ---> here, creating the obj 'ar'
		// when you create an object --->default constructor is initialized 
		// for Default constructor starts with default Initial  capacity of 10
		//initial capacity (ic) is 10, it means it can store 10 data
		// when  data no 10 added, the capacity is still 10
		// When data no 11 come, then capacity will be increased to [{ic*(3/2)}+1]=16 
		// ArrayList is a class, below yellow warning is coming for not using generic data type <>
		// We are using Mixed datat type.
		// This below line object 'ar' will provide methods of ArrayList Class
		System.out.println("\n--First  instantiate ArrayList Class to get all  methods from java.util.ArrayList");
		//Its madatory to Initialize below Line for Array List.Because we will be using in this class.
		ArrayList ar = new ArrayList();
		// How do we add elements in ArrayList?
		// add() --> Appends the specified element to the end of this list.
		// In ArrayList, Sequence is ordered. 1st elements will get index 0, 2nd element will get index 1
		ar.add("Alex"); // index [0]
		ar.add("Michael"); // index [1]
		ar.add("Jennifer"); // index [2]
		ar.add("Brian");
		ar.add(35); // different data type is allowed, here int is used
		ar.add(false); // boolean type
		ar.add(""); // empty is allowed for String Type
		ar.add("Alex"); // duplicate value is allowed
		ar.add("Alfred");
		ar.add("Jeff");
		ar.add(34.556); // double type
		ar.add('M'); // char type
		
		
		System.out.println("\n---- How to get the size of Array List ?--- ");
		// Checking size of the ArrayList (not the capacity)
		// size() --> Returns the number of elements in this list.
		System.out.println("The size of the ArrayList is: " + ar.size()); // In Array this is "length" properties

		// get() --> Returns the element at the specified position in this list.
		System.out.println("\n----How to get elements at index 0, index 1 , last index etc---");
		System.out.println("-----------we use syso(ar.get(0)) --------------");
		System.out.println("Single index value: " + ar.get(0));
		System.out.println("Single index value: " + ar.get(4));
		System.out.println("Single index value: " + ar.get(6));
		System.out.println("Single index value: " + ar.get(10));
		System.out.println("Last index value: " + ar.get(ar.size() - 1)); // Interview question
		System.out.println("Second Last index value: " + ar.get(ar.size() - 2));
		// System.out.println(ar.get(15)); //  java.lang.IndexOutOfBoundsException

		System.out.println("\n----------How do we print ArrayList -------");
		// Very Simple , by just calling the object // Array List is more felxible.
		//// after Brian 35 false there will be empty space printed because of ar.add("");
		System.out.println("All the value of ArrayList: " + ar); //ArrayList accept all data type

		
		
		// To print all data, we can use any kind of loop
		// But we will use for each loop and Iterator for practice in Collections
		// Also for below, "for each loop" is not possible, as the above object contains mixed type data
		System.out.println("\n------- Accessing the elements of the specified arrayList by using for loop -------");
		// after Brian 35 false there will be empty pace printed because of ar.add("");
		for(int i = 0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		// Iterator is the legacy type. Old system, first loop of Java
		// very very important interview question: Iterator [used for List, Set] vs ListIterator [used only for List]
		System.out.println("\n------------- Accessing the elements of the specified arrayList by using Iterator -------------");
		Iterator iterator = ar.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\n--------------------- More about Capacity Parameterized Constructor -----------");
		// if you call parameterized constructor ---> initial capacity will be what number you are passing in parenthesis
		ArrayList arraylist1 = new ArrayList<>(20); // We fix the Capacity to 20
		// Even we can pass the size of the different ArrayList object as a parameter to fix the capacity
		ArrayList arraylist2 = new ArrayList<>(ar.size());
		
		// add(), get(), size(), Iterator is important from above		
		
		
		
		
		
		
		
	}

}
