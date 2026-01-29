package Basics;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstnonRepeatingChracater {

	public static void main(String[] args) {

		String str = "aabbcdde";

		LinkedHashMap<Character, Integer> h = new LinkedHashMap<>();

		for (char c : str.toCharArray()) {
			h.put(c, h.getOrDefault(c, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : h.entrySet()) {
			
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
				break;
			}

		}

	}

}
