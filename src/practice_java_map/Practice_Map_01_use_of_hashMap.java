package practice_java_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Practice_Map_01_use_of_hashMap {
	public static void main(String[] args) {
		// With ArrayList---> you can store either key or value
		ArrayList<String> name = new ArrayList<>();
		name.add("Jaiden");
		name.add("Jaiden"); // duplicate allowed in List
		name.add("Albert");
		name.add("Douglas");
		name.add("Luis");
		name.add("Charles");
		name.add("Joe");
		name.add(null);

		System.out.println(name);

		System.out.println("\n---------------------");
		ArrayList<Integer> age = new ArrayList<>();
		age.add(34);
		age.add(21);
		age.add(null);
		age.add(24);
		age.add(34);
		age.add(null);
		age.add(34);
		age.add(34); // duplicate allowed in List
		System.out.println(age);

		// ****Above we are storing single Data
		// **** But if you need to store a pair of data, how you can achieve this?
		// By the use of Map

		System.out.println("\n-----Map--------put()--------");
		// Creating a Map ---> Here 'Key' as String and 'Value' as Integer
		// But is it fixed like below? Ans: No
		// <String, Integer>, <Integer, String>, <String, String>, <Integer, Integer>,
		// also other data type can be used
		// Map is an Interface, implemented by HashMap (class)
		// Other classes that implement Map include TreeMap, LinkedHashMap, and
		// ConcurrentHashMap.
		// K represent Key, V represent Value, Map is used for "key value pair".

		// it will create 16 buckets/Node, 16 is initial capacity
		// If there is 17 Entry, what will be the capacity and when it will initiated?
		// HashMap capacity increases by 100 %
		// when threshold (12) exceeds, capacity will be double --> 32 Node
		// put(K, V) --> Associates the specified value with the specified key in this
		// map
		// Each key and value pair is known as an 'Entry'. Important info
		Map<String, Integer> nameAndAge = new HashMap<>(); // Takes help of HashMap to Instantiate
		// Select Map-javautil pop-up
		// Select HashMap from javautil.hashMap pop up
		// Once you declare <String,Integer> you have to enter data in that order
		// (Key(STring type)="Albert") Value=Integer type=21
		// <Integer, Integer> key and value =Integer type
		// Map Do not allow duplicate Key
		// If duplicate key inserted like next line, above Entry will be replaced by the
		// next Entry
		// for eg if another Jaiden inserted ("Jaiden",34) Then insert one more
		// ("Jaiden", 11) -->
		// It will take the last Key and value inserted which is Jaiden,11--> You can
		// see when you print
		// We USe put() to add key pair values.Since we Declared (String,Integer)
		// we will select put(StringKey, Integer Value): Integer:Map from Pop Up
		nameAndAge.put("Jaiden", 34);
		// If duplicate key inserted like next line, above Entry will be replaced by the next Entry
		nameAndAge.put("Jaiden", 21);
		// A map contains unique keys. No duplication allowed [similar like Set], but we
		// can have identical values.
		nameAndAge.put("Albert", 21);
		// HashMap and LinkedHashMap May have one null key and multiple null values
		// It will not allow duplicate null Key-- Will kick out previous null key and
		// keep last null key
		// It kept null=24
		// TreeMap no null key but value can contain null, Important info
		nameAndAge.put("Douglas", null);
		nameAndAge.put("Luis", 34);
		nameAndAge.put("Charles", null);
		nameAndAge.put("Alex", 14);
		nameAndAge.put("Joe", 34);
		nameAndAge.put(null, 34);
		nameAndAge.put(null, 24);
		nameAndAge.put("Alex", 19);// When print it will print Alex =19 and kickout the key Alex=14

		System.out.println("\n-----size()----------");
		System.out.println("Does not follow ordering:-->  " + nameAndAge ); 
		// Map doesn't follow ordering like set
		// Check when it prints.
		// Size 8 becuase it kicked out null=34, and Alex=14
		System.out.println("Size: " + nameAndAge.size());

	}

}
