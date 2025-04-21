package practice_java_set;

import java.util.HashSet;
import java.util.Set;

public class Practice_Set_01_use_of_hashSet {

	public static void main(String[] args) {
		Set<Integer>set1 = new HashSet<>();
		set1.add(234);
		set1.add(25);
		set1.add(25); // duplicated
		set1.add(35);
		set1.add(16);
		set1.add(26);
		set1.add(25); // duplicated 
		set1.add(16); // duplictaed
		set1.add(77);
		set1.add(77); // duplictaed
		set1.add(50);
		set1.add(60);
		set1.add(35); // duplictaed
		
		System.out.println("Stored Data in set1: " + set1);
		// 1) The outcome doesn't have any duplication, duplicated value are not stored
		// 2) The outcome is not ordered, not like how it is inserted
		// Set is unordered and no duplication allowed
		System.out.println("Size of set1: " + set1.size());
		System.out.println("\n");
		
		// Duplicated values are not even counted. Why?
		// Whenever we create a HashSet, it internally creates a HashMap and if we insert an element into 
		// 25, 25 ,25 are all same, How we know which 2 it got rid off? See explanation of  mechanism below 
		// this HashSet using add() method, it actually call put() method [From Map] on internally created HashMap object 
		// with element you have specified as it’s key and constant Object called “PRESENT” as it’s value. 
		// So we can say that a Set achieves uniqueness [ONE] internally, through HashMap 
		// because it can compare the inserted data with the existing Data.
		// When it finds duplicate, it can ignore the first data which is already inserted, 
		// and """replace""" it with the similar data, so no duplicate data is stored.
		
		// The outcome what we see, how it is ordered?
		// Ans: By hashing. what is hashing?
		// every data have a hash code, that is divided by initial capacity 16, so there will be a remainder from 0 to 15 [total 16 node]
		// those remainder are considered as a node or Bucket Number and the data stored there.
		// for example: which have 0 remainder, that data will come first, then for remainder 1, remainder 2, remainder 3 and so on
		// now if 2 data have same remainder, then first data will be in first place,
		//then next one will be after the first data, inside the same node
		// Duplicated data will be replaced by next data
		System.out.println("\n-----set3----\n");
		Set<Integer> set3 = new HashSet<>();
		set3.add(15);
		set3.add(9);
		set3.add(5); 
		set3.add(10);
		set3.add(1);
		System.out.println(set3);
		
		System.out.println("\n--------------Trying For Loop Ajaira stuff------------------");
		// Another Generic <Integer> type, Data added by running a loop
		Set<Integer> set2 = new HashSet<>();
		set2.add(54); // previous way like line 11-18
		// The below for loop is not mandatory, just we put a loop and condition to add data inside the set2
		for(int i = 0; i<100; i+=3) { // 0, 3, 6, 9, 12, 15, 18, ....................
			if(i%2==0) { // If you divide a number with 2 and the remainder is 0, that is an even number
				set2.add(i);
			}
		} // there is no relation with set for above code. Just ajaira stuff
		System.out.println("Stored Data in set2: " + set2);
		
		System.out.println("Size of set2: " + set2.size());
		// There is no get() method like List, why? because data doesn't have any index number like List
		
		System.out.println("\n----------addAll()----------------------");
		// Has to pass a collection ( another set, list etc)
		// using addAll(), we are insert set2, inside the set1
		set1.addAll(set2);
		System.out.println("After addAll(), Size of set1: " + set1.size());
		//8 elements in set1 and set2 has 17 elements . How come we are getting size=24 instead of 25
		// Because one element is duplictae i.e.60 . So which 60 it will kick out
		// It will kick out 60 from set1 bcos set 60 is added later to set 1.
		System.out.println("Stored Data in set1: " +set1);
		
		
		System.out.println("\n----Remove item----------remove(18)------------------");
		// Remove an Item
		// removing a specific element --> not index wise
		set2.remove(18);
		// removing from set2, not from set1
		System.out.println("Stored Data in set2: " + set2);
		System.out.println("After remove, Size of set2: " + set2.size());
		
		System.out.println("\n------------removeAll--------------------");
		// removing all items of set 2  from set1
		// Will remove common elements which are present in 
		// in Both
		set1.removeAll(set2);
		System.out.println("Stored Data in set1: " +set1);
		System.out.println("After removeAll(), Size:" + set1.size());
		// Why set1 output look different sequential than before? because initial capacity became 32 when addAll was used
		
		// Check If an Data/Item Exists by contains() method
		System.out.println("\n-------------Contains()---------------");
		if (set2.contains(89)) {
			set2.remove(89);
		} else if (!set2.contains(89)) {
			System.out.println("Set2 is unchanged as It doesnot contain 89");// because we do not have 89 in set2
		}
		
		System.out.println("\n---- contains()-----------------");
		if (set2.contains(36)) {
			set2.remove(36); // 36 is present and its removed by remove(36)
			System.out.println(set2);
		} else if (!set2.contains(36)) {
			System.out.println("Set2 is unchanged as It doesnot contain 89");
		}
		
		System.out.println("\n--------------hashCode()------------------");
		// address of the object
		System.out.println("Hash code for set1 object: " + set1.hashCode()); // give you hash code for set1 obj
		System.out.println("Hash code for set2 object: " + set2.hashCode()); // give you hash code for set2 obj
		
		System.out.println("\n------------- isEmpty() method is used ------ for each Loop-------------");
		// We can use for each loop or Iterator to print all data from set1
		if (set1.isEmpty()) {
			System.out.println("No Data inside set1");
		} else if (!set1.isEmpty()) {
			// for each loop is used
			for (Integer a : set1) {
				System.out.println(a);// Using Println() --> Printing line by Line
			}
		}
		
		System.out.println("\n-------------- Using clear() ------------------");
		if (!set1.isEmpty()) {
			set1.clear();
			System.out.println(set1);// Will print Empty once its clears.
		}	else {
			System.out.println(set1);
		}

	}

}
