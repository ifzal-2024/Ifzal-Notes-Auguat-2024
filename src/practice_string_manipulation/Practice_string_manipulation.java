package practice_string_manipulation;

import java.util.Arrays;

class Practice_string_manipulation {
	public static void main(String[] args) {
		String s = "hello Ifzal hello Shoma";// counts characters
		System.out.println(s);
		System.out.println(s.length());
		System.out.println("Last Character Index Position: "+(s.length()-1));
		

		System.out.println("\n----------LowerCase-------------\n");
		System.out.println(s.toLowerCase());

		System.out.println("\n----------Upper Case------\n");
		System.out.println(s.toUpperCase());
		System.out.println(s); // String is immutable. After modfications to UpperCase value of s is still same

		System.out.println("\n----------------------------charAt() character value at the specified index---------\n");
		System.out.println("CHaracter at Position 0 is: " + s.charAt(0));
		System.out.println("CHaracter at Position 6 is:  " + s.charAt(6));
		System.out.println("Character at Last Position (s.length())-1)--> 23-1=22: ");
		System.out.println("Last Character Index Position: "+(s.length()-1));
		System.out.println("Character at Posiion 22: "+ s.charAt(22));
		// Below  out of Bound Exception because Nothing at Position 23
		//System.out.println("Character at Position 23: "+ s.charAt(23));

		System.out.println("/n----------------- 1st occurence of substring or character ------------------\n");
		System.out.println("The index of 'dolor' word is in : " + s.indexOf("hello"));
		System.out.println("The first occurence of h: " + s.indexOf('h'));
		System.out.println("first hello at :" + s.indexOf("Hello"));

		System.out.println("\n--------------------Last Occurence of character or substring-----\n");
		System.out.println("1st occurence of h is: " + s.indexOf('h'));
		System.out.println("the last occurence of h is: " + s.lastIndexOf('h'));
		System.out.println(s.lastIndexOf("hello"));
		System.out.println(s.lastIndexOf("Hello"));

		System.out.println("\n-------------- subString() method--------\n");
		System.out.println("substring() at 12 index = hello: " + s.substring(12));
		System.out.println("substring with begin index and end index: " + s.substring(12, 22));

		System.out.println("\n---------------2nd occurence of character-- very Important---");
		System.out.println("The first 'o' character is - at the position of: " + s.indexOf('o'));
		//Below Very Important For Interview -2nd Occurence
		System.out.println("The second 'o' character is at the positon of: " + s.indexOf('o', s.indexOf('o') + 1));
		System.out.println("The 3rd occurence of 'o' chcracter is at position: "
				+ s.indexOf('o', s.indexOf('o', s.indexOf('o') + 2) + 1));

		System.out.println("\n ------------  Equals Method (Case Sensitive)-----------------\n ");
		String s1 = "My name is John. ";
		String s2 = "My name is John. ";
		String s3 = "my name is john. ";
		String s4 = "MY NAME IS JOHN. ";
		System.out.println("is s1=s2: " + s1.equals(s2));
		System.out.println("Is s1 = s3? :" + s1.equals(s3));
		System.out.println("is s1=s4? :" + s1.equals(s4));

		System.out.println("\n------------for int we use == -------------------\n");
		// == is used in int, int can't use equal()
		int i = 20;
		int j = 20;
		int k = 25;
		System.out.println(i == j);
		System.out.println(i == k);
		System.out.println(j == k);
		// equals() is not used for int type, used for String Type only
		// How about String
		// We can also use == equal to ---> to compare 2 string, but need to be careful
		// for line 68
		System.out.println("\n-----------String s1==s2 -----------------\n");
		System.out.println(s1 == s2);
		System.out.println("Is it True? Ans: " + s1 == s2);
		// System.out.println("Is it True? Ans: " + s1); // outcome: Is it True? Ans: My
		// name is John.
		// Why false? get it? because "Is it True? Ans: " + s1 ----> is concatenating
		// -->
		// Is it True? Ans: My name is John. --> comparing with s2--> ofcourse it will
		// be false
		// We can write below as in line number 76
		System.out.println("Is it True? Ans: " + (s1 == s2));
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);

		s1 = "My name is John. ";
		s2 = "My name is John. ";
		s3 = "my name is john. ";
		s4 = "MY NAME IS JOHN. ";

