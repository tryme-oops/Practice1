package OOPS;

import java.util.ArrayList;

public class Scap {
	
	static int c;
	
	 protected static void testStatic() {
		System.out.println("inside static method!!");
	}
	
	public static void main(String[] args) {
		
		String arr[] = {"Jan", "Feb", "March"};
				
		String rev[] = new String[arr.length];
		
		
		for(int i = arr.length-1; i>= 0; i--) {				
			
			rev[c] = arr[i];
			c++;
		}
		
		for(int i = 0; i < rev.length; i++) {
			System.out.println(rev[i]);
		}
		
		System.out.println(c);
	}

}
