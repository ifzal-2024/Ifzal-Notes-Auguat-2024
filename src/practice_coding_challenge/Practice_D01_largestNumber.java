package practice_coding_challenge;

public class Practice_D01_largestNumber {

 public static void largest() {
	 int[] number= {45,2,3,6,2,98,101};
	 int  largest= number[0];
	 System.out.println(largest);
	 System.out.println(number[0]);
	 for (int i=1; i<number.length;i++) {
		 if(number[i]>largest) {
			 largest=number[i]; // xxnumber[i]= largest xx <-- This will not work, wrong style of writing.
			 
		 }
	 }
	 System.out.println("Lrgest Number is: " + largest);
 }
public static void main(String[] args) {
	largest();
}
 
}
