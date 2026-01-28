package Basics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class OccurenceofCharsinAString {

	public static void main(String[] args) {
		
		String str = "Java automation";
		
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        
        for(int i = 0; i < str.length(); i++) {
        	
        	char ch = str.charAt(i);
        	
        	map.put(ch, map.getOrDefault(ch, 0)+1);
        }                
        System.out.println(map);

	}

}
