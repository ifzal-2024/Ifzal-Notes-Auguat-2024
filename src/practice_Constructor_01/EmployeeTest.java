package practice_Constructor_01;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
	
		System.out.println("---------Ifzal Info-----------------------");
		Employee emp2 = new Employee ("Ifzal", 12345, 'M', true);
		
		System.out.println("------------------- Below Iqbal Info------------");
		Employee iqbal = new Employee('M');
		
	}

}
