package practice_coding_challenge;

//Que: How many 'z/Z'  inside the provided String? They like to confuse you by not saying upper or lower case
//you have to ask -- is it upper case or lower case?
//Better not to ask if they don't define 
//ZiyadZ Alz KhilanliezZZZ

public class Practice_B01_countASpecificCharacter {
	public static void countASpecificCharacter(String s) {
		int count = 0;
		System.out.println(count);
		for(int i = 0; i<s.length(); i++) {// Remember to put if inside Curly {
			// remember to put ' ' when looking for character. --> 'Z'
			if(s.charAt(i)=='Z' || s.charAt(i)=='z') {//Remember to put count++ inside curly{
				count ++;
				
			}
		}
		System.out.println( count); // Syso is outside For Loop. We don't want count value as you go, 1, 2, 3 
		// It will print // 1 1 1 1 1, then when finds another z  2 2 2 2 2 extra 2 is when it finds other character and 2 stays same 
		//etc.We just want the  final count value.
		
		
	}
	
	
	
	public static void main(String[] args) {
		countASpecificCharacter("ZiyadZ Alz KhilanliezZZZ");
		
	}


}

/*
 * int count = 0;
 *1. Starting with count Variable:
First, you create a variable called count and set it to 0. 
This is like starting with an empty counter.
Think of it like a box where you store numbers, and right now, the box holds the number 0. 
 * 2. Looping Through the String:
You then loop through each character in the string to check if it matches 'Z' or 'z'.
For every character that matches, you will add 1 to count.
3. What Happens When You Find a Match:
When the program finds a 'Z' or 'z' in the string, the if condition becomes true:
 * if (s.charAt(i) == 'Z' || s.charAt(i) == 'z')
 * Inside this if block, you see count++.
 * 4. How count++ Works:
count++ is shorthand for adding 1 to the current value of count.
If count is currently 0, after count++, it becomes 1. Here’s the breakdown:
count++ is the same as saying: "Take whatever number is inside count and add 1 to it."
After adding 1, the new value is stored back into count.
 * The first character is 'Z', so count++ runs, making count = 1.
The second character is 'i', so nothing happens.
The third character is 'y', so nothing happens.
The fourth character is 'a', so nothing happens.
The fifth character is 'd', so nothing happens.
The sixth character is 'Z', so count++ runs again, making count = 2.
The seventh character is a space, so nothing happens.
The eighth character is 'A', so nothing happens.
The ninth character is 'l', so nothing happens.
The tenth character is 'z', so count++ runs, making count = 3.
And so on...
At the end of the string, the count variable will hold the total number of 'Z' or 'z' characters found in the string, which is printed out.
 * 
 * 
 */
