package practice_array_list;

import java.util.ArrayList;

public class Practice_MethodsArrayList_03 {
	public static void main(String[] args) {
		// We can have Heterogeneous data or we can make it Generic [A specific data
		// type]
		// Below, ar1 is a Heterogeneous type object (Raw)
		ArrayList ar1 = new ArrayList();
		ar1.add("Alex");
		ar1.add("Michael"); // Here String type
		ar1.add("Jennifer");
		ar1.add("Brian");
		ar1.add(45); // Here int type
		ar1.add(false); // Here boolean type
		ar1.add("");
		ar1.add(3, "Alison");
		ar1.add("Alfred");
		ar1.add("Jeff");
		ar1.add(5, 34.556);
		ar1.add('M'); // Here char type

		System.out.println("The size of the ArrayList is: " + ar1.size());
		System.out.println("All the value of ArrayList: " + ar1);

		// New: Using String type
		// generic comes in java 1.5 (java 5)-> by defining the data type, but without generic from 1.2(java 2)
		//Mine is java 1.11(java 11)
		// Below ar2 is a Generic type object
		ArrayList<String> ar2 = new ArrayList<>();
		ar2.add("Nick");
		ar2.add("Charles");
		ar2.add("Boris");
		ar2.add("Aaron");
		ar2.add("");
		ar2.add("Sharkar");
		ar2.add("44"); // can it take integer?
		ar2.set(5, "Kennedy");
		ar2.add(6, "Joe");
		System.out.println("\n----Printing Straight forward human readible way--[comma seprated]-");
		System.out.println(ar2);

		System.out.println("\n--- Accessing the elements of the specified arrayList by using for each loop --");
		// We can use for Each Loop because Generic (Same Type)
		for (String s : ar2) {
			System.out.println(s);
		}
		
		// Using char type
		// char: The char data type is a single 16-bit Unicode character.
		// It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or  65,535 inclusive)
		// Below ar3 is a Generic type object
		//Below  Character= Wrapper Class 
		// In Collection Framework, WE USE WRAPPER CLASS. See Peronsl Notes
		// Extra Notes from ChatGpt at the end of PErsonal Notes.
		ArrayList<Character> ar3 = new ArrayList<>();
		ar3.add('A');
		ar3.add('B');
		ar3.add('C');
		//Below on output prints empty space  
		//but actual value is 32 for empty character.
		ar3.add(' '); // Working as empty Character, one space is only allowed
		ar3.add('E');

		
		System.out.println("\n------------- Accessing the elements of the specified arrayList by using for each loop -------------");
		// for each Loop --> Character Type.
		for (Character c : ar3) {
			System.out.println(c);
		}
		
		// FYI: High level
		System.out.println("-------------Value of (' ') empty char =32 -------------");
		System.out.println(' ' + 3 + 4); // Single space value is 32 from ASCII table
		
		// Using Integer type // Integer= Wrapper class
		// Below ar4 is a Generic type object
		ArrayList<Integer> ar4 = new ArrayList<Integer>();
		ar4.add(48);
		ar4.add(34);
		ar4.add(485);
		ar4.set(1, 488);
		ar4.add(3);
		ar4.add(8);
		ar4.add(2487);
		ar4.set(1, 23);

		System.out.println("\n--Printing Stright Forward way-- comma separated-------");
		System.out.println(ar4);

		System.out.println("\n---Accessing (printing) elements of the specified arrayList by using for each loop ---");
		// Inside Loop you don't have to type Integer (Wrapper)
		// You can use int i=ar4
		// See personal Notes from chatgpt towards the end.
		for (Integer i : ar4) {
			System.out.println(i);
		}
		
		System.out.println("\n-----Finding lowest Number if no sort method present--------");
		// Will learn in coding challenge
		// if no sort method present, how you will find the lowest and highest number?
		// you can use loop and can give condition
		// This process can be used for any data type
		int lowest = ar4.get(0); // You are assuming first index is the lowest

		for (int i = 1; i < ar4.size(); i++) {
			if (ar4.get(i) < lowest) {
				lowest = ar4.get(i);
			}
		}
		
		System.out.println("Lowest Number: " + lowest);
		
		System.out.println("\n-----Finding Hihgest Number if no sort method present--------");
		// Will learn in coding challenge
		int highest = ar4.get(0);
		for (int i = 1; i < ar4.size(); i++) {
			if (ar4.get(i) > highest) {
				highest = ar4.get(i);
			}
		}
		System.out.println("Highest Number: " + highest);

		// This above 2 will be discussed in coding challenge

	}


}
