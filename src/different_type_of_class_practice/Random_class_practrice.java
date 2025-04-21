package different_type_of_class_practice;

import java.util.Random;

public class Random_class_practrice {
	public static void main(String[] args) {
		Random random = new Random();
		int a = random.nextInt();
		int b = random.nextInt();
		System.out.println("Randomly chosen number 1 : " + a);
		System.out.println("Randomly chosen number 2 : " + b);
		System.out.println("Randomly chosen number 3 : " + random.nextInt());
		
		System.out.println("\n--------------- Use of nextInt with limit (int type) ------------------\n");
		int c = random.nextInt(1000);
		int d = random.nextInt(100);
		System.out.println("Randomly chosen number 4 : " + c);
		System.out.println("Randomly chosen number 5 : " + d);
		System.out.println("Randomly chosen number 6 : " + random.nextInt(10));
		
		System.out.println("\n--------------- Use of nextBoolean------------------");
		boolean e = random.nextBoolean();
		boolean f = random.nextBoolean();
		System.out.println("Random Boolean value 1 : " + e);
		System.out.println("Random Boolean value 2 : " + f);
		System.out.println("Random Boolean value 3 : " + random.nextBoolean());
		
		System.out.println("\n--------------- Use of nextDouble, nextFloat, nextLong ------------------");
		double g = random.nextDouble();
		float h = random.nextFloat();
		long i = random.nextLong();
		System.out.println("Random Double value : " + g);
		System.out.println("Random Float value : " + h);
		System.out.println("Random Long value : " + i);
		
		
	}

}
