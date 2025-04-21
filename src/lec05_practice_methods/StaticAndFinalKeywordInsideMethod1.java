package lec05_practice_methods;



public class StaticAndFinalKeywordInsideMethod1 {
	// non static properties cannot be used inside static properties
		// Thats why below line is static
		public static String breed = "BullDog";
		public int age = 2;
		
		// void type static method
		// static keyword is used during method creation 
		// static is a local member method of this class
		// other class can't call it/get it	
		public static void breedType() {
			System.out.println("The breed: " + breed);
		}
		
		// return type static method
		public static String breedOfTheDog() {
			System.out.println("The breed of the dog is: " + breed);
			return breed;
		}
		
		
		// return type final method
		// final keyword is used during method creation
		// when there is a final keyword, you can't change the method
		// what does it mean by change?
		// sometime methods are called and changed by "method overriding"
		// we will learn it later
		// final keyword can be used in void type method too
		public final int ageOfTheDog() {
			System.out.println("The age of the dog is: " + age);
			return age;
		}
		

		public static void main(String[] args) {
			StaticAndFinalKeywordInsideMethod1 sf = new StaticAndFinalKeywordInsideMethod1();
			// static methods are called by the class itself, "no need of object" to call a static method
			//StaticAndFinalKeywordInsideMethod1.breedType();
			//StaticAndFinalKeywordInsideMethod1.breedOfTheDog();
			// final type method can't be cha
			sf.breedType();
			StaticAndFinalKeywordInsideMethod1.breedOfTheDog();
			sf.ageOfTheDog();

		}

}
