package practice_java_vector;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Practice_Methods_from_vector {

	// Vector is a less important topic compared to ArrayList and LinkedList
		// Vector is no longer been used in the industry
		// Stack extends Vector, Stack is important
		// new methods: capacity(), addElement()

		public static void main(String[] args) {
			// Creating object of Vector
			// When we create object with default constructor, Capacity = 10
			Vector<Integer>v = new Vector<Integer>();
			v.add(101);
			v.add(105);
			v.add(100);
			v.add(101);// duplicate is possible
			v.add(10);
			v.add(70);
			v.add(1010);
			v.add(18800);
			v.add(0);
			v.add(1090);

			System.out.println("Capacity: " + v.capacity()); // it was not present in ArrayList and LinkedList
			System.out.println("Total Elements: " + v.size());
			System.out.println("Get first element: " + v.firstElement());
			System.out.println("Get first element: " + v.lastElement());
			System.out.println("Get first element: " + v.get(0));
			System.out.println(v);

			System.out.println("\n--------------iterator------------------");
			// printing all element
			Iterator<Integer> iterator = v.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}

			System.out.println("\n--------------add()------------------");
			// Another Vector
			Vector<Integer> v1 = new Vector<Integer>();
			v1.add(500);
			v1.add(200);
			v1.add(208);

			v.addAll(v1);
			// the capacity of the vector is 10 and it contains 10 elements.
			// If we add one more element to it then the number of elements in the vector
			// will be
			// greater than capacity so during the element insert the capacity is
			// incremented by current size + 10.
			// Vector increments by 100% capacity <---------
			System.out.println("Capacity: " + v.capacity());
			System.out.println("Total Elements: " + v.size());
			System.out.println(v);

			System.out.println("\n-----------addElement()---------");
			// addElement() does the same thing as add()
			v.addElement(1070); // same as add()
			v.addElement(934);

			System.out.println("Capacity: " + v.capacity());
			System.out.println("Total Elements: " + v.size());
			System.out.println(v);

			System.out.println("\n-------------removeAll()----------");
			// to removeAll() you need to pass a collection  e.g: v1
			v.removeAll(v1);
			System.out.println(v);

			System.out.println("\n-----------remove()---------------------");
			// remove used to remove specific element
			v.remove(1);
			v.remove(0);
			v.remove(3);
			v.remove(6);

			System.out.println(v);
			System.out.println("Capacity: " + v.capacity()); // Why the capacity is still 20?
			System.out.println("Total Elements: " + v.size());

			System.out.println("\n--------------sort()------------------");
			// sorting the data
			Collections.sort(v);
			System.out.println(v);
			System.out.println("Lowest: " + v.get(0));
			System.out.println("Highest: " + v.get(v.size() - 1));

			System.out.println("\n------------clear()--------------------");
			v.clear();
			System.out.println(v);

			// Vector implements List
			List<Integer> list = new Vector<>();

		}

	// What you have to know about vector?
	// Summary of Vector: vector implements List, Stack extends Vector <--------- Know this


}
