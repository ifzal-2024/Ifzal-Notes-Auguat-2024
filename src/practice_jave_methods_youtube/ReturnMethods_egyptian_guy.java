package practice_jave_methods_youtube;



public class ReturnMethods_egyptian_guy {
	
//public static int sum(int x, int y) {
	// this is  integer type which will return integer
	// method name is sum
	// has 2 parameters x and y which are the name of variables
	// varaibles declared inisde paranthesis (int x, int y)--> 
//parameters are local varaibles so that we can use variable x and variable y iniside the method body
	
	//int  sum= x+y;
	// I am  declaring a local variable called sum which will be additon of x and y parameters.
	// Then it will be stored in sum 
	//Later on it can be returned and be accessed this value and do whatever we want, for eg. we can print it or sore it in a variable
	//return sum;
	// Different way to write this --> 
	public static int sum(int x, int y) {
	return x+y;
	}
public static void main(String[] args) {
	System.out.println("message1");// compiler prints message1 
	System.out.println(sum(1, 2)); // sum(1,2) matches int x, int y --> goes inside that method--> return x+y --> 1+2= 3 --> return to mainsyso (sum(3))--> so we are printing the return value of sum method
	System.out.println("message2");// then compiler prints message2
}	


}
