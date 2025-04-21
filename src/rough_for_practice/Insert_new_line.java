package rough_for_practice;

public class Insert_new_line {
	public static void main(String[] args) {
		System.out.println("My name is Muhammad Ifzal, \nAnd I love steak. ");
		System.out.println("-----------------------------------------------------------");
		System.out.println("\nMy name is Muhammad Ifzal, " +  "\nAnd I love steak. ");
		System.out.println("-----------------------------------------------------------");
		// 4 and 3 gets 1 line space. 2 and 1 gets 2 line space, and word Last Line gets 3 line space.
		System.out.println("5\n4\n3\n\n2\n\n1\n\n\nLast Line!");
		System.out.println("-----------------------------------------------------------");
		System.out.println("5" + "\n4" + "\n3" + "\n\n2" + "\n\n1" + "\n\n\nLast Line!");
	}

}
