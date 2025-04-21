package practice_coding_challenge;

/*
Que: Print your name Horizontally but in reverse
Input: Tofael Kabir

Output:
ribaK leafoT

*/
public class Practice_A05_characterOneByOneHorizontallyButReverse {
	
public static void nameInVerticalReverse(String s) {// parameterized method for resuibility
		
		for(int i = s.length()-1; i>=0; i--) {	
			// We use print instead of println to print Horizontally.
			System.out.print(s.charAt(i));
			
		}
	}
	// in String class, we use charAt() to return character at the
	// specified index.
	// s.length= 12 including the space.
	public static void main(String[] args) {
		nameInVerticalReverse("Tofael Kabir");
		System.out.println("\n--------------");
		nameInVerticalReverse("Ifzal");
		
	}
}
