package rough_for_practice;

public class Test {
	
		int appId;
		String appName;
		//parameterized constructor with two parameters
		Test(int id, String name){
		this.appId = id;
		this.appName = name;
		System.out.println("Id: "+appId+" Name: "+appName);
		}
		void info(){
		System.out.println("Name: "+appName+ " Id: "+appId);
		}
		public static void main(String args[]){
		Test obj1 = new Test(1101,"Facebook");
		Test obj2 = new Test(23003,"Instagram");
		obj1.info();
		obj2.info();
		}
		

}
