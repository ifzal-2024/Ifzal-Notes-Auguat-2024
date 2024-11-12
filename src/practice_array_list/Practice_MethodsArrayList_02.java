package practice_array_list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;



public class Practice_MethodsArrayList_02 {
	public static void main(String[] args) {
		// We instantiatiating List Interface by using ArrayList class. ArrayList is concrete class.
		// We use <> when its Generic ( Same data Type)
		// left side we use <String>... but in right side we don't need to add String inside<> 
		// Java automatically knows.
		List<String>list = new ArrayList<>();
		// We can also  use below line too either top one or below one
		//ArrayList<String>list=new ArrayList<>();
		list.add("Georgia");
		// add(int index, E element) --> Inserts the specified element at the specified position in this list. 
		// Shifts the element currently at that position (if any) and 
		//any subsequent elements to the right (adds one to their indices).
		list.add(0, "New York");
		list.add("Montana");
		list.add(2, "California"); // We assigned ''California" in index 2
		//If You run now  Output -->[ New York, Georgia, California, Montana]
		list.add(4, "Alabama"); // We assigned ''Alabama" in index 4
		list.add(4, "Maine");
		//if we run now --> [New York, Georgia, California, Montana, Maine, Alabama]--> Alabama is shifted to right
		list.add(4, "Delaware"); // Who will come to the index 4?
		//if we run now --> [New York, Georgia, California, Montana,Delaware, Maine, Alabama]
		// Does not matter who was at 4 before, the one who declares at last will take the position and other will shift right
		list.add(null);
		list.add( 4, null); // duplicate allowed
		list.add(0, "Florida");
		//https://learn.saylor.org/mod/book/view.php?id=26829&chapterid=3027#:~:text=An%20ArrayList%20element%20can%20be,contain%20a%20null%20with%20null%20.&text=The%20cells%20that%20contain%20null,the%20size%20of%20the%20list.
	System.out.println("\n---------------- List ----------------");
		System.out.println("Size of List: " + list.size());		
		System.out.println("---remember compiler executes line by line-----");
		// add this --> Mr Ifzal run and check, add 4 to this position--> Mr Ifzal-->  run and check---> doing line by line
		System.out.println(list);
		
		System.out.println("\n ----------------- for each loop --------------------");
		for(String i : list) {
			System.out.println(i);
		}
		
		// ***Important interview question: 3 methods
		//  Iterator has 3 methods:  hasNext(),next(),remove()				
		System.out.println("\n-- Accessing the elements of the specified arrayList by using Iterator ---");
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// ***Important interview question: 9 methods
		// ListIteratorhas 9 Methods:  hasNext(),next(), hasPrevious(), previous(),  previousIndex(),
        //nextIndex(), add(), remove(),set(),*********
		// To print all data, we can use any kind of loop, Iterator or ListIterator
		System.out.println("\n-- Accessing the elements of the specified arrayList by using ListIterator ---");
		ListIterator listIterator = list.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		System.out.println("\n------------indexOf() -- Case Sensitive-----------");
		// Use of indexOf(), Returns the index of the first occurrence of the specified element in this list, 
		// or -1 if this list does not contain the element. 
		System.out.println(list.indexOf("Montana"));
		System.out.println(list.indexOf("montana")); // Case sensitive
		
		System.out.println("\n-------------New ArrayList  arrayList-----------");
		// Use of addAll()
		ArrayList <String> arrayList = new ArrayList<>();
		arrayList.add("Hawaii");
		arrayList.add("Alaska");
		arrayList.add("Washington");
		
		System.out.println("-------Method--from Collection---addAll(arrayList)------------");
		// How can we get the content of one ArrayList inside Another one
		// addAll() --> Appends all of the elements in the specified collection to the end of this list, 
		//in the order that they are returned by the specified collection's Iterator.
		// 'list' object from line 14
		System.out.println("Before addAll Araylist in List:--> "+list);
		System.out.println("Before addAll Size of List: " + list.size());	
		list.addAll(arrayList);
		// applied addAll() in list []-->now list object have the content of the arrrayList object
		System.out.println("After add all Array List Size: " + list.size());
		System.out.println("After using addAll method the new Array List: \n" + list);

		System.out.println("\n-------------Method ---from Collection--addAll(Specific Position)--------------");
		// addAll(int index, Collection c) --> Inserts all of the elements in the specified collection 
		//into this list at the specified position (optional operation). 
		//Shifts the element currently at that position (if any) and any subsequent elements to the right (increases their indices). 
		System.out.println("Before addAll(Specfic Position) Araylist in List:--> "+list);
		list.addAll(3, arrayList);
		System.out.println("After addAll(specific Position) Size: "+ list.size());
		System.out.println("After using addAll method Specific Position the new Array List: \n" + list);
		
		System.out.println("\n-----Method -----removeAll()---------from Collection-------");
		// use of removeAll() method
		// removeAll(Collection c) --> Removes from this list all of its elements that are contained in the specified collection.
		// ****something new: any element is common with both lists belonging to ArrayList also removed
		// Removed   Hawaii , Alaska, Washington from position 3, 
		// Also Removed   Hawai , Alaska, Washington at the end too.
		System.out.println("Before  remove Size : " + list.size());	
		list.removeAll(arrayList);
		System.out.println("After using removeAll method the new Array List: \n" + list);
		System.out.println("After remove Size : " + list.size());
		
		
		/*
		// Possible, but we are not running it .... 
		 * If you want to remove later you can. It will remove The whole content of List.
		 * other method clear() do the same function and is faster
		list.removeAll(list); 
		System.out.println(list);
		*/
		
		System.out.println("\n--------------set()------------------");
		// set(int index, E element) --> Replaces the element at the specified position in this list with the specified element.
		// When we use set() --> Replace ---It adds new element and removes the current element.
		
		list.set(1, "New Jersey"); // important interview question
		System.out.println(list.size());
		System.out.println(list);
		
		System.out.println("\n-------------add()-------------------");
		// When we use add () --> adds new element and shifts right the exisitng elements.
		list.add(1, "Nevada");
		System.out.println(list.size());
		System.out.println(list);
		
		System.out.println("\n-------------remove() -----------Just 1 element at the specified index--------");
		// remove() --> Removes the element at the specified position in this list. Shifts any subsequent elements to the left   (subtracts one from their indices).
		list.remove(2); // Remove the index number 2
		System.out.println("After Removing element index 2 list: "+ list);
		list.remove(5); // we made mistake
		System.out.println("After Removing element index 5 list: "+ list);
		
		System.out.println("\n---------------contains()-----Case Sensitive------------");
		// contains() --> Returns true if this list contains the specified element. 
		// More formally, returns true if and only if this list contains at least one element
		System.out.println(list.contains("Cauliflower"));
		System.out.println(list.contains("California"));
		System.out.println(list.contains("california"));
		
		System.out.println("\n--------- Testing if else condition ---Real Life Coding---");
		// if the list contain California, then replace index 3 with Texas, otherwise keep same
		if (list.contains("California")) {
			list.set(3, "Texas");
			System.out.println(list);
		} else {
			System.out.println("Keep same");
		}
		
		System.out.println("\n------- To reverse the ArrayList ----We need to use Collection Class-----");
		System.out.println("Original list: " + list); 
		// Similar like we use Arrays.toString..... For Reverse we use Collections.reverse(list) 
		// Collections is a Class --> java.util.Collections;
		Collections.reverse(list);
		System.out.println("Reversed list: " + list); 
		
		System.out.println("\n--------------------------------");
		// use of retainAll()--> only keeps common value between two ArrayList obj
		ArrayList<String> al = new ArrayList<>(); // creating new ArrayList
		al.add("New York"); // -------this is common
		al.add("Nevada");
		al.add("Alabama"); // Case sensitive
		al.add("Hawaii"); 
		al.add("Texas"); 
		al.add("Georgia"); 
		System.out.println(al);
		
		System.out.println("\n-----------retainAll()---------------------");
		// applying retainAll() below, which will keep the common elements from two lists
		// Retains only the elements in this list that are contained in the specified collection.
		//In other words, removes from this list all of its elements that are not contained in the specified collection.
		// Will Print elements which are common in both Lists--> al and list
		System.out.println("Content of List:  " + list); 
		System.out.println("Content of al:  " + al); 
		//Below will change list elements
		list.retainAll(al);	
		System.out.println(list.size());
		System.out.println("After retaiAll The al will stay same al :"+ al );
		System.out.println("After using retainAll method the new Array List: \n" + list);
		
		
		System.out.println("\n------------- Use of sort() -----Collections.sort()--------");
		// important // sort() 
		// important information
		// list.add(null); // if null is present, sorting not possible, if you need to sort, avoid null
		// Collections.sort(List<String> list) -->
        // Sorts the specified list into ascending order, according to the natural ordering of its elements. 
		System.out.println("Before sort: " + list);
		// Sorting ArrayList in ascending Order (small to Big)(alphabetic order)
        // using Collection.sort() method 
        Collections.sort(list); // Arrays.sort() for sorting Array, important interview question
        // Print the sorted ArrayList 
        System.out.println("Sorted ArrayList in Ascending order : " + list); 
        
        System.out.println("\n---------- Iam testing if list is empty----------");
        // I am Ifzal testing below // If List Empty will say True or it will return False.
        // We know list has elements
        System.out.println("Is list Empty?: "+ list.isEmpty() );
        
        System.out.println("\n--------------- new and tough and not important-----------------");
        System.out.println("-----Reverse from Big to small---Collections.reverseOrder()---- ");
        //Collections.reverse(list);
        //System.out.println(list);
        // Printed in descending Order--> from Big to Small 
        Collections.sort(list, Collections.reverseOrder());
		System.out.println("Sorted list in descending order: " + list);
		
		System.out.println("\n------------- Use of clear() -------------");
		System.out.println("Before Clear: " + list);
		// clear() --> Removes all of the elements from this list. 
		//The list will be empty after this call returns.
		list.clear();
		System.out.println("After Clear: " + list);
		// Interview question: clear() vs removeAll();
		// clear() is more faster
		
		System.out.println("\n--------I am Testing If List is Empty-------");
		//Below will return True because List is empty
		System.out.println("Checking if List is Empty? "+ list.isEmpty());
		
		System.out.println("\n------------- Use of isEmpty() ------Real Life Coding-------");
		// isEmpty() --> Returns true if this list contains no elements.
		// Below if not empty , Print Elements of list
		if(!(list.isEmpty())) {
			// used for each loop
			for(String s: list) {
				System.out.println(s);
			}// Since we cleared everything in previous line
			// It prints List is Empty 
		} else if (list.isEmpty()) {
			System.out.println("List is Empty! No Element there!!");
		}
		
		// add(), get(), size(), Iterator is important from previous page	
		// add(1, "abc"), set (1, "def"), Collections.sort(), remove(3), clear() you get from here

	}


}
