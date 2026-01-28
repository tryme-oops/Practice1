package OOPS;

public class calculator extends calculatorOps{

	public calculator(int a, int b) {
		super(a, b);		
	}
	public calculator(int a, int b, int c) {
		super(a, b, c);		
	}
	
	

	public static void main(String[] args) {
		
		calculator c = new calculator(2, 2);
		calculator c1 = new calculator(2, 3, 7);
	}

}
