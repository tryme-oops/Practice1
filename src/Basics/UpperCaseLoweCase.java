package Basics;

public class UpperCaseLoweCase {

	public static void main(String[] args) {

		String str = "Priyata Saha";
		int upper = 0;
		int lower = 0;
		String uppercase = "";
		String lowercase = "";

		for (Character ch : str.toCharArray()) {
			if (ch >= 'A' && ch <= 'Z') {
				uppercase = uppercase + ch;
				upper++;
			} else if (ch >= 'a' && ch <= 'z') {
				lowercase = lowercase + ch;
				lower++;
			}
		}

		System.out.println(upper + " : " + uppercase + " and " + lower + " : " + lowercase);

	}

}
