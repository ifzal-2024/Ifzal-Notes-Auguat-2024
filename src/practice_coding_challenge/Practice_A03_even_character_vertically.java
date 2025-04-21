package practice_coding_challenge;



/*
Que: Print out your name vertically but only even index
Input: Tofael Kabir
Output:
T
f
e

a
i
*/

public class Practice_A03_even_character_vertically {
	
	public static void  NameVerticallyEven(String s){
		for(int i=0;i<s.length();i++) {
			if(i%2==0) {
				System.out.println(s.charAt(i));
			}
		}
			
	}
public static void main(String[] args) {
	NameVerticallyEven("IFZAL");
	System.out.println("\n------Below Tofael Kabir------");
	NameVerticallyEven("Tofael Kabir");
}
}
