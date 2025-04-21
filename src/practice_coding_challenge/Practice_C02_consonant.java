package practice_coding_challenge;

//Que: Write a method to find the number of consonants from the String? 
public class Practice_C02_consonant {

	public static void countVowel(String s) {
		s = s.toLowerCase();
		// s = s.replaceAll(" ", "");  // below line is more smarter
		s = s.replaceAll("\\s", "");
		// replacing all white space [\\s stands for “whitespace character”]
		int count = 0;
		for (int i = 0; i<s.length(); i++) {
			// Here using [ != Not equal to]   [ &&  = logical and operator]
			if(s.charAt(i)!='a' && s.charAt(i) !='e' && s.charAt(i) !='i' && s.charAt(i) != 'o' && s.charAt(i) !='u') {
				count +=1;				
			}			
		}
		System.out.println("Number of consonant: " + count);
	}

	public static void main(String[] args) {
		countVowel("Pack my box with five dozen liquor jugs");

	}

	
}
