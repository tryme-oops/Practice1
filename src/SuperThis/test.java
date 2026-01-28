package SuperThis;

import java.util.HashMap;
import java.util.Map;

public class test implements intefaceA {
	
	@Override
	public void car() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		intefaceA.rage();
		
		Map<Character, String> map = new HashMap<Character, String>();
		
		map.put('A', "Apple");
		map.put('B', "Ball");
		map.put('C', "Cat");
		
		
		for (Map.Entry<Character, String> entry : map.entrySet()) {
		    System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
		
	}



}
