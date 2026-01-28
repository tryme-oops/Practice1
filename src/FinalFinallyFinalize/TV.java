package FinalFinallyFinalize;

public class TV {

	public static void main(String[] args) {
		//division1();
		division2();
	}

	public static void division1() {

		try {
			System.out.println("Inside the try block");
			int i = 10;

			int k = i / 0; // division by zero will give us an Arithmetic Exception

		} catch (ArithmeticException e) { // we are catching this Arithmetic Exception in Catch block

			System.out.println("inside the catch block");
		}

		finally { // even after exceptions this finally block will execute
			System.out.println("inside the finally block");
		}

	}

	public static void division2() {
		try {			
			System.out.println("Inside the try block");
			
			int i = 10;

			int k = i / 0; // division by zero will give us an Arithmetic Exception

		} catch (NullPointerException e) {    // But we are catching the Arithmetic Exception with NullPointer exception which is incorrect/improper/error
			System.out.println("Inside the catch block");
		}
		
		finally {            // even though we are catching an improper type exception still finally block will execute
			System.out.println("inside the finally block");
		}
	}

}
