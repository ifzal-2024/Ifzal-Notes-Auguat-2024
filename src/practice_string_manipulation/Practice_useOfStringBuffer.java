package practice_string_manipulation;

public class Practice_useOfStringBuffer {
	public static void main(String[] args) {
		System.out.println("\n-----------Regular String-------------");
		String e = new String("Good Evening"); // here e is the object
		String s = "Good Morning"; // here s is the variable, String also doesn't need to be instantiated
		System.out.println(s);
		System.out.println(s.toUpperCase());
		System.out.println(s);

		// String Buffer not Important. Just keep for later reference.
		// V.Important: Know the difference b/w String Buffer and String Builder from
		// Class Notes
		System.out.println("\n---String Buffer--- append()---");
		// StringBuffer sb1= "Hello"; error (String Buffer is not a variable type
		// Must be instantiated
		// From popup chopse StringBuffer-java.lang, new StringBuffer();
		// java.lang.StringBuffer
		// Insert the Variable inside the parenthesis
		StringBuffer sb1 = new StringBuffer("Hello");
		System.out.println(sb1);
		System.out.println(sb1.append(" World!"));
		// The append() method concatenates the given argument with this String at the
		// end
		System.out.println(sb1); // why the sb1 changed? because StringBuffer Mutable

		System.out.println("\n--------insert()-----------\n");
		// The insert() method inserts the given String with this string at the given
		// position.
		// Does not remove any characters.
		// At 2 inserts "lcom"
		StringBuffer sb2 = new StringBuffer("Wee to Java");
		System.out.println(sb2);
		sb2.insert(2, "lcom");
		System.out.println(sb2);

		System.out.println("\n ------replace()---------------");
		// The replace() method replaces the given String from the specified beginIndex
		// and endIndex-1.
		// Replace() method is also present in String
		// Replaces from (6,10)--> endIndex=endindex-1=10-1=9
		// It Replaces characters from 6-9 to "e to"
		// From popup --> replace(int start, int end, String str)
		StringBuffer sb3 = new StringBuffer("Welcomi oo Javascript");
		System.out.println(sb3);
		sb3.replace(6, 10, "e to");
		System.out.println(sb3);

		System.out.println("\n ---------delete()----------------");
		// The delete() method of the StringBuffer class deletes the String from the
		// specified beginIndex to endIndex, end index(6) is excluded
		// but excluded (endindex -1) (0,6)---> 0 to 6—> endindex-1—-> 6-1=5 —> So 0 to
		// 5
		// H=0, o=4, and space=5 So will remove Hello and space after. Outcome = World!
		sb1.delete(0, 6); // sb1 = Hello World!
		System.out.println(sb1); // outcome: World!

		System.out.println("\n ---------reverse()------------");
		// The reverse() method of the StringBuilder class reverses the current String.
		// Ifzal= lazfl
		// now sb1 = World!
		sb1.reverse();
		System.out.println(sb1);// prints !dlroW

		System.out.println("\n -------------capacity()-----------------");
		// Capacity= Total Space allocated, which can be more than the length. If the
		// buffer needs more space,
		// its capacity will increase to next Capacity
		// The capacity() method of the StringBuffer class returns the current capacity
		// of the buffer.
		// The default capacity of the buffer is 16.
		// interview question: by default the capacity is 16,
		// for next Capacity -->formula: (16*2)+2=34 i.e (old capacity*2)+2=34
		StringBuffer sb4 = new StringBuffer();

		System.out.println(sb4.capacity()); // by default the capacity is 16
		sb4.append("Hello! ");// Size of "Hello! " = 7 = less than initial Capacity , fits in default capacity
								// 16
		// so Size =7 and Capacity=16
		System.out.println(sb4.capacity()); // by default the capacity 16 fit here
		sb4.ensureCapacity(10);
		// The ensureCapacity() method of StringBuilder class ensures that the given
		// capacity has at least the specified capacity. If current capacity is greater
		// or equal than to the requested capacity
		// the capacity remains unchanged
		System.out.println("After EnsureCapacity(10) : " + sb4.capacity());
		// If the current Capacity is already greater than or equal to the requested
		// capacity(in this case,16>10)
		// the capacity remains unchanged

		sb4.append("Java is a popular language");
		// System.out.println(sb4); // Hello! Java is a popular language = Size= 34
		System.out.println("After adding Hello! Java is a popular language Capaccity: " + sb4.capacity());
		// formula: (16*2)+2=34 i.e (old capacity*2)+2
		// Outcome= size =34, so capacity increases to 34 . size 34, size is just enough
		// to fit in 34, capacity=34

		sb4.ensureCapacity(30); // if we fix a value the capacity is generally that, like the demand is --> 30
		System.out.println("After Ensure Cap(30): " + sb4.capacity());
		// in this case, sb4 already holding 34, although the ensure capacity is 30,
		// if Current capacity is already greater than requested capacity (in this case,
		// 34>30)
		// The Capacity remains unchanged

		sb4.ensureCapacity(50);
		// If the requested capacity is greater than current capacity, the string Buffer
		// would Increase to next capacity using Formula
		// Current (old)capacity is 34 --> (34*2)+2= 70
		// like you demand 50, then the system evaluate how many capacity is present
		System.out.println("\nAfter Ensure Cap(50): " + sb4.capacity());// i.e (old capacity*2)+2 = 70

		sb4.ensureCapacity(69); // Already within 70 which is the current capacity.
		System.out.println("After ensure Cap (69): " + sb4.capacity());

		/*
		 * 
		 * When you create a String Buffer using the no-argument constructor, it
		 * initializes with a default Capacity of 16 String Buffer sb1= String Buffer();
		 * Syso("Capacity: " + sb1.capacity()); // Output : 16
		 * 
		 * You can also define a custom initial Capacity when creating a String Buffer
		 * String Buffer sb= String Buffer(50); // You are declaring a parameterized
		 * Constructor. Syso(" Capacity: " + sb.capacity()); // outcome= 50 In this Case
		 * Initial Capacity is explicitly set to 50.
		 */

	}

}
