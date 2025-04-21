package practice_lec06_02_java_basic_interview_question;

public class EmployeeTest {
	public static void main(String[] args) {
		// You can write Employee4 . Nothing to import bcos same package.
		Employee4.employee();
		
		// Can't call static variable directly with Class Name. Must USe syso.
		System.out.println(Employee4.empId);
		
		
		//Can't call method directly from A different class inside same Package.
		//employee();
  
		Employee4 emp=  new Employee4();
		// when calling variable with object , have to use with syso
		//employee4.ifzalBirthYear;
		System.out.println(emp.ifzalBirthYear);
	}

}
