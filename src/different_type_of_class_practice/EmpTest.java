package different_type_of_class_practice;

public class EmpTest {
	public static void main(String[] args) {
		Emp emp01 = new Emp();
		System.out.println("------Below Iqbal Info----");
		Emp iqbal = new Emp("Iqbal", 125, 'M', true);

		System.out.println("----Below Ifzal Info -----");
		Emp ifzal = new Emp('M', true);

		System.out.println("---Below SHoma Info----");
		Emp shoma = new Emp(1245, "Shoma", 'F', true);

		System.out.println("--Salima info below---");
		Emp salima = new Emp('F', true);

	}

}
