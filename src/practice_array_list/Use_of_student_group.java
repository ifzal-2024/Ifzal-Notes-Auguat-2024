package practice_array_list;

import java.util.ArrayList;

public class Use_of_student_group {
	public static void main(String[] args) {
		Student s1 = new Student("Alex", 23, "Yu");
		Student s2 = new Student("Elena", 22, "Zu");
		Student s3 = new Student("Michael", 25, "Hard");
		// Student is Object below just like how we used charcater, Integer etc
		// This Student have datas like("Alex",23,"Yu") -- ("Elena",22,"Zu") etc etc
		ArrayList<Student> ar = new ArrayList<>();
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);

		// print by using for each loop/enhanced for loop/advanced for loop
		System.out.println(
				"\n------------- Accessing the elements of the specified arrayList by using for each loop -------------");
		for (Student st : ar) { // st is a container, where to put the value from the below loop
			System.out.println(st.fName + ", " + st.age + ", " + st.lName);
		}

	}

}
