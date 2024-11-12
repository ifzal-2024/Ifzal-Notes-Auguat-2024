package practice_java_queue;

import java.util.LinkedList;
import java.util.Queue;

/*
 Basically the concept of Queue is FIFO(First In First Out). So accessing the
 particular index or the element in the queue is not possible. The other way
 is, to get a particular element you need to delete it.
 If you need to access elements by index, you want a list, not a queue.
 Example: when we make queue in DMV/Bank/Restaurant --> FIFO(First In First Out)
 */

/*
What are the applications of queues? Job scheduling, Operating systems, message queues, 
task processing, buffering, BFS, etc, are some of the applications of queues.
*/

public class Practice_Methods_of_queue {
	public static void main(String[] args) {
	// Queue is an interface, inherited by class, LinkedList implement Dequeue, Dequeue extends Queue
	// Queue takes help from LinkedList Class
	Queue<String>queue = new LinkedList<>();
	queue.add("SD"); // Head: Come first
	queue.add("NC");
	queue.add("WA");
	queue.add("OR");
	queue.add("FL");
	queue.add("CA"); // Tail: Come last
	System.out.println("\n-------size()-----");
	
	// size() --> Returns the number of elements in this collection
	System.out.println("The number of elements in this Queue: " + queue.size());
	System.out.println(queue);
	
	System.out.println("\n------------peek()--------------------");
	// peek() retrieves or looks at head (The one who entered First)- same like LinkedList.
	// peek() --> Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
	System.out.println("The head of this queue retrieved by peek(): " + queue.peek());
	
	System.out.println("\n-------------element()-------------------");
	// not important
	// element() --> Retrieves, but does not remove, the head of this queue. This method differs
	// from peek only in that it throws an exception if this queue is empty.
	System.out.println("The head of this queue retrieved by element(): " + queue.element()); // Why SD? got it?

	System.out.println("\n----------poll()----------------------");
	// poll() --> Retrieves and removes the head of this queue,or returns null if this queue is empty.
	System.out.println("The head of this queue retrieved and removed: " + queue.poll());
	System.out.println(queue);
	System.out.println("The head of this queue retrieved now: " + queue.peek());

	System.out.println("\n------------contains()--------------------");
	// contains() --> Returns true if this collection contains the specified element. Otherwise false.
	System.out.println(queue.contains("NM"));
	System.out.println(queue.contains("WA"));
	
	System.out.println("\n-------remove()---------");
	// remove() --> Retrieves and removes the head of this queue. This method differs from poll
	// only in that it throws an exception if this queue is empty.
	System.out.println("The head of this queue retrieved and removed: " + queue.remove());
	
	System.out.println("\n-----------isEmpty()---------------------");
	// isEmpty() --> Returns true if this collection contains no elements
	System.out.println("Is this Queue empty? Ans: " + queue.isEmpty());
	
	System.out.println("\n----While(!queue.isEmpty------isEmpty()-------------");
	// While queue is not empty 
	// Keep removing(poll) --> tills its all empty.
	while(!queue.isEmpty()) {
		queue.poll();
		// System.out.println(queue);
	}
	System.out.println("Is this Queue empty Now? Ans: " + queue.isEmpty());
	System.out.println(queue);
	
	// Queue is important for interview question: specially 3 methods: add(), peek(), poll()
	// Stack is important for interview question: specially 3 methods: push(), peek(), pop()
	// What is LIFO and FIFO?
	
	
	
	
	
	
	
	
	
	
	
	}

}
