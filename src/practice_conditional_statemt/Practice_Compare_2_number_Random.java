package practice_conditional_statemt;

import java.util.Random;

public class Practice_Compare_2_number_Random {
	public static void main(String[] args) {
		Random random=new Random();
		int val1=random.nextInt(100);
		int val2=random.nextInt(100);
		
		
		
		if(val1<val2) {
			System.out.println(val1 + " is smaller than " + val2);
			}else if(val1>val2) {
				System.out.println(val1 + " is greater than " + val2);
			}else if (val1==val2) {
				System.out.println(val1 + " is qual to " + val2);
			}else {
				System.out.println("The system has failed to execute");
			}
		
		
		
	}

}
