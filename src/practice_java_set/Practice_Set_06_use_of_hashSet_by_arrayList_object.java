package practice_java_set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.print.attribute.Size2DSyntax;

public class Practice_Set_06_use_of_hashSet_by_arrayList_object {

	// Not necessary
	public static void main(String[] args) { 
		System.out.println("\n---------list1----");
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(5);
		list1.add(15);
		list1.add(25);
		System.out.println("Size of liste1: " + list1.size());
		System.out.println("\n--------list2------");
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(50);
		list2.add(150);
		list2.add(250);
		System.out.println("Size of list2: " + list2.size());

		// Set<ArrayList<Integer>> s=new TreeSet<>(); // java.lang.ClassCastException
		System.out.println("\n-----set s --------------");
		Set<ArrayList<Integer>> s = new HashSet<>();
		// we are adding list1 and list2 in the
		s.add(list1);
		s.add(list2);

		// Ifzals own syso : If you print s --> you will see the outcome
		// Ifzal Check Mutlidimensional Array Notes
		System.out.println("Printing s: " + s);

		// why size = 2? because list1 is one object and list2 is 2nd object
		System.out.println("Size of s : " + s.size());

		System.out.println("\n---Using Nested For each Loop------");
		// Syntax of For Each Loop--> //for (Type element : collection)
		// Type= ArrayList element= single Collection = s
		// Below Nested For each loop and for Loop inside For each Loop
		// single = list1 single = list2
		for (ArrayList single : s) {
			for (int i = 0; i < single.size(); i++) {
				System.out.println(single.get(i));
			}
			// Why its printed List2 and then List1 in The Nested Loop Iteration
			// Because In hashSet - Insertion order of elements is not maintained.
			// System.out.println(single);

		}
	}

}
