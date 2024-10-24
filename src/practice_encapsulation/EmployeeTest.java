package practice_encapsulation;

public class EmployeeTest {
public static void main(String[] args) {
	Employee employee =  new Employee();
	Employee employee2 = new Employee ("Ifzal",42,'M', true);
	System.out.println(employee2.getEmpName() + "\n"+ employee2.getEmpAGe());
}
}