		System.out.println("\n--------s3.equals() CAse sensitive , Not mix ---how can solve?-----------\n");
		System.out.println(s3.equals(s4)); // how we can solve that issue? one way below -
		// Using 2 String methods together. first convert them to upper or lower case,
		// then compare
		// This only works when a sentence is not mix ( all words lower case or all
		// words uppercase)
		System.out.println(s3.toUpperCase().equals(s4));
		System.out.println(s4.toLowerCase().equals(s3));

		System.out.println("\n-----------S3.equals() CAse Sensitive mix upper case lower case ---how solve--?-\n");
		String s5 = "my Name is John. "; // when one word upper another lower--> solution: Make both same.
		String s6 = "MY name IS JOHN. "; // here, name is not Upper case
		System.out.println(s5.toUpperCase().equals(s6)); // false
		System.out.println(s5.toUpperCase().equals(s6.toUpperCase()));
		System.out.println(s5.toLowerCase().equals(s6.toLowerCase()));

		System.out.println("\n-------------equalsIgnoreCase()-----------------------\n");
		s3 = "my Name is John. ";
		s4 = "MY NAME is JOHN. ";
		// Two strings are considered equal ignoring case if they are of the same length
		// and corresponding characters in the two strings are equal ignoring case.
		System.out.println(s3.equals(s4)); // how that can be solved? one way below -
		System.out.println(s3.equalsIgnoreCase(s4)); // Important: needed for framework

		System.out.println("\n---------------------------Trim Method -leading/trailing------------------------\n");
		// Interview Question
		// The java string trim() method eliminates leading(beginning) and trailing(at
		// the end) spaces.
		// (interview question)
		// To avoid white space: trim() us used -- (it remove any leading and trailing
		// whitespace)
		String s7 = "         HelloWorld.        ";
		System.out.println("Before Trim: " + s7);
		System.out.println("After Trim: " + s7.trim());
		System.out.println("\n-----------Trim can't replace space between words-------------\n");
		// can't remove white space Between Words
		String s8 = "    Hello       World!    ";
		System.out.println("Before Trim: " + s8);
		System.out.println("After Trim: " + s8.trim()); // Please see solution below
		System.out.println("\n------------replace()-----------\n");
		// The java string replace() method returns a string replacing all the old char
		// or CharSequence to new char or CharSequence.
		// To replace we use replace() method
		// Returns a string resulting from replacing all occurrences of oldChar in this
		// string with newChar.
		// interview question
		String s9 = "Good morning ma";
		System.out.println("Before replace: " + s9);
		System.out.println(s9.replace('m', 'M'));
		// Issue is,it will change the specific character everywhere
		System.out.println("After replacing by Character: " + s9.replace('m', 'M'));
		// When its more than 1 letter, it becomes string.Use double Quotation when
		// replacing String.
		System.out.println("After replacing by Character: " + s9.replace("ma", "Mom"));
		System.out.println("\n----------Using Trimming and Replacing together-----\n");
		// replace() can't trim
		String s10 = "      GooD    MoRning      ";
		System.out.println("Replacing can't move white space: " + s10.replace('D', 'd'));
		// We can use trim() nad replace() together.
		// trim= removed leading and trailing white space, we used replace to replace "D
		// Mor",
		// to "d Mor" --> this way we have elinimated white space in between words too
		// indirectly.
		// Trick is to Select word you want to replace includes the original white
		// space.
		// Just Copy from Original as it including white space.
		System.out.println("After triming and replacing: " + s10.trim().replace("D    MoR", "d Mor"));
		// or you can do below, will have same result
		System.out.println("After triming and replacing: " + s10.trim().replace("D    MoRning", "d Morning"));

		System.out.println("\n---------------replaceAll()---------------\n");
		// REplace whole thing white space words.
		String s11 = "      Good    MoRning      ";
		System.out.println("Before replacing: " + s11);
		System.out.println("After replacing: " + s11.replaceAll("      Good    MoRning      ", "Good Morning"));
		System.out.println("After replacing: " + s11.replaceAll("      Good    MoRning      ", "Hello Ifzal"));

		System.out.println("---Solution to removing white space in the middle--3 different ways----");
		s8 = "    Hello       World!    ";
		// 1st way : Here copied white space b/w hello and world and replaced with only
		// one space
		System.out.println("After triming and replacing: " + s8.trim().replace("       ", " "));
		// or 2ndway : Copy white space and word then trim and replace
		System.out.println("After triming and replacing: " + s8.trim().replace("       World!", " World!"));

