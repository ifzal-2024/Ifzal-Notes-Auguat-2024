package rough_for_practice;

import practice_lec06_02_java_basic_interview_question.Employee4;

public class EmplopyeeTest2 {
	
	public void NonStatMethod() {
	// can't call method directly	
	//employee();
		
	//Can Call with Class.Method though
	Employee4.employee();
	}
	
public static void main(String[] args) {
	// You can call properties of other class by the newly created object of that class.		
	// emp object belongs to Employee4 Class created in TestClass.
	Employee4 emp = new Employee4();
	// If different class or package
	// You cannot directly call Static method or variables
	//employee();
	//empID
	
	// Can't call Static method  with object. Will give Yellow warning 
	// Better to call with class name.
	System.out.println("--- accessing static method with object-------");
	emp.employee();
	System.out.println("---------accessing static method with Class Name----");
	Employee4.employee();
	
	System.out.println("------\nCant call variable directly with Class Name--- Have to use syso---");
	//You cannot call a variable directly with Class Name
	// Must use syso
	//Employee4.empName;
	System.out.println(Employee4.empId);
	
	System.out.println("------Can't call Varaible directly with Object--- Have to use Syso-----");
	//Can't call variable directly with object. Must use syso.
	//emp.ifzalBirthYear;
	System.out.println(emp.ifzalBirthYear);
	
	
	
}
	

}





















	