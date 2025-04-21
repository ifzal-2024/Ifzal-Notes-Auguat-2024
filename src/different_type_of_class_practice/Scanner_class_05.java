package different_type_of_class_practice;

import java.util.Scanner;

public class Scanner_class_05 {
	public static void main(String[] args) {
		System.out.println("Please Input Your Student Name: ");
		Scanner scanner = new Scanner(System.in);
		// if we want to input String, int, float together, that is OK!
		String name = scanner.nextLine(); // String Type
		
		System.out.println("Please Input Your Student Id: ");
		int stId = scanner.nextInt();
		
		System.out.println("Please input your Score in HW");
		float scoreInHW = scanner.nextFloat();
		System.out.println("Please input your Score in Quiz");
		float scoreInQuiz = scanner.nextFloat();
		System.out.println("Please input your score in Exam");
		float scoreInExam = scanner.nextFloat();

		float average = (scoreInHW + scoreInQuiz + scoreInExam)/3;
		
		System.out.println("\nStudent Name: " + name + "\nStudent Id: "+ stId+ ",\nThe average of the hw, quiz and exam is: " + average);
		scanner.close();

	}

}
