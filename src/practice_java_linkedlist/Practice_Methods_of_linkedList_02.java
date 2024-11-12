package practice_java_linkedlist;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Practice_Methods_of_linkedList_02 {
	public static void main(String[] args) {
		// Raw --> Heterogeneous
		// can add values of different  data types.
		LinkedList link = new LinkedList();
		link.add(5);
		link.add(5.5);
		link.add("Sohag");
		link.add("Sohag"); // duplicate value is allowed
		System.out.println(link);

		System.out.println("\n--------Integer Type (Integer is Object) Wrapper Class------");
		// Homogeneous
		// Generic --> Integer
		LinkedList<Integer> ll1 = new LinkedList<Integer>();
		ll1.add(845);
		ll1.add(483);
		ll1.add(789);
		ll1.add(435);
		ll1.add(789); // duplicate value is allowed
		ll1.addFirst(308);
		ll1.addLast(310);
		ll1.set(0, 307); // replacing index 0
		ll1.remove(3); // removing index 3
		ll1.removeFirst();
		ll1.removeLast();
		System.out.println(ll1);
		
		System.out.println("\n---------------- sorting ----------------");
		//sort() don't work when there is null value
		// sort() in ascending order from small to big. A to Z
		// Collections(plural with s) = class 
		Collections.sort(ll1);
		System.out.println(ll1);
		
		
		System.out.println("\n---------------- after cloning ----------------");
		// high level ( Just for Understanding, No need to Remember)
		// ll2 became clone of ll1 
		//ll2 now will have all elements which are in ll1
		LinkedList<Integer>ll2 = (LinkedList<Integer>) ll1.clone();
		System.out.println(ll2);
		ll2.addFirst(83);
		ll2.addLast(89);// will be at the last
		ll2.add(35);// when you add this, now it will be the last element.
		System.out.println(ll2);

		// very high level, keep the code, but no need to get it  
		System.out.println("\n------------Lambda Expression-------------------");
		// asList() convert an Array to an ArrayList
		List<Integer> numbers = Arrays.asList(10, 12, 63, 14, 52, 26);
		numbers.forEach(System.out::println);//<-- lambda expression
		// the :: operator denotes you will be invoking the println method with a parameter, which name you don't specify explicitly:
		// forEach Performs the given action for each element of the Iterable until all elements have been processed or
		// the action throws an exception.
		// Java8 Loop
		// lambda expression

		

	}


}
