package practice_coding_challenge;
/*
Que: Print out your name vertically but only the odd index 
Input: Tofael Kabir
Output:
o
a
l
K
b
r
*/

public class Practice_A02_odd_character_verticall {
	public static void nameInVertical(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 1)

			{
				System.out.println(s.charAt(i));
			}
		}
	}

	public static void main(String[] args) {
		nameInVertical("Tofael Kabir");
		System.out.println("---------Muhammad Ifzal Below-----");
		nameInVertical("Muhammad Ifzal");

	}

}
