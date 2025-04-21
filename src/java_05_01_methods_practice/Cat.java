package java_05_01_methods_practice;

public class Cat {
	// Variables Initialized.
	public String color ="white"; // String type variable always written inside double quotation.
	public int price = 500;
	
	//Method Implemented
	public void catColor() {
		System.out.println("The color of cat is: " + color); // method can call varaibles inside sysout directly witout help of object.
	}
	
	//void type method implemented.
	public void catPrice() {
		System.out.println("The Price of the cat is: " + price);
		
	}
	
	public static void main(String[] args) {
		Cat cat = new Cat(); // Class Cat instantiated. Object created. Default construtor Initialized
		cat.catColor(); // Method iniialized
		cat.catPrice();
		
		//Cat.breedOfTheDog();
		StaticAndFinalKeywordInsideMethod.breedOfTheDog();
		

		
	
	
	}

}
