package java_05_01_methods_practice;

public class MethodsCanBeCalledInsideConstructor {
	public String breed = "BullDog";
	public int age = 2;
	
	public String firstName = "Alex";
	public String lastName = "Chao";
	
	public double price = 500.50;
	
	// default Constructor
	// We can can call methods [one or more] inside Constructor too.
	// Why we put methods inside constructor?
	// if a class is instantiated [when object is created], constructor is initialized, 
	// If we need some methods working during instantiation [object creation], then it helps
	public MethodsCanBeCalledInsideConstructor() {
				dogDescription();
		
	}
	
	public void breedType() {
		System.out.println("The breed: " + breed);
	}
	public String breedOfTheDog() {
		System.out.println("The breed of the dog is: " + breed);
		return breed;
	}
	
	public String fullNameOfTheDog() {
		String fullName = firstName +" "+ lastName;
		System.out.println("The name of the dog is: " + fullName);
		return fullName;
	}
	
	public int ageOfTheDog() {
		System.out.println("The age of the dog is: " + age );
		return age;
	}
	
	public double priceOfTheDog() {
		System.out.println("The price of the dog is: " + price);
		return price;
	}
	
	// We learn from here, which concept will be used later
	// We can call one or more than one method, inside another method
	// This method can be void type too
	public void dogDescription() {
		breedType();
		breedOfTheDog();
		fullNameOfTheDog();
		ageOfTheDog();
		priceOfTheDog();
	}
		public static void main(String[] args) {
		// when object is created who is initialized?
		// default Constructor initialized
		// we will use this concept in future
		MethodsCanBeCalledInsideConstructor mm = new MethodsCanBeCalledInsideConstructor();
		System.out.println("--------Testing for self: Calling again using object speartely to call Method below----");
		mm.dogDescription();
		
	
}
}
