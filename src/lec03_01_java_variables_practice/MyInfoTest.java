package lec03_01_java_variables_practice;

public class MyInfoTest extends MyInfo{

//public class MyInfoTest extends MyInfo {
	public static void main(String[] args) {
	MyInfo tofael = new MyInfo();
	
	tofael.myInfo();//Why tofael cannot call?
	

//		System.out.println(ifzal.myName);
//		System.out.println(ifzal.myAge);
//		ifzal.myself();
		MyInfoTest ifzal2 = new MyInfoTest();
		ifzal2.ifzalinfo();
		System.out.println (ifzal2.myName);
		ifzal2.myInfo();
		
		
	}

}
