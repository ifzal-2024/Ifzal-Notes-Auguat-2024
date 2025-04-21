package practice_jave_methods_youtube;

public class ReturnStatements {
	
	
	
	
public static void printAMessage() {
	System.out.println("This is our first Method");
}

//public static void add(int a, int b) {
//	System.out.println(a + b);
//}

public static int add(int a, int b) {
	
	return a + b;
}

public static String caps(String s) {
	return s.toUpperCase();
}


public static void main(String[] args) {
	//printAMessage();
	// int sum = add(5,4)  <-- Not possible through void method
	// Void method do not store anything.
	//add(5,4);
	
	/*compiler 1st goes to printAMessage method and printes the outcome
	 * Then it goes to int sum = add(5,4) --> declares int sum= add(5,4) from a differet method
	 * add (5,4)--> goes to add (int a, intb)--> a=5,b=4--> return a+b--> 5+4 gets added = 9 
	 * Now 9 is returned back to the original method call-->  int sum =add(5,4) ---> it looks like this in computer [ int sum = 9] --> 9 is stored
	 * Next Syso gets executed ---> syso(sum) --> 9
	 * ---------------
	 * String method
	 * Compiler goes to String shouting = caps("why are you reading my diary mom?")--> then goes to String caps(String s) because both matches
	 * -->hits the  return statement go to --> s.touppercase
	 * --> s.toUppercase converts the sentence to upper case ( Explantion Can be found in string class conversion ) 
	 * --> Once converted return sends back to original method call--> stores it--> Finally prints the sysout
	 */
	
	printAMessage();
	int sum = add(5, 4); // Declaring int sum = add(5,4)<---- from another method
	System.out.println(sum);
	System.out.println("---------------below String-----------");
	String shouting = caps("why are you reading my diary mom?!");
	System.out.println(shouting);
	
	
	
	
}


}
