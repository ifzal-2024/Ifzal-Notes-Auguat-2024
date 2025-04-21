package rough_for_practice;



public class Use_of_new_line_new_tab {
	// variable Declared.
		public String myClassBatch;

		// variables Initialized
		public String myName = "Muhammad Ifzal";
		public int myAge = 44;
		public float myGrade = 3.543f;
		public char myGender = 'M';
		public boolean UsCitizen = true;

		// Constructor Declared.
		public Use_of_new_line_new_tab() {
			System.out.println(":---------This is all about Myself----------------:");

		}

		// method Implemented
		//public void aboutMe() {
			//System.out.println("My Name: " + myName + ", My Age: " + myAge + ", My Grade: " + myGrade + ", My Gender: "
			//		+ myGender + ", US Citizen? " + UsCitizen);
			
		//Drop the Comma and space (", My Age: ")--> ("My Age: ")   and Add \n
		// Add  \t after n-->  \n\t
		public void aboutMe() {
				System.out.println("My Name: " + myName + "\n\tMy Age: " + myAge + "\n\tMy Grade: " + myGrade + "\n\tMy Gender: "
						+ myGender + "/nUS Citizen? " + UsCitizen);
			
		}

		public static void main(String[] args) {

			Use_of_new_line_new_tab ifzal = new Use_of_new_line_new_tab(); // Constructor Initialized
			ifzal.aboutMe(); // method initialized

		}

}
