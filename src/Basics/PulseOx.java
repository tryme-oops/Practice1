package Basics;

public class PulseOx extends ECG{
	
	
	static int i = 10;
	
	public PulseOx() {	
	
		System.out.println("Normal Oxygen level is: 99%");
	}
	public PulseOx(int HR) {
		this();
		System.out.println("From PulsoX" + HR);
	}
	
	public static void main(String[] args) {		
//		PulseOx p = new PulseOx();
		PulseOx p2 = new PulseOx(90);  // i = 16
	}

}
