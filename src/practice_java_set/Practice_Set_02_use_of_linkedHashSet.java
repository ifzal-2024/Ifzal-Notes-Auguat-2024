package practice_java_set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Practice_Set_02_use_of_linkedHashSet {
	public static void main(String[] args) {
		Set<String> set1 = new LinkedHashSet<>();
		set1.add("Bradely");
		set1.add("Jamie");
		set1.add("Katie");
		set1.add("Amy"); // Will keep this Amy
		set1.add("Brad");
		set1.add("Brad"); // Duplicated // When duplicated will kick out the last duplicated value
		set1.add("Amy"); // Duplicated
		set1.add("Ryan");
		set1.add(null);
		set1.add("Jamie"); // Duplicated
		set1.add("Kevin");
		set1.add("Amy"); // Duplicated
		set1.add("David");

		System.out.println("Stored Data in set1: " + set1);
		System.out.println("Size of set1: " + set1.size());
		// In LinkedHashSet: they follow order, duplicate not allowed
		// if duplicate present, kept the first one

		System.out.println("\n------------set2-------------------");
		Set<String> set2 = new LinkedHashSet<>();
		set2.add("Jaiden");
		set2.add("Kevin");
		set2.add("Alex");

		System.out.println(set2.size());
		System.out.println("set2: " + set2);

		System.out.println("\n--------------- set1.addAll(set2) -----------------");
		// Has to pass a collection ( another set, list etc)
		set1.addAll(set2);
		System.out.println(set1.size());
		System.out.println("set1: " + set1);// Kevin is duplicated
		// It will keep Kevin from set1 bcos its keeps the 1st value and kicked Kevin
		// from set2

		System.out.println("\n------remove()------add()---set2-------");
		// remove() --> Removes the specified element from this set if it is present
		set2.remove("Joe");// There is no Joe in set2...so does nothing.
		set2.add("Amy");
		set2.add("Ryan");
		System.out.println(set2.size());
		System.out.println("set2: " + set2);

		System.out.println("\n-----------set1.removeAll(set2)--------");
		// Has to pass a collection ( another set, list etc)
		// set1.removeAll(set2): Mechanism
		// This will remove all elements in set1 that are also present in set2.
		// Any common elements between set1 and set2 will be removed from set1.
		// Does not matter if Kevin belongs to set1 when we added set2 to set1 , it kept
		// kevin of Set1
		// Mechanism: is it will remove all common elements.
		set1.removeAll(set2);
		System.out.println(set1.size());
		System.out.println("set1: " + set1);

		// Check If an Data/Item Exists
		System.out.println("\n--------------------------------");
		if (set1.contains("Kevins")) {
			set1.remove("Katie");
			System.out.println("set1: " + set1);
		} else if (!set1.contains("Kevins")) {
			System.out.println("set1 is unchanged as It doesnot contain Luis");
		}

		System.out.println("\n-------------- Using clear() ------------------");
		if (set1.isEmpty()) {
			System.out.println("There is No Data inside set1");
		} else if (!set1.isEmpty()) {
			set1.clear();
			System.out.println(set1);
		}

	}

}
