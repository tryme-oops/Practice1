package Basics;

public class reverse {

	public static void main(String[] args) {
		
		String rev = "Interview";
		
		String empty = "";
		
		for(int i = rev.length() -1 ; i >= 0; i--) {
			
			empty = empty + rev.charAt(i);
			
		}
		
		System.out.println("Reverse: " + empty);

	}

}
