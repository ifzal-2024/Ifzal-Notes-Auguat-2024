package rough_for_practice;

import java.util.Arrays;

public class Reverse_word_from_Paragraph {
	public static void main(String[] args) {
	String	s="Hello Ifzal how are you";
	
	String [] words =s.split(" ");
	System.out.println(Arrays.toString(words));
	for (int i=words.length-1;i>=0;i--) {
		System.out.print(words[i]+" ");
	}
	
	
		
	}

}
