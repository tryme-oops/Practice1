package OOPS;

public interface Tempus {
	
	private void userLogin() {
		CheckCredentials();
		System.out.println("Login success");
	}
	
	private void CheckCredentials() {
		System.out.println("valid creds");		
		
		
	}
/////////////////////////////		
	 void test();   //by default abstract even if we do not mention
	
	 abstract void CheckCredentials2();   //explicitly mentioned abstract method
 
	 private void test2() {
		 //when private we must add body to the method
	 };
	 
	 static void test3() {
		 //when static method we must add body to the method
	 };
	 
	 default void tes4() {
		 //when default method we must add body to the method
	 };
}
