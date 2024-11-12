package practice_java_linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Practice_Methods_linkedList_01 {
		public static void main(String[] args) {
		// Below method similar to ArrayList 
		LinkedList<String>ll = new LinkedList<>();
		ll.add("Alex");// index[0]
		ll.add("Michael"); // index [1] 
		ll.add("Jennifer");  // index [2]
		ll.add("Brian");
		ll.add("Alex"); // duplicate value is allowed
		ll.add("Alfred");
		ll.add("Jeff");
		ll.add(null); // Null is also allowed
		ll.add(null);
		
		System.out.println("-----------size() and get()-----------");
		// size() --> Returns the number of elements in this list.
		System.out.println("The size of the LinkedList is: " + ll.size());
		// get() --> Returns the element at the specified position in this list.
		System.out.println("Printing single index value of LinkedList: " + ll.get(0));
		System.out.println("Printing single index value of LinkedList: " + ll.get(1));
			
		System.out.println(ll);
		
		
		
		System.out.println("\n---new Methods --->addFirst(),--addLast()--getFirst()--getLast()---");
		// Below New Methods which were not in ArrayList
		// addFirst(E element) --> Inserts the specified element at the beginning of this list.
		ll.addFirst("Clinton"); // new here
		// addLast(E element) --> Appends the specified element to the end of this list.
		ll.addLast("Obama"); // new here
		
		// getFirst() --> Returns the first element in this list.
		System.out.println("Printing first index value of LinkedList: " + ll.getFirst());
		// getLast() --> Returns the last element in this list.
		System.out.println("Printing last index value of LinkedList: " + ll.getLast()); // alternate: ll.get(ll.size()-1)
		
		System.out.println(ll);
		
		System.out.println("\n---- add(0,'jimmy')--------add(3,'Nanacy')-------------");
		ll.add(0, "Jimmy"); // add Jimmy at 0
		ll.add(3, "Nancy"); // add Nance at 3
		// When you add Jimmy at 0, Clinton and other elements will shift to right
		// Clinton will become 1 from 0
		System.out.println("After using add(index, value) value at 0: " + ll.get(0));
		System.out.println("After using add(index, value) value at 1: " + ll.get(1));
		System.out.println("After using add(index, value): value at 3" + ll.get(3));
		System.out.println("After using add(index, value) value at 4: " + ll.get(4));
		System.out.println(ll);
		
		System.out.println("\n-------peek()--------------");
		// peek() --> Retrieves, but does not remove, the head (first element) of this list.
		System.out.println("Peeking first index value of LinkedList: " + ll.peek()); // very rare to use
		
		System.out.println("\n========= Iterator ==========");
		Iterator<String> iterator = ll.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\n------------indexOf()--------------------");
		// indexOf(Object o) --> Returns the index of the first occurrence of the specified
		//elementin this list, or -1 if this list does not contain the element. 
		System.out.println(ll.indexOf("Alex"));
		System.out.println(ll.indexOf("Brian"));
		System.out.println(ll.indexOf("Mrian")); // -1
		
		// New: we can also use listIterator
		System.out.println("\n========= ListIterator ==========");
		ListIterator< String>listIterator = ll.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		System.out.println("\n--------set()-----------remove()----------");		
		// set(int index, E element) --> Replaces the element at the specified position in this 
		//list with the specified element.
		ll.set(1, "Trump");// new here, replacing the value from second (Removed Clinton and Inserted Trump at 1)
		
		// remove(int index) --> Removes the element at the specified position in this list. Shifts any 
		//subsequent elements to the left 
		ll.remove(3);  //removing third index
				
		System.out.println("Printing first index value of LinkedList: " + ll.get(0));
		System.out.println("Printing last index value of LinkedList: " + ll.get(ll.size()-1)); // last index
		System.out.println("Printing index value of LinkedList: " + ll.get(1));
		System.out.println("Printing index value of LinkedList: " + ll.get(2));
		System.out.println("Printing index value of LinkedList: " + ll.get(3));
		System.out.println("Printing index value of LinkedList: " + ll.get(4));
		System.out.println(ll);
		
		System.out.println("\n--------------contains()---------------");
		// contains(Object o) --> Returns true if this list contains the specified element.
		System.out.println(ll.contains("Obama"));
		
		// New
		System.out.println("\n----removeFirst()-----removeLast()------");
		// removeFirst() --> Removes and returns the first element from this list.
		ll.removeFirst();
		
		// removeLast() --> Removes and returns the last element from this list.
		ll.removeLast();
		System.out.println("Printing first index value of LinkedList: " + ll.get(0));
		System.out.println("Printing second index value of LinkedList: " + ll.get(1));
		System.out.println("Printing last index value of LinkedList: " + ll.get(ll.size()-1));
		System.out.println("Printing second last index value of LinkedList: " + ll.get(ll.size()-2));
		System.out.println(ll);

		System.out.println("\n-------isEmpty()---------");
		System.out.println(ll.isEmpty());
		
		System.out.println("\n-------addAll()---------------");
		LinkedList<String> ll2 = new LinkedList<String>();
		ll2.add("Adam");
		ll2.add("Bob");
		ll2.add("Cindy"); 
		ll2.add("David");
		System.out.println(ll2);
		// addAll(Collection c) --> Appends all of the elements in the specified collection to the end of this list, 
		//in the order that they are returned by the specifiedcollection's iterator. 
		// will add elements of ll2 to ll towards the end Right hand side.
		ll.addAll(ll2);
		System.out.println("In ll after using addAll():" + ll);
		
		ll.addAll(3, ll2);
		// will add elelmets of ll2 to ll at position 3
		System.out.println("In ll after using addAll() in a specific index at 3:" + ll);
		
		System.out.println("\n---------removeAll()-------------");
		// removeAll(Collection<?> c) --> Removes all of this collection's elements that are also contained
		// ****something new: any element is common with both lists belonging to ll2 also removed
		//Removed Adam, Bob, Cindy, David from poisiton 3 and also from the end
		ll.removeAll(ll2); 
		System.out.println(ll);
		
		 
		
		/*
		// Possible, but we are not running it .... 
		 * If you want to remove later you can. It will remove The whole content of List.
		 * other method clear() do the same function and is faster
		ll.removeAll(ll); 
		System.out.println(ll);
		*/
		
		
		System.out.println("\n------clear()----------------");
		// clear() --> Removes all of the elements from this list.The list will be empty after this call returns.
		ll.clear();
		System.out.println(ll);
		
		// sort() sort in ascending order, and can't decide about null
		// sort() method don't work with null value, will show error if there is null value
		
		
	}


}
