package lec03_01_java_variables_practice;

public class MyInfo  {
	protected  String myName = "Tofael Kabir";
	public byte myAge = 127;
	public short myApartmentRent = 32767;
	public int myYearlySalary = 2147483647;
	public long myBankBalance = 9223372036854775807l;
	public float myHeight = 1.6443f;
	public double myGrade = 3.7657468566745;
	public char myGender = 'M';
	public boolean usCitizen = true;
	

	
	public  MyInfo() {
		System.out.println("I am a COnstructor from MyInfo Class");
		
	}
	
	public void myself() {
		System.out.println("I am a myself method");
		
	}
	
public void study_tour() {
	System.out.println("I am a study tour method");
}

protected  void myInfo() {
	System.out.println("I am a myInfo Method");
	// Can we use/call variable inside sysout of method body? Yes See Below
	// 
	System.out.println("My name: " + myName); 
}

protected void ifzalinfo() {
	System.out.println("Hello Ifzal");
}

public static void main(String[] args) {
	MyInfo shoma = new MyInfo();
	System.out.println(shoma.myAge);
	
}
	
}
