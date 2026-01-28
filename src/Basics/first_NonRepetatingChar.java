package Basics;

import java.util.HashSet;
import java.util.Set;

public class first_NonRepetatingChar {

	public static void main(String[] args) {

		String str = "aiutomtion";
		Set<Character> s = new HashSet<>();
		char[] arr = str.toCharArray();
		
		for (char c : arr) {
			if(!s.add(c)) {
				System.out.println(c);
				break;
			}
		}
		
	}

}
