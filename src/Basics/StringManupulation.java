package Basics;

public class StringManupulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Rain has started here at sydney soon";
		
		System.out.println("2nd s index: " +s.indexOf("s", s.indexOf("s")+1));                     //return the index of 2nd 's'
		
		System.out.println("3nd s index: " +s.indexOf("s", s.indexOf("s", s.indexOf("s")+1)+1));     //return the index of 3rd 's'
	
		

	}

}
