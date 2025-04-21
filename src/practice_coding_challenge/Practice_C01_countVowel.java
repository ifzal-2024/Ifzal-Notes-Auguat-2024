package practice_coding_challenge;
//  \\s is a regular expression that represents any whitespace character

//replaceAll("\\s", ""); The method searches for all the spaces (represented by "\\s").
//It removes each space and replaces it with "" (nothing).effectively deleting them
//Final String: "Packmyboxwithfivedozenliquorjugs"
//

public class Practice_C01_countVowel {
	public static void countVowel(String s) {
		// here the whole String converted to lower case
		s = s.toLowerCase();
		// s = s.replaceAll(" ", ""); // below line is more smarter
		s = s.replaceAll("\\s", "");
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				// count++; You can use thos or 
				 //count = count + 1; You can use this or you can use below
				count += 1;
			}
		}
		System.out.println("Number of vowel: " + count);
	}

	public static void main(String[] args) {
		countVowel("Pack my box with five dozen liquor jugs");

	}

}
//in logical or (||)operator: if one condition is true, then the whole condition is true
//in logical and (&&) operator: if all condition is true, then the whole condition is true