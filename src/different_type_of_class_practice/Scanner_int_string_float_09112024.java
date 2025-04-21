package different_type_of_class_practice;

import java.util.Scanner;


public class Scanner_int_string_float_09112024 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your Name: ");
		String name=scanner.nextLine();
		
		System.out.println("Please enter your ID");
		int id= scanner.nextInt();
		
		System.out.println("Please enter your HW grade");
		float hw=scanner.nextFloat();
		
		System.out.println("Please enter your Quiz grade");
		float quiz= scanner.nextFloat();
		
		System.out.println("Please enter your Exam Grade");
		float exam=scanner.nextFloat();
		
		float average= (hw+quiz+exam)/3;
		
		System.out.println("\nYour Student Name: "+ name+ "\nYour Student ID: "+ id+ "\nand your average of HW, Quiz and Exam Grade is "+ average+ " out of 4.0");
		scanner.close();
		
		
	}

	
	

}
