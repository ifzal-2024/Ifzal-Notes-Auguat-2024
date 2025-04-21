package rough_for_practice;

import javax.annotation.processing.AbstractProcessor;

public class Ifzal {
	
	public int myAge = 45;
	public short myAprtmentRent = 32767;
	
	public char myGender = 'M';
	public boolean MyNationalityUkraine = false;
	
	public static void main(String[] args) {
		Ifzal ifzal = new Ifzal();
		//System.out.println(ifzal.myAge+ ifzal.myName);
	//	System.out.println(" BOB");
		
		char size ='S'; // Hey store Clerk I am looking for Size X
				
		switch (size) {
		
		case 'X' :
		System.out.println("Congrats we have Extra Large Size");
			break;

		default:
			System.out.println("No we do not have your size");
			break;
			
			
			
			
		}
	}

}
