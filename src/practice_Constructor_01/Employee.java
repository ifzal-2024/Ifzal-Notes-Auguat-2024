package practice_Constructor_01;



public class Employee {
	// declaring global variables
	public String empName;
	public int empId;
	public char empGender;
	public boolean fullTimeEmp;
	
	
	public Employee() {
		System.out.println("I am a Constructor from EMployee Class");
		
	}


	public Employee(String workerName, int empId, char empGender, boolean fullTimeEmp) {
		super();
		this.empName = workerName;
		this.empId = empId;
		this.empGender = empGender;
		this.fullTimeEmp = fullTimeEmp;
		System.out.println("Employee Name: " + workerName + "\nEmployee ID: " + empId+ "\nEmployee Gender: "  + empGender + "\nFull TIme? " + fullTimeEmp);
	
		
	}


	public Employee(char empGender) {
		super();
		this.empGender = empGender;
		System.out.println("Employee Name: " + empName + "\nEmployee ID: " + empId+ "\nEmployee Gender: "  + empGender + "\nFull TIme? " + fullTimeEmp);
		
	}
	
	
	

}
