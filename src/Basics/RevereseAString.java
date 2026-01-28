package Basics;

import OOPS.Scap;

//String class is a immutable, reverse function is not available.
//String buffer class is mutable. reverse function is available.

// YOU GOT THIS

public class RevereseAString extends Scap {
	
	public  String RevereseAString(String str) {        //this is a constructor (Parameterized constructor) 
		
		String rev = "";
		for(int i = 0; i < str.length(); i++ ) {
			rev = rev + str.charAt(i);
		}
		return rev;
	}
		
	public static void main(String[] args) {
		
		String Str = "Selenium";
		
		RevereseAString a = new RevereseAString();
		System.out.println("Not Using String Buffer: " + a.RevereseAString(Str));
		
		        //Using String class only
		
		//Using String Buffer class
		
		StringBuffer sb = new StringBuffer(Str);
		System.out.println("Using String Buffer Class: " + sb.reverse());
		
	}
	
}





