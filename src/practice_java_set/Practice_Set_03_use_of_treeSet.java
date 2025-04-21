package practice_java_set;

import java.util.Set;
import java.util.TreeSet;

/*Ascending Order : Small to Big: A to Z, 1 to 100 .
 * In a TreeSet, the elements are stored in ascending order based on their natural ordering, 
 * which depends on the comparison of their ASCII values. 
 * Here's the order of different types of characters based on their ASCII values:
 * TreeSet<String> set = new TreeSet<>();
   set.add("a");-->set.add("Z"); -->  set.add("9");-->set.add("");-->set.add("B");-->set.add("m");--> set.add("1");   
   // Printing the TreeSet elements
    System.out.println("TreeSet: " + set);
 * The empty string ("") appears first because it has no characters, making it the smallest value in the set.
After the empty string, the numbers ("1", "9") come next.
Then, the uppercase letters ("B", "Z") come after the numbers.
Finally, the lowercase letters ("a", "m") appear last.
 * TreeSet: [, 1, 9, B, Z, a, m]
 */
public class Practice_Set_03_use_of_treeSet {

	public static void main(String[] args) {
		Set<String> set1 = new TreeSet<>();
		set1.add("Bradley");
		set1.add("Jamie");
		set1.add("Katie");
		set1.add("Amy");
		set1.add("Brad");
		set1.add("Brad"); // Duplicated
		// set1.add(null); // null never accepted in treeSet or treeMap
		// Will Throw a nullPointerException if you run it.
		// null represents the absence of a value or reference. It is not a value itself
		// but a reference that points to no object.
		set1.add("amy"); // Case sensitive
		set1.add("Ryan");
		set1.add("Jamie"); // Duplicated
		set1.add("Kevin");
		set1.add("Amy"); // Duplicated
		set1.add("David");
		set1.add(""); // Empty String acceptable, never knew, high level.
		// Empty String : Represents an empty string with no characters.It is an actual
		// String object, but it contains no characters.
		// WHen you print , it show a comma.
		System.out.println(set1.size());
		System.out.println("set1: " + set1);

		// In TreeSet: they follow ascending order, duplicate not allowed
		// null is not allowed is TreeSet // important interview question
		// because treeSet allow ascending order, so the position of null is not defined

		System.out.println("\n------ Another example ------treeset2-----------");
		Set<String> treeSet2 = new TreeSet<>();
		treeSet2.add("Bradley");
		treeSet2.add("Joe");
		treeSet2.add("Alex");

		System.out.println(treeSet2.size());
		System.out.println("TreeSet2: " + treeSet2);

		System.out.println("\n-----------set1.addAll(treeSet2)---------");
		// Has to pass a collection ( another set, list etc)e.g set1.addAll(treeSet2)
		// Since Bradley is common in both and since treeSet2 is being added to set1
		// only one instance of "Bradley" will be kept i.e 1st Bradley
		// It will ignore Bradley from TreeSet2 because TreeSet eliminates duplicates.
		set1.addAll(treeSet2);
		System.out.println(set1.size());
		System.out.println("set1: " + set1);

		System.out.println("\n------------treeSet2.remove(Joe)------------");
		// remove() --> Removes the specified element from this set if it is present
		treeSet2.remove("Joe");
		System.out.println(treeSet2.size());
		System.out.println("TreeSet2: " + treeSet2);

		System.out.println("\n----------removeAll()----------------------");
		// Has to pass a collection ( another set, list etc)
		// Will remove common elements from set1 and treeSet2
		set1.removeAll(treeSet2);
		System.out.println(set1.size());
		System.out.println("set1: " + set1);

		// Check If an Data/Item Exists
		System.out.println("\n-----------contains()------------");
		if (set1.contains("Luis")) {
			set1.remove("Douglas");
			System.out.println("set1: " + set1);
		} else if (!set1.contains("Luis")) {
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
