package practice_java_set;

import java.util.TreeSet;

public class Prcatice_Set_05_use_of_treeSet {
	public static void main(String[] args) {
		// Not important
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("Jaiden");
		treeSet.add("Armstrong");
		treeSet.add("Jaiden");
		treeSet.add("Albert");
		treeSet.add("Luis");
		treeSet.add("Luis");
		treeSet.add("Charlie");
		treeSet.add("Douglas");
		treeSet.add("Zerin");
		// treeSet.add(null); // null is not allowed is TreeSet

		System.out.println(treeSet.size());
		System.out.println("TreeSet: " + treeSet);

		System.out.println("\n------first()------last()------------");
		// First element per Ascending order : Albert
		System.out.println("First Sorted Element: " + treeSet.first());
		// Last element per Ascending Order : Luis
		System.out.println("Last Sorted Element: " + treeSet.last());

		System.out.println("\n-------higher(Douglas)-----lower(Charlie)------");
		// higher() --> Returns the least element in this set strictly greater than the
		// given element,
		// Higher than Douglas = Jaiden
		System.out.println("Higher Sorted Element: " + treeSet.higher("Douglas"));
		// lower() --> Returns the least element in this set strictly less than the
		// given element,
		// Lower than Charlie per Ascending order= Armstrong
		System.out.println("Lower Sorted Element: " + treeSet.lower("Charlie"));
		System.out.println("\n----------headset(Douglas)----tailset(Jaiden)----");
		// headSet() --> Returns a view of the portion of this set whose elements are
		// strictly less than to Element.
		// headset("Douglas") --> Albert, Armstrong, Charlie --> won't include the given element(Douglas)
		System.out.println(treeSet.headSet("Douglas"));
		// tailSet() --> Returns a view of the portion of this set whose elements are
		// greater than or equal to from Element.
		// ****greater than or equal to--> will include given element 
		// That's why Jaiden is included
		System.out.println(treeSet.tailSet("Jaiden"));

	}

}
