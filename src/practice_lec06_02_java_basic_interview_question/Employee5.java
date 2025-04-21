package practice_lec06_02_java_basic_interview_question;



// Static Variables Inside Non static Method
public class Employee5 {
	// Global Variables
	public static String myName = "Ifzal";
	public String myLocation = "irving";
	
	public void myInfo() {
		// Local Variable inside any method is default type.
		int myHeight=6;
		String mySisterName = "Nargis";
		
 
		}
	
	public static void staticMethod() {
		System.out.println("Hello testing to put static method inside Non Static Mehtod");
	}
	
	public void  methodInsideMethod() {
		//Non Static Method Inside Non Static Method
		myInfo();
		// static Method inside non Static Method
		staticMethod();
		// Non Static Variable Inside Non Static Method
		System.out.println(myLocation);
		// Static Variable Inside Non Static Method
		System.out.println(myName);
	}


	
}
