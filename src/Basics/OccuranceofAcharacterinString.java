package Basics;

public class OccuranceofAcharacterinString {

	public static void main(String[] args) {
		
		String str = "java automation";
		
		int length = str.length();
		
		int lengthA = str.replace("a", "").length();
		
		System.out.println(length - lengthA);

	}

}
