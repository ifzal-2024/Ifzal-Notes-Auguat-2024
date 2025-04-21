package practice_conditional_statemt;

public class Practice_CompareTwoNumbersSimple {
	public static void main(String[] args) {
		int val1=24;
		int val2=84;
		
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
