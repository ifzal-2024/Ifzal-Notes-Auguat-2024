package practice_method_2;

import java.security.PublicKey;

public class Bird {
	public String birColor = "White";
	public int birdPrice = 500;
	
	public void birdcolor() {
		System.out.println("The COlor of the bird is: "+ birColor);
		
		}
	
	public void birdPrice() {
		System.out.println("The Price of the Bird is : " + birdPrice);
		
	}
	
public static void main(String[] args) {
	Bird bd = new Bird();
	bd.birdcolor();
	bd.birdPrice();
	
}
	
}
