package OOPS;

public class Human extends ECG{
	
	public Human() {
		System.out.println("Human Name from Human class ");
	}
	
	
	public Human(int Age) {
		this();
		System.out.println("Human Age : " +Age);
	}

	public static void main(String[] args) {
	
		Human h1 = new Human(14);

	}

}


