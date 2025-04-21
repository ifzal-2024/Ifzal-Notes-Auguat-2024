package practice_java_read_and_write_exceptions;

import java.security.KeyStore.TrustedCertificateEntry;

public class Practice_B_when_to_use_try_catch_block {
	public static void main(String[] args) {
		int a = 34;
		int b = 0;
		try {
			int division = a / b;
			System.out.println(division);
		} catch (ArithmeticException e) {
			System.out.println("\n---The Exception occured here is >>>>>> " + e);
			System.out.println("\n-----Below e.printStackTrace: packa name---\n");
		e.printStackTrace();
			
		}
		System.out.println("Code is continuing, because exception is handled");

	}


 
}
