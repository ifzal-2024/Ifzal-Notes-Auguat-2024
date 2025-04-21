package practice_coding_challenge;

//Que: How many 'z/Z'  inside the provided String? They like to confuse you by not saying upper or lower case
//you have to ask -- is it upper case or lower case?
//Better not to ask if they don't define 

public class Practice_B03_countASpecificCharacter {
	public static void countASpecificCharacter(String s) {
		int count = 0;
		for(int i = 0; i<s.length(); i++) {
			// you can also convert the String to Upper case [toUpperCase()] and look for 'Z'
			// Here we don't have to initialize s=s.lowerCase , because s.toLowerCase, charAt(i)==z and counting ++ all at the same time.
			if(s.toLowerCase().charAt(i)=='z') {
				count++;
			}
		}
		System.out.println(count);
	}
	
	
	public static void main(String[] args) {
		countASpecificCharacter("ZiyadZ Alz KhilanliezZZZ");
	}

}
