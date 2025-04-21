package practice_lec06_02_java_basic_interview_question;

// Can you call a non-static (global) variable or method inside the main method (without creating object)?
// Ans: No, a non static variable or method can't be called inside static method
// FYI: main method is static in nature. static is a local member method of this class
// How you can resolve that issue?
// By making the variable static

public class Employee2 {
	//non static Variable below
	public int myAge= 35;
	// static global variable
	public static String empName = "Mohammad Tofael Kabir Sharkar";

	// static is a local member of this class
	public static void main(String[] args) {
		// Can't call non static Global Variable .
		//Error: Can't make static Refrence to Non Static Field myAge
		//System.out.println(myAge); 
		System.out.println("Employee Name: " + empName);
		

	}

}