		System.out.println("\n---------Other 3 Examples of ReplaceAll--------------\n");
		// Other 3 examples of replaceAll()
		String s12 = "Hello! Let's learn together";
		System.out.println("After replacing a word: " + s12.replace("Hello!", "Welcome to Java."));

		System.out.println("\n------------Very Import--------date.replace / to - --------------------------\n");
		String dateOfToday = "09/22/2024"; // very much used
		System.out.println("After replacing: " + dateOfToday.replace('/', '-'));

		System.out.println("\n------Typing s12 instead of whole statement--------------------\n");
		s12 = "Hello! Let's learn together";
		// The java string replaceAll() method returns a string replacing all the
		// sequence of characters matching regex and replacement string.
		// below if you wanna replace everything, you can simply type (s12, "replaced by
		// what word");
		System.out.println("Before replacing all: " + s12);
		System.out.println("After replacing all, the complete String is: " + s12.replaceAll(s12, "Hey Hey Captain"));
		System.out.println("\n-----------Regular way of concatenation-----------\n");
		// regular way of concatenation
		System.out.println("Hello" + " World!");
		// s1 = "My name is John. ";
		// s12 = "Hello! Let's learn together";
		System.out.println(s1 + s12);

		System.out.println("\n-----------------concat()---------------------\n");
		// Concatenation
		// The Java String class concat() method combines specified string at the end of
		// this string. It returns a combined string.
		String s13 = "My name is ";
		String s14 = "Tofael";
		System.out.println(s13.concat(s14));

		System.out.println("\n------------------Array String Type----------------------\n");
		// Important
		// An Array is a collection of same data type
		// How to write an Array: first data type, then [] container,
		// then array name = data separated by comma inside the curly braces, ended up
		// with semicolon
		// Arrays(plural) is a class to manipulate Array
		String[] allPresident = { "Joe Biden", "Donald Trump", "Barack Obama", "George Bush Jr", "Bill Clinton" };
		// We can;t call array directly , See below
		// System.out.println(allPresident);--> Prints Array ID -->
		// [Ljava.lang.String;@123a439b
		// We will use Arrays class to print Names.
		// when you type from Popp up choose --> Arrays-java.util --> .toStringBoolean
		System.out.println(Arrays.toString(allPresident));

		System.out.println("\n---Array Other date Types-----\n");
		// other Array example
		int[] age = { 23, 54, 12, 66, 88, 23, 80, 43 };
		char[] gender = { 'M', 'M', 'M', 'F', 'M' };
		boolean[] fullTimeStudent = { true, true, false, true, false };
		System.out.println(Arrays.toString(age));

		System.out.println("\n-Important---- convert a String to a String Array---split()---------\n");
		// Tough: 2, will be used for Java coding challenge, very very important
		// interview question + coding challenge
		// in short, split() method ---> convert a String to a String Type Array, comma
		// separated word by word
		// the array of strings computed by splitting this string around matches of the
		// given regular expression
		String str1 = "Mr owl ate my metal worm";
		String[] wordByWord = str1.split(" ");// There should be a "single space" (" ")in String
		// System.out.println(wordByWord); // It will give us Array ID
		// This will not show correct outcome, because "Arrays" class is needed for
		// Array manipulation
		// Arrays is a class, need to import and used to manipulate Array. you can't
		// print Array without the help of Arrays class
		System.out.println(Arrays.toString(wordByWord));

		System.out.println("\n---- convert a String to a character Array ------toCharArray()---------\n");
		// ***Tough: 3, will be used for Java coding challenge, very very important
		// interview question + coding challenge
		// we use toCharArray() method to create an Array from String [which is
		// character type]
		// comma separated character By Character
		String str2 = "Mr owl ate my metal worm";
		char[] characterByCharacter = str2.toCharArray();
		System.out.println(Arrays.toString(characterByCharacter));

		System.out.println("\n --------------contains()--------Case Sensitive-----space sensitive--------\n");
		// ****Easy, needed for framework
		// The Java String class contains() method searches the sequence of characters
		// Is Case Sensitive
		// in this string. This is used as method in many places
		// If present will return true and if absent will return False.
		String s15 = "How much you know about Java?";
		System.out.println(s15.contains("much"));
		System.out.println(s15.contains("Much")); // case sensitive
		System.out.println(s15.contains("How much y"));// Space sensitive Must have same space b/w much and y
		System.out.println(s15.contains("How much z"));
		System.out.println(s15.contains("about"));
		System.out.println(s15.contains("hello"));
		System.out.println(s15.contains("java?"));

