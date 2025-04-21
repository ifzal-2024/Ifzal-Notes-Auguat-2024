package practice_method_2;

public class Param_method {
	public void breedType(String breed, int price) {
		System.out.println("the breed of the dog is: " + breed + "The Price of teh Dog is: " + price);
	}
	
	public int totalPrice(int price1, int price2, int price3) {
		int totalPrice= price1+price2+price3;
						
						System.out.println("The Total Price of the Dogs is " + totalPrice);
						return 0;
	}
	
	public static void main(String[] args) {
		Param_method pm= new Param_method();
		pm.breedType("Bull Dog", 500);
		pm.breedType("Doverman", 600);
		pm.breedType("chihuhua", 200);
		
		pm.totalPrice(100, 200, 300);
		pm.totalPrice(100, 200, 100);
		
	}

}
