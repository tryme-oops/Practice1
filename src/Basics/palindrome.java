package Basics;

public class palindrome {

	public static void main(String[] args) {
		
		String reverse = "";
		String s = "())(";
		
		for(int i = s.length()-1; i>=0; i--) {
			
			reverse = reverse+s.charAt(i);
		}
		
		if(reverse.equals(s)) {
			System.out.println(s + " :word is palindrome");
		}else {
			System.out.println(s + " :word is not palindrome");
		}

	}

}
