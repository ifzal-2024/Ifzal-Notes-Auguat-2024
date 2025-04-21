package practice_lec06_02_java_basic_interview_question;


// we are learning print() vs println()
// println() is mostly used

public class GoodAfternoon {

	public static void main(String[] args) {
		System.out.print("Good Afternoon! ");
		System.out.print("How are you all? ");
		System.out.print("We are going to learn print vs prinln method.");
		System.out.print(" Do you guys get it?");
		System.out.print(" If Yes, That's Great! ");
		// although below line is println(), but the previous 4 is print() and will continue printing together
		System.out.println("If No, Please ask me Question.");
		System.out.println("Thanks");
		
		// Another type you can see in the industry, I will not use, type "sys", get as first outcome
		System.err.println("To show the Error, we use this, outcome in red color");

	}

}


// println() -- print line by line
//how the println() method do? --> Terminates the current line by writing the line separator string.
// print() -- print continuously, not line by line, connect the next outcome
// You can make it readable by putting a space at the end or at the beginning of next line
