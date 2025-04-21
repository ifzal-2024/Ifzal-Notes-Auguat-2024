package practice_coding_challenge;
/*
Que: Print your name vertically but reverse [They will not mention: character by character]
// Starting # will be the bigger number if we wanna print in Reverse
 * Last character = length -1 
 * Ifzal ==> length = 5, we want to start from last index 
 * condition = i>= 0 , we want to print 1st index, thats why we have to add (equal to )
 * if e just put 0>0 --> not true and it will skip 1st index
*/

public class Practice_A04_characterOneByOneVerticallyButReverse {
	public static void nameInVerticalReverse(String s) {// parameterized method for resuibility
		
		for(int i = s.length()-1; i>=0; i--) {	
			System.out.println(s.charAt(i));
			
		}
	}
	// in String class, we use charAt() to return character at the
	// specified index.
	// s.length= 12 including the space.
	public static void main(String[] args) {
		nameInVerticalReverse("Tofael Kabir");
		System.out.println("-------Ifzal below-------");
		nameInVerticalReverse("Ifzal");
		
	}
	

}
