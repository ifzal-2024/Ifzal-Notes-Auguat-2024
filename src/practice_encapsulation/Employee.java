package practice_encapsulation;
//Testing
public class Employee {
	private String empName;
	private int empAGe;
	private char empSex;
	private boolean usCitizen;
	
	public Employee() {
		System.out.println("Employee info Below");
		
		
	}

	public Employee(String empName, int empAGe, char empSex, boolean usCitizen) {
		super();
		this.empName = empName;
		this.empAGe = empAGe;
		this.empSex = empSex;
		this.usCitizen = usCitizen;
	}

	public String getEmpName() {
		return empName;
	}

	public int getEmpAGe() {
		return empAGe;
	}

	public char getEmpSex() {
		return empSex;
	}

	public boolean isUsCitizen() {
		return usCitizen;
	}

	
}