		System.out.println("\n ------startsWith()---- Case Sensitive---------\n");
		// Easy
		// The java string startsWith() method checks if this string starts with given
		// prefix.
		// can match whole word or letter.
		// While using single Letter, double quotation needed.
		// from pop choose starts with(String prefix):boolean-String
		String s16 = "java by Oracle";
		System.out.println(s16.startsWith("java"));
		System.out.println(s16.startsWith("j"));
		System.out.println(s16.startsWith("Java"));
		// The Java String class endsWith() method checks if this string ends with a
		// given suffix.
		// can match whole word or letter.
		System.out.println("\n --------------endsWIth()------Case Sensitive---------\n");
		System.out.println(s16.endsWith("e"));
		System.out.println(s16.endsWith("E"));
		System.out.println(s16.endsWith("oraclE"));
		System.out.println(s16.endsWith("Oracle"));

		System.out.println("\n ---------isEmpty()----Checks if empty------------------");
		// ***used in framework
		// The Java String class isEmpty() method checks if the input string is empty or
		// not.
		String s17 = "";
		String s18 = " "; // White space, not empty
		String s19 = "Java";
		System.out.println(s17.isEmpty());
		System.out.println(s18.isEmpty());
		System.out.println(s19.isEmpty());

		System.out.println("\n -------String.valueOf()-------------------\n");
		// Important Interview question
		// The java String.valueOf() method converts int type of values into string.
		// how to turn int, float etc. to String
		int age4 = 30;
		System.out.println(age4 + 10);
		String s20 = String.valueOf(age4); // formula, learned in Wrapper class how to convert a int to String
		System.out.println(s20);
		System.out.println(s20 + 10);

		System.out.println("\n--------compareto()---------------\n");
		// not important
		// compareTo() Compares two strings lexicographically. never used
		// Next one is Method name ---> compareTo();
		// A to Z = Ascending--> - value
		// Z to A= Descending---> + value
		// if 1st letter same, go to next letter , once its different stop and give a
		// value + or-
		// if whole word is same , then value =0

		String s21 = "hello";
		String s22 = "meklo";
		String s23 = "hemlo";
		String s24 = "cat";
		String s25 = "hello";
		String s26 = "Hello"; // every character have a value based on ASCII Table, h=104, H=72
		System.out.println(s21.compareTo(s25));// hello-hello--> 0 because both are equal
		System.out.println(s21.compareTo(s22)); // -5 because "h" is 5 times lower than "m"
		// hello vs hemlo ---> h=h, e=e, l not equal to m ---> A to Z = -ve value
		System.out.println(s21.compareTo(s23)); // -1 because "l" is 1 times lower than "m"
		System.out.println(s21.compareTo(s24)); // 5 because "c" is 5 times lower than "h"
		// Below No need to Rember
		System.out.println(s21.compareTo(s26)); // 32, every character have a value based on ASCII Table, h=104, H=72

		System.out.println("\n---------------------------join ---------------------------------------------\n");

		// Not Important
		// The String.join() method is a static method in the String class that
		// concatenates one or more strings with a delimiter added between each String.
		// This method joins the passed string with the delimiter passed to return a
		// single string.
		// From PopUp --> String.join(charsequence delimeter, char sequence elements)
		String delimiter = "-";
		String result = String.join(delimiter, "Espresso", "is", "Good");
		System.out.println(result);
		/*
		 * String.join() method is used to combine multiple Strings(in this
		 * case,"Expresso", "is","Good") into one String, with a delimeeter placed
		 * between each word. The delimeter here is hyphen("-") delimeeter means
		 * character or symbol 1) String delimeter="-" ; You define a hyphen "-" as a
		 * delimeter. This will be placed between each word when they are joined
		 * together. 2)String.join(delimiter, "Espresso", "is", "Good");.... The
		 * String.join () method combines word Expresso, is and GOod with "-" between
		 * them Syso prints the final result.
		 */

		// You can also type like below without defining the delimeter.
		String fruitCombined = String.join("/", "apple", "banana", "cherry");
		System.out.println(fruitCombined);

	}

}
