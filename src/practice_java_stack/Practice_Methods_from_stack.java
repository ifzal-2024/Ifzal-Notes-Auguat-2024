package practice_java_stack;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class Practice_Methods_from_stack {

	/*
	 * When we use Stack in real time scenario? Web browsers use stacks to manage
	 * browsing historyand forward/backward navigation. In text editors, stacks can
	 * be used for undo and redo operations. (in google chrome or ede click on
	 * History , it will show views 6:33PM on top, 4 :00 pm in the middle 3:00 PM
	 * more bottom--so last one most recent one will be on top 6:33 PM)
	 * 
	 */

	public static void main(String[] args) {
		// The Stack class represents a last-in-first-out (LIFO) stack of objects
		Stack<String> stack = new Stack<>();
		System.out.println("-----add(), push()--addElement()---");
		// add() --> Appends the specified element to the end [Bottom] of this Stack
		stack.add("NY"); // Bottom: We put it First
		stack.add("CT");
		// In stack push is mostly used to add elements instead of add()
		// push() --> Pushes an item onto the top of this stack. This has exactly the
		// same effect as: addElement(item)
		// push() is specific to the Stack class and is the primary method <-- Imp
		// Interview Question
		// used to add elements to a stack in a last-in, first-out (LIFO) order.
		stack.push("MA");
		stack.push("NC");
		stack.push("UT");
		stack.push("MD");
		// addElement() --> Adds the specified component to the end(TOP) of this vector,
		// increasing its size by one.
		// addElements does same thing as add() or push()
		stack.addElement("TX");
		stack.addElement("GA");
		// However, when printing, the stack displays its elements from bottom to top.
		System.out.println(stack);
		
		System.out.println("Total Elements: " + stack.size());
		// The capacity of this vector is increased if its size becomes greater than its
		// capacity.
		System.out.println("Capacity: " + stack.capacity());

		System.out.println("\n------------(add(1,'SC')--------------------");
		stack.add("FL");
		// "NY" remains as the first element, as it was the first item added initially.
		// "SC" is inserted at index 1, making it the second element.
		stack.add(1, "SC");
		stack.addElement("NM");
		stack.push("PA"); // Top: Put last
		System.out.println(stack);
		System.out.println("Total Elements: " + stack.size());
		// The capacity of this vector is increased if its size becomes greater than its
		// capacity.
		// Stack increments by 100% capacity <-------
		System.out.println("Capacity: " + stack.capacity());

		System.out.println("\n-------------contains()-------------------");
		System.out.println(stack.contains("NM"));
		System.out.println(stack.contains("nm"));

		System.out.println("\n------------serach()--------------------");
		// In other places the method is indexOf()
		// search() method from 1 onwards ---> Not from 0
		// Search() do not follow indexing.
		// search()--> Returns the 1-based position where an object is on this stack.
		// this method returns the distance from the top of the stack of the occurrence
		// nearest the top of the stack;
		// the topmost item on the stack is considered to be at distance 1.
		// NY is at the bottom--so last # --> or distance 12
		// PA is at the top --> 1st # or distance 1
		System.out.println("The position of NY is: " + stack.search("NY"));
		System.out.println("The position of PA is: " + stack.search("PA"));
		System.out.println("The position of CT is: " + stack.search("CT"));
		System.out.println("The position of WA is: " + stack.search("WA")); // if Absent, shows -1 in console

		System.out.println("\n--------peek()------pop()----------------");
		// very very important interview question:Difference between push() vs peek() vs
		// pop()
		// peek() --> Looks/Find at the object at the top of this stack
		//(Elements which is Inserted LAst) without removing
		// it from the stack.
		// Follows [LIFO] structure

		System.out.println("Find the element using peek() method: " + stack.peek());

		System.out.println("\n-----------pop()---------------------");
		// pop() --> Removes the object at the top of this stack and returns that object
		// as the value of this function.
		// Removes that element totally.
		System.out.println("The 1st pop: " + stack.pop());
		System.out.println("After pop(): " + stack);
		System.out.println("Find the element using peek() method after pop(): " + stack.peek());
		System.out.println("After peek(): " + stack);
		System.out.println(" 2nd pop: " + stack.pop());
		System.out.println("After 2nd pop(): " + stack);

		System.out.println("\n-----------pop()-vs remove()--------------------");
		// question: pop() vs remove(5)
		// pop() removes the topmost element.
		// Removes the element at the specified position in this Vector.
		// 0= the element which was added 1st and located at the bottom.
		System.out.println("Who is removed from stack? Ans: " + stack.remove(0));
		//System.out.println(stack);
		// AFter removing NY, SC becomes 0, CT =1, MA=2, NC=3
		// Remember compiler executing line by line. 
		System.out.println("Who is removed from stack? Ans: " + stack.remove(3));
		System.out.println(stack);

		System.out.println("\n------------empty()--------------------");
		// empty() --> Tests if this stack is empty.
		System.out.println("Is this stack empty? Ans: " + stack.empty());

		System.out.println("\n-----------while(!stck.empty())---------------------");
		// not empty
		// This method will keep removing elements
		// while stack is not empty= keep removing.
		// It will keep removing untill there is no element.
		while (!stack.empty()) {
			stack.pop();
		// System.out.println(stack); // Becuase this syso inside the condition
		 // it will show line by line code while its deleting.
		}
		System.out.println("Is this stack empty Now? Ans: " + stack.empty());
		System.out.println(stack); // outisde condition , so it will show the final value after pop()

		System.out.println("\n-----------stack.peek().equalsIgnoreCase---------------------");
		// pushing element again in the stack
		stack.push("CA"); // Bottom
		stack.push("MN");
		stack.push("NJ");
		stack.push("MN"); // Top
		// Duplicate allowed

		System.out.println(stack);

		if (stack.peek().equalsIgnoreCase("mN")) {
			// This line is extra for creativity ...peek the last element inserted ( top Most ), 
			//.equalsIgnoreCase("mN")= if you find
			// something which is mN ignoring case , Then pop it
			System.out.println("Who is popping? Ans: " + stack.pop());
		} 
		System.out.println(stack);

		System.out.println("\n------- Accessing the elements of the specified Stack by using Iterator-------");
		// Prints in Regular order 1st , then next.
		//Prints 1st element which entered 1st
		// Then checks has Next ---> Print Next.
		Iterator<String> iterator = stack.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println(
				"\n------------- Accessing the elements of the specified Stack by using ListIterator -------------");

		ListIterator<String> listIterator = stack.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

		System.out.println("\n------------- Using other method of ListIterator -------------");
		// Prints in reverse order because we are using has previous
		// Prints Top element (last element inserted-LIFO)
		// checks has previous = Yes, Print previous.
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}

		// Stack is important for interview question: specially 4 methods: push(),
		// peek(), pop(), remove()
		// Interview question from [ArrayList + LinkedList] or [Stack + Queue]

	}

}
