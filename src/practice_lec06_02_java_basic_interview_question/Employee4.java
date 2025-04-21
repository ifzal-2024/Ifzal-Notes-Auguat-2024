package practice_lec06_02_java_basic_interview_question;

// Can you call a non-static (global) variable or method inside the main method (without creating object)?
// Ans: No, a non static variable or method can't be called inside static method
// FYI: main method is static in nature. static is a local member method of this class
// How you can resolve that issue?
// By making the variable static

public class Employee4 {
	// static global variable
	public static String empName = "Mohammad Tofael Kabir Sharkar";
	public static int empId = 2188458; 
	public  int ifzalBirthYear = 1985;
	
	// static method
	// static is a local member method of this class
	public static void employee() {
		System.out.println("Employee Name: " + empName);
	}

	public static void main(String[] args) {
		// Inside Came Class , Static Methods and Static Variables Can be Called Directly
		// Without the help of Object
		employee();
		System.out.println(empId);
		
		//Can't call Non Static Method directly inside Static method
		//System.out.println(ifzalBirthYear);
		
		
	}

}
