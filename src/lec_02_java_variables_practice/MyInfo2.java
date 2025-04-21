package lec_02_java_variables_practice;

public class MyInfo2 {

	public String schoolNameString; // Variable declared
	public String country_nameString = "USA"; // variable initialized
	
	public String myName = "Tofael Kabir";
	public int myYearlySalary = 65000;
	public char myGender= 'M';
	public boolean usCitizen = true;
	public float myHeight = 5.654f;
	
	public MyInfo2() {
		System.out.println("I am a constructor from My Info2 Class");
		
			}
	
	public static void main(String[] args) {
		MyInfo2 tofael = new MyInfo2();
		System.out.println("------------------------ object Calling one at a time ------------------------------");
				System.out.println(tofael.myName);
		System.out.println("My Yearly Salary: " + tofael.myYearlySalary);
		System.out.println(tofael.myGender);
		System.out.println(tofael.usCitizen);
		System.out.println(tofael.myHeight);
		
		System.out.println("------------------------ object Calling Same time ---------------------------------------");
			System.out.println("My Name: " + tofael.myName + ", My Yearly Salary: " +  tofael.myYearlySalary );
		
		
		System.out.println("------------------------Jennifer object Calling---------------------------------------");
		MyInfo2 jennifer = new MyInfo2();
		System.out.println(jennifer.myName);
	
		
	}
	
	
}
