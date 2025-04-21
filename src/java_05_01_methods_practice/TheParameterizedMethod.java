package java_05_01_methods_practice;


public class TheParameterizedMethod {
	// We do not need  to declare variables to make relation with parameters like Constructor
	
	// void type parameterized method
	//What is the Advantage of parameterized methods?
	// It can be reused [Called many times] by changing the arguments.
	//Here, String breed, int price are parameter
	public void breedType(String breed, int price) {
	System.out.println("The breed of the dog is breed: " + breed+ "\nPrice is: " + price);
	}
	
		// Can a return type method be parameterized ? yes
	// If a method is parameterized, then no need of variables.
	// here int price1, int price2, int price3 are parameters
	public int totalPrice(int price1, int price2, int price3) {
		int total = price1 + price2 + price3;
		System.out.println("Total Price of the dogs are: " + total);
		return total;
	}
	
	//parameterized method can be void or return type
	//paramterized method can be static or final type
	
	public static void main(String[] args) {
	TheParameterizedMethod pm = new TheParameterizedMethod();
	pm.breedType("Bull Dog", 1000); // arguments used here
	pm.breedType("Pitt Bull", 900);
	pm.breedType("Doverman", 850);
	
	
	pm.totalPrice(500, 790, 600);
	pm.totalPrice(100, 200, 300);

	}
	
	
	
	
	
}
