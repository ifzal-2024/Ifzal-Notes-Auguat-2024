package practice_method_2;

public class MetInCon {
	public String breed = "BullDOg";
	public int dogAge= 3;
	public String fName= "Alex";
	public String lName="Chaow";
	public double price = 500.50;
	
	public MetInCon() {
		
		Dogdescription();
	}

	public void breedType() {
		System.out.println("The Breed of the Dog: " + breed);
	} 

	public String breedOfTheDOg() {
		System.out.println("The Breed of the Dog: " + breed);
		return breed;
	}
	public String fullNameofDog() {
		String fullName = fName + " " + lName;
		System.out.println("The Full Name of the Dog is:" + fullName);
		return fullName;
	}

	public int ageOfTheDog() {
		System.out.println("The age f  the Dog is: "+dogAge);
		return dogAge; 
	}

	public double dogPrice() {
		System.out.println("The Price Of the Dog: " + price);
		return price;
	}

	public void Dogdescription() {
		breedType();
		breedOfTheDOg();
		fullNameofDog();
		ageOfTheDog();
		dogPrice();
	}
	public static void main(String[] args) {
		MetInCon mc=new MetInCon();
	
	}
	
}
