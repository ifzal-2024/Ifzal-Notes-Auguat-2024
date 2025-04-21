package practice_coding_challenge;

public class Practice_D02_smallestNumber {
	public static void smallestNumber() {
		int[] number = new int[] {5,2,3,10,6,48,99};
		
		int smallest = number[0];
		for (int i=1;i<number.length;i++) {
			if (number[i]<smallest) {
				smallest=number[i];// xxnumber[i]= smallest xx <-- This will not work, wrong style of writing.
				
			}
		}System.out.println(smallest);
		
	}
	public static void main(String[] args) {
		smallestNumber();
	}

}
