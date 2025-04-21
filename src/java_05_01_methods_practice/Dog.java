package java_05_01_methods_practice;

public class Dog {
	//Global Variables
	public String breed = "BullDog";
	public int age = 2;
	public String firstName = "Alex";
	public String lastName = "Chao";
	public double price = 500.50;
	
	
	public void  breedType(){
		System.out.println("The breed of  the dog is : + breed");
	}
	
	//Return type has no void keyword, instead has data Type = String, int, double etc.
	public String breedOfTheDOg() {
				System.out.println("The breed of the dog is: " + breed);
		return breed; // return keyword should be the last statement. 
		// How to write return type 1) public int ageOfTheDOg():{} 2) Write return with default value of that method typr , for string return null; for int --> return 0; 
		//3)Enter enter and take the return statemet down 4) Give syso inside the method body 5) Once you know what you are returning, CHange default to the actual value
		
		 
	}
	public String fullNameOfTheDog() {
		String fullName = firstName + " " + lastName; // local variable always in default. Cannot be public, protected or private. 
		// + " " + the apce inside quotation for printing Alex Chaow with space in the middle.
		System.out.println("The name of the dog is: " + fullName);
		return fullName;
	}
	
	public int ageOfTheDog() {
		System.out.println("The age of the dog is: " + age);
		return age;
		
	}
	
	public double priceOfTheDOg() {
		System.out.println("The Price Of the Dog is: " + price);
		return price;		
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.breedType();
		dog.breedOfTheDOg(); // Calling return type method is same like void type.--> Object.Name of the method();
		dog.fullNameOfTheDog();
		dog.ageOfTheDog();
		dog.priceOfTheDOg();
		
		
		
	}
	
}
