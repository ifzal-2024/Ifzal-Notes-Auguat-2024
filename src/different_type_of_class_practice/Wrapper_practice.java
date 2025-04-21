package different_type_of_class_practice;

import java.util.PrimitiveIterator.OfDouble;

public class Wrapper_practice {
	public static void main(String[] args) {
		System.out.println("-----------------------Conversion of String to Int---------------------");
		String name1 = "241";
		System.out.println(name1);
		System.out.println(Integer.parseInt(name1) + 200);
		System.out.println("-----Writing differently below to make it shorter-----");
		int newName1 = Integer.parseInt(name1);
		System.out.println(newName1 + 300);
		System.out.println("--COnversion of string to int when not pure number like 100Welcome--");
		String name2 = "100Ifzal";
		// System.out.println(name2+100+ Integer.parseInt(name2)+"shoma" ); // error
		// Can't compile non pure number
		System.out.println("Dog" + name2 + "Shoma" + 100 + " " + 200);

		System.out.println("-----------String to Double---------");
		String name3 = "3.15";
		Double newName3 = Double.parseDouble(name3);
		System.out.println(newName3 + 1.0);

		System.out.println("Conversion of String to Float");
		String name4 = "6.15";
		System.out.println(Float.parseFloat(name4) + 1.0f);

		System.out.println("--COnversion of Characters to Upper or Lower Case-------");
		char sex = 'm';
		char sex2 = Character.toUpperCase(sex);
		System.out.println(sex2);
		// or You can write directlty below
		char Sex3 = Character.toLowerCase('F');
		System.out.println(Sex3);

		System.out.println("-----------------Conversion of STring to Coolean");
		String employe1 = "tRuE";
		System.out.println(Boolean.parseBoolean(employe1));
		String employee2 = "FalSe";
		System.out.println(Boolean.parseBoolean(employee2));
		String employee3 = "";
		System.out.println(Boolean.parseBoolean(employee3));
		String emplyee4 = "Shoma";
		System.out.println(Boolean.parseBoolean(emplyee4));
		
		System.out.println(" --Conversion from into to String --");
		int ifzalAge=24;
		System.out.println(10+10+String.valueOf(ifzalAge)+20+(5+5)+"welcome");
		
		

	}

}
