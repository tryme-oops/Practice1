package Basics;

public class RemoveJunkCharsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String s1 = "漢字 #$%$@ Selenium for automation";
		System.out.println(s1.replaceAll("[^a-zA-Z1-9]", ""));  //regular expression syntax (memorize mukhosto korte hobe eta)

	}

}
