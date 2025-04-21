package practice_conditional_statemt;

import java.util.Random;

public class Practice_OddOrEvenNumberUsingRandomClass {

	public static void main(String[] args) {
		Random random = new Random();
		int val1 = random.nextInt(100);

		if (val1 % 2 == 0) {
			System.out.println(val1 + " is an even number");
		}else if (val1%2==1) {
			System.out.println(val1+ " is an Odd Number");
		}else {
			System.out.println("The system failed to execute this order");
		}
			
 
		
        
		
		
	}

}
