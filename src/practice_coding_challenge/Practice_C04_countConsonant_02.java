package practice_coding_challenge;
/*
//     ' ' - A Space Character:
//    ' ' is a single space character.
//      In Java, characters are written between single quotes (' '). In this case, it’s a space character.
//      Why we are using character--> because charAt(i)= returns character.
 * 
 * 
 */
public class Practice_C04_countConsonant_02 {
	public static void countConsonant(String s) {
		// Not using replaceAll() ---> Instead using s.chatAt(i)!=' '
		s = s.toLowerCase(); 
		// This is the change, added in the condition
		// s = s.replaceAll("\\s", "");
		int count = 0;
		
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i)!='a' && s.charAt(i)!='e' && s.charAt(i)!='i' && s.charAt(i)!='o' && s.charAt(i)!='u' && s.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println("Number of Consonant: " + count);
	}
	
	public static void main(String[] args) {
		countConsonant("Pack my box with five dozen liquor jugs");
	}


}
