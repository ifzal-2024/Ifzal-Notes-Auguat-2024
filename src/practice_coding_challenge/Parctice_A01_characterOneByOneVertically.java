package practice_coding_challenge;


/*
Que: Print out your name vertically [They will not mention: character by character]
Input: Tofael Kabir
Output:
T
o
f
a
e
l

K
a
b
i
r
*/
//s is parameter . When you initialize value (argument) "Tofael Kabir" , In Java String object is created 
//behind the scene. In Java, s is a reference to a String object, and String is a class in Java. 
//Even though s looks like a simple variable, it actually refers to an instance of the String class, 
//which is an object in itself.
//The variable s holds a reference to the memory location
// where String object is stored.
// This is how Object orinted programming allows us to call methods
// asscoiated with their corresponding object types.
// thats how s can call s.charAt() , s can call s.length()


public class Parctice_A01_characterOneByOneVertically {
// for Loop Incremental starts small #, climbs up till bigger number which is
	// present in condition length =12, i<12 (12 big number than starting number)
	// for incremental condition is less than.
	// we cannot use i<= to length, it will give outofbound exception.
	// n-1 --> 12-1=11 last index , n=length
	public static void nameInVertical(String s) {// parameterized method for resuibility
		for(int i = 0; i<s.length(); i++) {	
			System.out.println(s.charAt(i));
			
		}
	}
	// in String class, we use charAt() to return character at the
	// specified index.
	// s.length= 12 including the space.
	public static void main(String[] args) {
		nameInVertical("Tofael Kabir");
		System.out.println("--------------");
		nameInVertical("Joseph Momoa");
		
	}


	
}
