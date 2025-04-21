package different_type_of_class_practice;

public class Emp {
	public String empNameString;
	public int empID;
	public char empSex;
	public boolean usCitizen;

	public Emp() {
		System.out.println("-------------Below Employee info-------------");
	}

	public Emp(String empNameString, int empID, char empSex, boolean usCitizen) {
		super();
		this.empNameString = empNameString;
		this.empID = empID;
		this.empSex = empSex;
		this.usCitizen = usCitizen;
		System.out.println("Name: " + empNameString + "\nEmp ID: " + empID + "\nUS Citizen? " + usCitizen
				+ "\nEmployee Sex: " + empSex);
	}

	public Emp(char empSex, boolean usCitizen) {
		super();
		this.empSex = empSex;
		this.usCitizen = usCitizen;
		System.out.println("Name: " + empNameString + "\nEmp ID: " + empID + "\nUS Citizen? " + usCitizen
				+ "\nEmployee Sex: " + empSex);
	}

	public Emp(int empID, String empNameString, char empSex, boolean usCitizen) {
		super();
		this.empID = empID;
		this.empNameString = empNameString;
		this.empSex = empSex;
		this.usCitizen = usCitizen;
		System.out.println("Name: " + empNameString + "\nEmp ID: " + empID + "\nUS Citizen? " + usCitizen
				);
	}

}
