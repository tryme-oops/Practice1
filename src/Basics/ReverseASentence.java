package Basics;

public class ReverseASentence {
	
	public String reverse(String Sentence) {
		
		String[] str = Sentence.split(" ");
		String rev = "";
		
		for (String w : str) {
			rev = rev +" " + w;
		}
		return rev;
	}

	public static void main(String[] args) {
		
		String sentence = "java selenium tester";
		ReverseASentence r = new ReverseASentence();
		System.out.println(r.reverse(sentence));
	}

}
