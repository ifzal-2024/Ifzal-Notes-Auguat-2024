package practice_java_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Prcatice_Set_04_hashSet_linkedHashSet_treeSet {

	// Important to understand and for interview
	// This class is created to see comparison of hashset, linkedHashSet and treeSet
	public static void main(String[] args) {
		/*
		 * A Set is a generic set of values with no duplicate elements. Set is a parent
		 * interface of all set classes like TreeSet, HashSet, LinkedHashSet etc. means:
		 * TreeSet, HashSet, LinkedHashSet etc implements Set
		 * 
		 * A HashSet is a set where the elements are not sorted [not in ascending] or
		 * ordered. Follow hashing. It is faster than a TreeSet.
		 * 
		 * A TreeSet is a set where the elements are sorted. ascending to descending
		 * order
		 * 
		 * The LinkedHashSet is an ordered version of HashSet that maintains a
		 * doubly-linked List across all elements. When the iteration order is needed to
		 * be maintained this class is used.
		 * 
		 * When iterating through a HashSet the order is unpredictable, while a
		 * LinkedHashSet lets us iterate through the elements in the order in which they
		 * were inserted.
		 * 
		 * When cycling through LinkedHashSet using an iterator, the elements will be
		 * returned in the order in which they were inserted.
		 */

		System.out.println("\n-- Generic <String> type ----HashSet ----TreeSet ----Comparison-----");
		// HashSet class implements Set Interface
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Bradley");
		hashSet.add("Katie");
		hashSet.add("Brad");
		hashSet.add("Amy");
		hashSet.add("Ryan");
		hashSet.add("Jamie");
		hashSet.add("Kevin");
		hashSet.add("David");
		System.out.println("HashSet = " + hashSet);

		// TreeSet class implements Set Interface
		// new TreeSet<>(hashSet) Copies and Sorts hashSet:
		//By passing hashSet into the TreeSet constructor, you’re telling Java to 
		// copy all the elements from hashSet into the new TreeSet called ts.
		//During this copying process, TreeSet automatically sorts the elements alphabetically.
		Set<String> ts = new TreeSet<>(hashSet);
		System.out.println("TreeSet = " + ts);
		// We can see Treeset is sorted alphabetically [ascending order]
		
		
		System.out.println("\n-- Generic <String> type ----LinkedHashHashSet ---TreeSet ----Comparison----");
		// LinkedHashSet class implements Set Interface
		Set<String> linkedHashSet1 = new LinkedHashSet<>(); 
		// See the insertion order
		linkedHashSet1.add("Bradley");
		linkedHashSet1.add("Katie");
		linkedHashSet1.add("Brad");
		linkedHashSet1.add("Amy");
		linkedHashSet1.add("Amy"); // Duplicated
		linkedHashSet1.add("Ryan");
		linkedHashSet1.add("Jamie");
		linkedHashSet1.add("Kevin");
		linkedHashSet1.add("David");

		System.out.println("LinkedHashSet = " + linkedHashSet1);

		// TreeSet class implements Set Interface
		Set<String> treeSet = new TreeSet<>(linkedHashSet1);
		System.out.println("TreeSet = " + treeSet);

		// Another example with Integer
		System.out.println("\n----------------- Generic <Integer> type -----------------------");
		// Another example of HashSet, LinkedHashSet and TreeSet

		// This is an Array, container also can stay after array name
		int a[] = { 77, 23, 4, 66, 99, 112, 45, 56, 39, 89 };

		System.out.println("\n---------Hashset---TreeSet--------");
		Set<Integer> set = new HashSet<Integer>();
		try {
			for (int i = 0; i < 5; i++) {// starts from element at index 0 i.e 77 and ends to element  index 4 i.e 99
				set.add(a[i]); // Getting data from Array
			}
			System.out.println("HashSet is not Sorted:  " + set);

			TreeSet<Integer> ts1 = new TreeSet<Integer>(set);
			System.out.println("TreeSet is Sorted:  " + ts1);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
System.out.println("\n--------LinkedHashet----Treeset----");
		Set<Integer> linkedHasSet2 = new LinkedHashSet<Integer>();
		try {
			for (int i = 3; i <8; i++) {// starts from element at index 3 i.e.66 and ends in element index 7 i.e. 56
				linkedHasSet2.add(a[i]); // Getting data from Array
			}
			System.out.println("LinkedHashSet is in inserted ordered:  " + linkedHasSet2);

			// Creating treeSet and adding all elements of LinkedHashset
			TreeSet<Integer> ts2 = new TreeSet<Integer>(linkedHasSet2);
			System.out.println("TreeSet is Sorted:  " + ts2);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		System.out.println("\n--------Intentionally created to Throw Exception----");
		Set<Integer> linkedHasSet3 = new LinkedHashSet<Integer>();
		try {
			for (int i = 3; i <=10; i++) {// There is no Index 10
				linkedHasSet3.add(a[i]); // Getting data from Array
			}
			System.out.println("LinkedHashSet is in inserted ordered:  " + linkedHasSet3);

			TreeSet<Integer> ts3 = new TreeSet<Integer>(linkedHasSet3);// Creating 
			System.out.println("TreeSet is Sorted:  " + ts3);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			//n Java, e.getMessage() is a method used to retrieve the detailed message associated 
			//with an exception. The e refers to the exception object that was caught in the catch block.
		}

	}

}
