package Basics;

public class B extends A {

	public B() {

		System.out.println("Constructor from B!!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Java";
		String b = "Java";

		String a1 = new String("Automation");
		String b1 = new String("Automation");

		System.out.println(a == b);
		System.out.println(a.equals(b));

		System.out.println(a1 == b1);
		System.out.println(a1.equals(b1));
	}

}
