package practice_jave_methods_youtube;

public class VoidMethods_egyptian_guy {
	// We will use public. A public method  can be accessed from outside class, we make  static so that we can call from inside main method
	public static void sayHi() {
		// this method does not return a vlaue, this method does not take  paramters  (nothing inside parenthesis)
		System.out.println("Hi");
	}

	
	public static void main(String[] args) {
		// execution will be --> message1 
		//Hi
		//message 2
		System.out.println("message1");
		sayHi();
		System.out.println("message2");
	}
	
}
