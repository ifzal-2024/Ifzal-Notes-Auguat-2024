package practice_coding_challenge;

public class Practice_B02_countASpecificCharacter {
	public static void countASpecificCharacter(String s) {
		int count = 0;
	s=	s.toLowerCase(); // or you can convert to Uppper case and look for upper case Z
		// Rememebr to put s=s.toLowerCase or else it will try to match with  original value cos String is immutable.
		// because s will stay original value and if you try to find by ==z only, it will look for only small z and get count = 2
		System.out.println(s);
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i)=='z') {// == equal to method is case sensitve. Make sure to put'z' after conversion.
				count++;
			}
		}
		System.out.println(count);
	}
	
	
	public static void main(String[] args) {
		countASpecificCharacter("ZiyadZ Alz KhilanliezZZZ");
	}
	
}
